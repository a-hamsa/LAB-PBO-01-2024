import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Karyawan {
    String nama;
    int umur;
    String jabatan = "karyawan";
    double gaji;

    public Karyawan(){}
    public Karyawan(String nama, int umur, String jabatan, double gaji){
        this.nama = nama ;
        this.umur = umur;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    void tampilkanDataKaryawan(){
        System.out.println("\nDetail karyawan");
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Gaji: " + getGaji());
        System.out.println();
    }

    public void setNama(String nama)  {
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur(){
        return umur;
    }

    public String getJabatan(){
        return jabatan;
    }

    public void setGaji(double gaji) {
        this.gaji =  gaji;
    }

    public double getGaji(){
        return gaji;
    }
}

abstract class Kehidupan {
    public abstract void prosesKehidupan();
}

class Pengalaman extends Kehidupan {
    int jenisPekerjaan;
    double gaji;
    String organisasi;
    static Scanner input = new Scanner(System.in);

    @Override
    public void prosesKehidupan(){
        try {
            System.out.println("Pengalaman sebelumnya:\n1. FreeLancer\n2. Magang\n3. Pekerja Tetap\n4. Tidak ada");
            System.out.print("Input: ");
            jenisPekerjaan = input.nextInt();
            input.nextLine();
            if (jenisPekerjaan > 4 || jenisPekerjaan < 1){
                System.out.println("Inputan diluar opsi!");
            } else if (jenisPekerjaan != 4){
                System.out.print("Gaji sebelumnya: ");
                gaji = input.nextDouble();
                input.nextLine();
            }
        } catch (InputMismatchException e) {
            System.out.println("Tidak boleh kosong!");
        }
    }

    public void setJenisPekerjaan(int jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    public int getJenisPekerjaan(){
        return jenisPekerjaan;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji(){
        return this.gaji;
    }
}

class Pendidikan {
    String jenjangPendidikan;
    static Scanner input = new Scanner(System.in);

    void prosesPendidikan(){
        while (true) {
            System.out.print("Pendidikan terakhir (SD/SMP/SMA/S1/S2/S3): ");
            jenjangPendidikan = input.nextLine().toUpperCase();
            if (jenjangPendidikan.equals("SD") || jenjangPendidikan.equals("SMP") || jenjangPendidikan.equals("SMA") || jenjangPendidikan.equals("S1") || jenjangPendidikan.equals("S1") || jenjangPendidikan.equals("S2") || jenjangPendidikan.equals("S3")){
                break;
            } else {
                System.out.println("Input tidak valid, silahkan input kembali.");
                prosesPendidikan();
            }        
        }
    }

    public String getJenjangPendidikan() {
        return jenjangPendidikan;
    }

    public void setJenjangPendidikan(String jenjangPendidikan) {
        this.jenjangPendidikan = jenjangPendidikan;
    }
}

class Projek {
    int jumlahProjek;
    static Scanner input = new Scanner(System.in);

    void tampilkanProjek(){
        System.out.println("Projek IT:\n1. Minimal 4\n2. Minimal 8\n3. Minimal 12\n4. Lebih dari 15");
        System.out.print("Input: ");
        int projek = input.nextInt();
        input.nextLine();
        if (projek >= 1 && projek <= 4){
            switch (projek) {
                case 1:
                    jumlahProjek = 4;
                    break;
                case 2:
                    jumlahProjek = 8;
                    break;
                case 3:
                    jumlahProjek = 12;
                    break;
                case 4:
                    jumlahProjek = 15;
                    break;
            }
        } else {
            System.out.println("Input tidak sesuai, silakan input angka 1-4");
        }
    }

    public int getJumlahProjek(){
        return jumlahProjek;
    }
}

public class LiveCoding{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Karyawan> listKaryawan = new ArrayList<>();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Data karyawan:\na. Tambahkan data karyawan\nb. Tampilkan detail karyawan\nc. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String opsi = input.nextLine().toLowerCase();            
            switch (opsi) {
                case "a":
                String jabatan = "karyawan";
                    System.out.print("Masukkan nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan umur: ");
                    int umur = input.nextInt();
                    Pengalaman pengalaman = new Pengalaman();
                    pengalaman.prosesKehidupan();
                    Pendidikan pendidikan = new Pendidikan();
                    pendidikan.prosesPendidikan();
                    String inputPendidikan = pendidikan.getJenjangPendidikan();
                    Projek projek = new Projek();
                    projek.tampilkanProjek();
                    int jumlahProjek = projek.getJumlahProjek();

                    if (inputPendidikan != "SD" && inputPendidikan != "SMP" && jumlahProjek > 4 && umur >= 18){
                        System.out.println("Pengalaman sedang diproses...");
                        System.out.println("Pendidikan terakhir: " + inputPendidikan);
                        System.out.println("Jumlah Projek IT: " + jumlahProjek);
                        System.out.println("==========");
                        System.out.println("Selamat, karyawan diterima!");
                        System.out.println("==========");
                        Karyawan karyawanbaru = new Karyawan(nama, umur, jabatan, pengalaman.gaji);
                        listKaryawan.add(karyawanbaru);
                    } else {
                        System.out.println("Karyawan tidak diterima");
                    }
                    break;
                case "b":
                    if (listKaryawan.isEmpty()){
                        System.out.println("Belum ada data karyawan");
                    } else {
                        for (Karyawan karyawan : listKaryawan){
                            karyawan.tampilkanDataKaryawan();
                        }
                    }
                    break;
                case "c":
                    System.out.println("Selamat tinggal ");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Inputan tidak valid!");
            }
        }
    }
}