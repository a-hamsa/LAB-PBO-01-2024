package livecoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Karyawan> listKaryawan = new ArrayList<>();
    static Kehidupan[] kehidupan = new Kehidupan[4];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    static void runApp() {
        System.out.println("Data karyawan:");
        System.out.println("a. tambah data karyawan");
        System.out.println("b. tampilkan data karyawan");
        System.out.println("c. keluar");
        System.out.print("Input: ");
        String selectMenu = sc.next();
        sc.nextLine();
        switch (selectMenu) {
            case "a":
                tambahKaryawan();
                break;
            case "b":
                tampilkanDetailKaryawan();
            case "c":
                System.out.println("terima kasih");
                System.exit(0);
            default:
                System.out.println("Invalid Input");
                runApp();
                break;
        }
    }

    static void tambahKaryawan() {
        Karyawan karyawan = new Karyawan();
        Pengalaman pengalaman = new Pengalaman();
        Pendidikan pendidikan = new Pendidikan();
        Projek projek = new Projek();

        karyawan.setNama(inputNama());
        int umur = inputUmur();
        int gaji = 0;
        
        karyawan.setUmur(umur);

        int pekerjaan = inputPekerjaan();
        if (pekerjaan >= 1 && pekerjaan <= 3) {
            gaji = inputGaji();
        }
        int banyakProjek = inputProjek();
        String pendidikanTerakhir = inputPendidikan();

        pengalaman.jenisPekerjaan(pekerjaan);
        projek.pilBanyakProjek(banyakProjek);
        pendidikan.lulusan(pendidikanTerakhir);
        

        if (umur < 18 || banyakProjek == 1 || pendidikan.equals("SD") || pendidikanTerakhir.equals("SMP")) {
            System.out.println("Kariyawan tidak memenuhi syarat");

        } else {
            System.out.println("Selamat, anda diterima");

            if (banyakProjek == 4 || pendidikanTerakhir.equals("S3") || pekerjaan == 3) {
                karyawan.setJabatan("senior Engineer");
                karyawan.setGaji(gaji * 5);
            } else if (banyakProjek == 3 || (pendidikanTerakhir.equals("S1") || pendidikanTerakhir.equals("S2"))  || (pekerjaan == 1 || pekerjaan == 2)) {
                karyawan.setJabatan("Engineer");
                karyawan.setGaji(gaji * 3);
            } else {
                karyawan.setJabatan("staff");
                karyawan.setGaji(gaji * 2);
            }

            listKaryawan.add(karyawan);
            kehidupan[0] = pengalaman;
            kehidupan[1] = pendidikan;
            kehidupan[2] = projek;
        }
        runApp();
    }

    static void tampilkanDetailKaryawan() {
        if (listKaryawan.size() == 0) {
            System.out.println("Belum ada data Kariyawan");
        } else {
            for (int i = 0; i < listKaryawan.size(); i++) {
                listKaryawan.get(i).displayInfo();
            }

            int selectMenu2 = selectDetail();
            if (selectMenu2 == 1) {
                System.out.println("berikut detail kehidupan karyawan: ");
                kehidupan[0].prosesKehidupan();
                kehidupan[1].prosesKehidupan();
                kehidupan[2].prosesKehidupan();
            }
        }
        runApp();
    }

    static String inputNama() {
        System.out.print("Masukkan nama:");
        String nama = sc.next();

        if (nama.isEmpty()) {
            System.out.println("harap masukkan dgn benar");
            return inputNama();
        } else {
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
            System.out.println("invalid input");
            sc.nextLine();
            return inputUmur();
        }
    }

    static int inputPekerjaan() {
        try {
            System.out.println("Pekerjaan sebelumnya");
            System.out.println("1. freelancer");
            System.out.println("2. magang");
            System.out.println("3. pekerja tetap");
            System.out.println("4. tidak ada");
            System.out.print("Input: ");
            int pekerjaan = sc.nextInt();
            sc.nextLine();
            return pekerjaan;
        } catch (Exception e) {
            System.out.println("invalid input");
            sc.nextLine();
            return inputPekerjaan();
        }
    }

    static int inputGaji() {
        try {
            System.out.print("Masukkan gaji: ");
            int gaji = sc.nextInt();
            sc.nextLine();
            return gaji;
        } catch (Exception e) {
            System.out.println("invalid input");
            sc.nextLine();
            return inputGaji();
        }
    }

    static int inputProjek() {
        try {
            System.out.println("Projek IT:");
            System.out.println("1. minimal 4");
            System.out.println("2. 8 projek");
            System.out.println("3. 12 projek");
            System.out.println("4. lebih dari 15");
            System.out.print("Input: ");
            int banyakProjek = sc.nextInt();
            sc.nextLine();

            return banyakProjek;
        } catch (Exception e) {
            System.out.println("invalid input");
            sc.nextLine();
            return inputProjek();
        }
    }
    static String inputPendidikan() {
        System.out.print("Pendidikan Terakhir:");
        String lulusan = sc.next();

        if (!lulusan.isEmpty() && (lulusan.equals("SD") || lulusan.equals("SMP") || lulusan.equals("SMA") || lulusan.equals("S1") || lulusan.equals("S2") || lulusan.equals("S3"))) {
            return lulusan; 
        } else {
            System.out.println("harap masukkan dgn benar");
            return inputPendidikan();
        }
    }

    static int selectDetail() {
        try {
            System.out.println("lihat detail kehidupan?");
            System.out.println("1. ya");
            System.out.println("2. tidak");
            System.out.print("Input: ");
            int select = sc.nextInt();
            sc.nextLine();
            if (select != 1 && select != 2) {
                System.out.println("invalid input");
                return selectDetail();
            } else {
                return select;
            }
        } catch (Exception e) {
            System.out.println("invalid input");
            sc.nextLine();
            return selectDetail();
        }
    }
}
