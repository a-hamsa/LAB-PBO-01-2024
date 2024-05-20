package LV1_1_H071231055;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Karyawan karyawan = new Karyawan(null, 0, null, 0);
    List<Karyawan> daftarKaryawan = new ArrayList<>();

    while(true){
        System.out.println("Data Karyawan:");
        System.out.println("a. Tambah data karyawan");
        System.out.println("b. Tampilkan detail karyawan");
        System.out.println("c. Keluar");
        System.out.println("Pilih opsi (a-c): ");
        String pilihan = scanner.nextLine();

        switch (pilihan) {
            case "a":
                System.out.println("Masukkan nama\t: ");
                String nama = scanner.nextLine();
                System.out.println("Masukkan umur\t: ");
                int umur = Integer.parseInt(scanner.nextLine());

                Pengalaman pengalaman = new Pengalaman();
                pengalaman.prosesKehidupan();

                Pendidikan pendidikan = new Pendidikan();
                pendidikan.prosesKehidupan();

                Projek projek = new Projek();
                projek.jumlahProjek();

                if ((pendidikan.getInputPendidikan() <= 1 || projek.jumlahProjek <=4  || umur <18|| pengalaman.getInputPengalaman()<= 0)){
                    System.out.println("Karyawan tidak memenuhi syarat.");
                    System.out.println("Pendidikan terakhir\t: " + pendidikan.getInputPendidikan());
                    System.out.println("Jumlah projek IT\t: " + projek.jumlahProjek);

                } else {
                    System.out.println("Pengalaman sedang diproses...");
                    System.out.println("Pendidikan terakhir\t: " + pendidikan.getJenjang());
                    System.out.println("Jumlah projek IT\t: " + projek.jumlahProjek);
                    System.out.println("====================================================");
                    System.out.println("Selamat, karyawan diterima!");
                    System.out.println("====================================================");
                    karyawan = new Karyawan(nama, umur, "Karyawan", pengalaman.getGajiSebelumnya());
                        daftarKaryawan.add(karyawan);
                }
                break;
            case "b":
            if (daftarKaryawan.isEmpty()){
                System.out.println("Belum ada data karyawan.");
            } else {
                System.out.println("Detail karyawan yang diterima:");
                for (Karyawan karyawan1 : daftarKaryawan){
                    karyawan1.displayInfo();
                }
            }
                break;
            case "c":
            System.out.println("====================================================");
            System.out.println("Program selesai...");
            System.out.println("====================================================");
            default:
            System.out.println("Pilihan hanya (a-c)!");
                break;
        }
    }
}
}
