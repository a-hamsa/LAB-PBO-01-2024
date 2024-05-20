import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Main {
    static ArrayList<Karyawan> listKaryawan = new ArrayList<>();
    static Kehidupan [] kehidupan = new Kehidupan[5];
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        runApp();
    }

    static void runApp() {
        System.out.println("Menu: ");
        System.out.println("a. Tambah data karyawan");
        System.out.println("b. Tampilkan detail keryawan");
        System.out.println("c. Keluar");
        System.out.print("Pilih opsi (a-c): ");

        String selectMenu = sc.nextLine();

        switch (selectMenu) {
            case "a":
                tambahDataKaryawan();
                break;
            case "b":
                detailKaryawan();
                break;
            case "c":
                System.out.println("=============================================");  
                System.out.println("Terima Kasih telah menggunakan aplikasi kami.");
                System.out.println("=============================================");
                System.exit(0);
                break;
            default:
                System.out.println("=========================");
                System.out.println("Input harus berupa huruf.");
                System.out.println("=========================");
                runApp();;
        }
    }

    static void tambahDataKaryawan() {
        Pengalaman pengalaman = new Pengalaman();
        Pendidikan pendidikan = new Pendidikan();
        Projek projek = new Projek();
        Keluarga keluarga = new Keluarga();
        Karyawan karyawan = new Karyawan();
        

        int gaji = 0;
        String jabatan = "";

        String nama = inputNama();
        karyawan.setNama(nama);

        int umur = inputUmur();
        karyawan.setUmur(umur);

        System.out.println();
        System.out.println("Detail Keluarga: ");
        int[] detailKeluarga = inputDetailKeluarga();
        keluarga.infoKeluarga(detailKeluarga[0], detailKeluarga[1], detailKeluarga[2]);

        System.out.println();
        System.out.println("Pengalaman sebelumnya: ");
        System.out.println("1. Freelancer");
        System.out.println("2. Magang");
        System.out.println("3. Pekerja Tetap");
        System.out.println("4. Tidak ada");

        int selectPengalaman = inputPengalamanKerja(); 
        System.out.println();

        if (selectPengalaman == 1 || selectPengalaman == 2 || selectPengalaman == 3) {
            gaji = inputGaji();
        } 

        pengalaman.jenisPekerjaan(selectPengalaman);

        int banyakBerorganisasi = inputPengalamanOrganisasi();
        pengalaman.organisasi(banyakBerorganisasi);

        String pendidikanTerakhir = inputPendidikan();
        pendidikan.lulusan(pendidikanTerakhir);

        System.out.println();
        System.out.println("Projek IT");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Lebih dari 15");
        int selectProjek = inputBanyakProjek(); 
        projek.brpbanyakProjek(selectProjek);
        

        if ( umur < 18 || pendidikanTerakhir.equals("SD") || pendidikanTerakhir.equals("SMP") || selectProjek == 1 || banyakBerorganisasi <= 0) {
            System.out.println("==============================");
            System.out.println("Karyawan tidak memenuhi syarat");
            System.out.println("==============================");
            putarSuara(false);
        } else {
            if (selectPengalaman == 1 || selectPengalaman == 2) {
                if ((selectProjek == 4) && (pendidikanTerakhir.equals("S1") || pendidikanTerakhir.equals("S2") ||pendidikanTerakhir.equals("S3"))) {
                    gaji = gaji * 5;
                    jabatan = "Engineer Senior";
                } else if (selectProjek == 4 || selectProjek == 3 || (selectProjek == 2 && (pendidikanTerakhir.equals("S1") || pendidikanTerakhir.equals("S2") || pendidikanTerakhir.equals("S3")))) {
                    gaji = gaji * 3;
                    jabatan = "Engineer";
                }else {
                    gaji = gaji * 2;
                    jabatan = "Staff";
                }
            } else if ( selectPengalaman == 3) {
                if (selectProjek == 4 && (pendidikanTerakhir.equals("S2") || pendidikanTerakhir.equals("S3"))) {
                    gaji = gaji * 12;
                    jabatan = "Manager Senior";
                } else if ((selectProjek == 3 || selectProjek == 2) && (pendidikanTerakhir.equals("S2") || pendidikanTerakhir.equals("S3"))) {
                    gaji = gaji * 8;
                    jabatan = "Manager";
                } else if ((selectProjek == 4 && pendidikanTerakhir.equals("SMA") || pendidikanTerakhir.equals("SMK")) || pendidikanTerakhir.equals("S1") || pendidikanTerakhir.equals("S2") || pendidikanTerakhir.equals("S3")) {
                    gaji = gaji * 5;
                    jabatan = "Engineer Senior";
                } else {
                    gaji = gaji * 3;
                    jabatan = "Engineer";
                }
            } else {
                if (selectProjek == 4 && pendidikanTerakhir.equals("S3")) {
                    gaji = gaji * 5;
                    jabatan = "Engineer Senior";
                } else if ((selectProjek == 4 && (pendidikanTerakhir.equals("S1") || pendidikanTerakhir.equals("S2"))) || (selectProjek != 4 && pendidikanTerakhir.equals("S3"))) {
                    gaji = gaji * 3;
                    jabatan = "Engineer";
                } else {
                    gaji = gaji * 2;
                    jabatan = "Staff";
                }
            }
            
            karyawan.setGaji(gaji);
            karyawan.setJabatan(jabatan);
            listKaryawan.add(karyawan);


            kehidupan[0] = pengalaman;
            kehidupan[1] = pendidikan;
            kehidupan[2] = projek;
            kehidupan[3] = keluarga;
            
            System.out.println("===========================");
            System.out.println("Selamat, karyawan diterima!");
            System.out.println("===========================");
            putarSuara(true);
        }
        runApp();
    }

    static void detailKaryawan() {
        if (listKaryawan.isEmpty()) {
            System.out.println("=======================");
            System.out.println("Belum ada data karyawan");
            System.out.println("=======================");
        } else {
            for (int i = 0; i < listKaryawan.size(); i++) {
                listKaryawan.get(i).displayinfo(); 
            }
            while (true) {
                System.out.println("=======================");
                System.out.println("Lihat detail kehidupan? ");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Input: ");
    
                try {
                    int selectMenu2 = sc.nextInt();
                    sc.nextLine();
                    if (selectMenu2 == 1) {
                        System.out.println("Detail Kehidupan: ");
                        kehidupan[3].prosesKehidupan();
                        kehidupan[1].prosesKehidupan();
                        kehidupan[0].prosesKehidupan();
                        kehidupan[2].prosesKehidupan();
                        break; 
                    } else if (selectMenu2 == 2) {
                        break;
                    } else {
                        System.out.println("Input tidak valid. Silahkan masukkan 1 atau 2.");
                    }
                } catch (Exception e) {
                    System.out.println("Input tidak valid. Silahkan masukkan 1 atau 2.");
                    sc.nextLine(); 
                }
            }
        }
        runApp();
    }

    static void putarSuara(boolean hasil){
        if (hasil){
            try {
                File musiclocation = new File("succes.wav");
    
                if (musiclocation.exists()){
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musiclocation);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInput);
                    clip.start();
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e){

                    }
                } else {
                    System.out.println("Tidak ada");
                }
            } catch (Exception e){
                System.out.println(e);
            }
        } else {
            try {
                File musiclocation = new File("fail.wav");
    
                if (musiclocation.exists()){
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musiclocation);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInput);
                    clip.start();
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e){
                        
                    }
                } else {
                    System.out.println("Tidak ada");
                }
            } catch (Exception e){
                System.out.println(e);
            }
        }
        
    }

    static String inputNama() {
        System.out.print("Masukkan nama: ");
        String input = sc.nextLine().toLowerCase();

        if (input.isEmpty()) {
            System.out.println("Nama lengkap masih kosong. Silahkan coba lagi.");
            return inputNama();
        } else {
            String[] pisah = input.split("\\s+");
            String nama = "";

            for (int i = 0; i < pisah.length; i++) {
                String huruf = pisah[i].substring(0,1).toUpperCase();
                nama += huruf + pisah[i].substring(1) + " ";
            }
            return nama;
        } 
    }

    static int inputUmur() {
        try {
            System.out.print("Masukkan umur: ");
            int umur = sc.nextInt();
            sc.nextLine(); 
            return umur;
        } catch (Exception e) {
            System.out.println("Inputan harus bersifat angka. Silahkan coba lagi.");
            sc.nextLine();
            return inputUmur();
        }
    }

    static int inputGaji() {
        try {
            System.out.print("Gaji sebelumnya: ");
            int gaji = sc.nextInt();
            sc.nextLine();
            return gaji;
        } catch (Exception e) {
            System.out.println("Inputan harus bersifat angka. Silahkan coba lagi.");
            sc.nextLine();
            return inputGaji();
        }
    }

    static int[] inputDetailKeluarga() {
        int status = 0, anak = 0, jumlah = 0;
        try {
            System.out.println("Status : ");
            System.out.println("1. Menikah");
            System.out.println("2. Belum menikah");
            System.out.print("Input: ");
            status = sc.nextInt();
            sc.nextLine();

            if (status == 1) {
                System.out.print("Jumlah anak: ");
                anak = sc.nextInt();
                sc.nextLine();
            } else if (status == 2) {
                System.out.print("Jumlah anggota keluarga: ");
                jumlah = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Input tidak valid. Silahkan masukkan 1 atau 2.");
                return inputDetailKeluarga(); 
            }
            
        } catch (Exception e) {
            System.out.println("Inputan harus bersifat angka. Silahkan coba lagi.");
            sc.nextLine();
            return inputDetailKeluarga();
        }
        return new int[] {status, anak, jumlah};
    }

    static String inputPendidikan() {
        System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
        String pendidikanTerakhir = sc.nextLine();
        if (pendidikanTerakhir.equals("SD") || pendidikanTerakhir.equals("SMP") || pendidikanTerakhir.equals("SMA") || pendidikanTerakhir.equals("SMK") || pendidikanTerakhir.equals("S1") || pendidikanTerakhir.equals("S2") || pendidikanTerakhir.equals("S3")){
            return pendidikanTerakhir;
        } else {
            System.out.println("Isi data dengan benar. Silahkan coba lagi.");
            return inputPendidikan();
        }
    }

    static int inputPengalamanKerja() {
        try {
            System.out.print("Input: ");
            int selectPengalaman = sc.nextInt();
            sc.nextLine();
            if (selectPengalaman >= 1 && selectPengalaman <= 4 ) {
                return selectPengalaman;
            } else {
                System.out.println("Input tidak valid. Silahkan masukkan 1, 2, 3, atau 4.");
                return inputPengalamanKerja();
            }
        } catch (Exception e) {
            System.out.println("Inputan harus bersifat angka. Silahkan coba lagi.");
            sc.nextLine();
            return inputPengalamanKerja();
        }
    }

    static int inputPengalamanOrganisasi() {
        try {
            System.out.print("Banyak Pengalaman Organisasi: ");
            int banyak = sc.nextInt();
            sc.nextLine();
            return banyak;
        } catch (Exception e) {
            System.out.println("Inputan harus bersifat angka. Silahkan coba lagi.");
            sc.nextLine();
            return inputPengalamanOrganisasi();
        }
    }

    static int inputBanyakProjek() {
        try {
            System.out.print("Input: ");
            int selectProjek = sc.nextInt();
            sc.nextLine();
            if (selectProjek >= 1 && selectProjek <= 4 ) {
                return selectProjek;
            } else {
                System.out.println("Input tidak valid. Silahkan masukkan 1, 2, 3, atau 4.");
                return inputPengalamanKerja();
            }
        } catch (Exception e) {
            System.out.println("Inputan harus bersifat angka. Silahkan coba lagi.");
            sc.nextLine();
            return inputBanyakProjek();
        }
    }
}