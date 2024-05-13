package LiveCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainn {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Karyawann> daftarrkaryawan = new ArrayList<>();
    static String opsi;

    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Data Karyawan :");
            System.out.print("a. Tampilkan data Karyawan \nb. Tampilkan data karyawan \nc. Keluar \nPilih opsi (a-c): ");
            opsi = scan.nextLine().toLowerCase();
            switch (opsi) {
                case "a":
                    System.out.print("Masukkan nama: ");
                    String nama = scan.nextLine();
                    System.out.print("Masukkan umur: ");
                    int umur = Integer.parseInt(scan.nextLine());

                    Pengalamann pengalamann = new Pengalamann();
                    pengalamann.prosesKehidupann(scan);

                    Pendidikann pendidikann = new Pendidikann();
                    pendidikann.prosesPendidikan(scan);

                    Projekk projekk = new Projekk();
                    projekk.jenisProjekk(scan);
                    
                    String inputPendidikann = pendidikann.getInputPendidikann();
                    int jumlahProjekk = projekk.getJumlahProjekk();
                    double gaji = pengalamann.getGajiSebeelumnya();

                    if((inputPendidikann.equalsIgnoreCase("S1") || inputPendidikann.equalsIgnoreCase("S2") || inputPendidikann.equalsIgnoreCase("S3")) && jumlahProjekk > 4 && umur >= 18 ){
                        System.out.println("Pengalaman sedang di proses...");
                        System.out.println("Pendidikan Terakhir: " + pendidikann.getInputPendidikann());
                        System.out.println("Jumlah Projek IT: " + jumlahProjekk);
                        double gajii = gaji + 1000000;
                        daftarrkaryawan.add(new Karyawann(nama, umur, gajii, inputPendidikann));
                        System.out.println("========================================");
                        System.out.println("\tSelamat, Karyawan diterima!!");
                        System.out.println("========================================");
                    }else{
                        System.out.println("Karyawan tidak memenuhi syarat");
                    }
                    break;
                case "b":
                    if(daftarrkaryawan.isEmpty()){
                        System.out.println("Daftar karyawan kosong");
                    }else{
                        System.out.println("Daftar Karyawan:");
                        System.out.println("========================================");
                        for( Karyawann daftar : daftarrkaryawan){
                            daftar.tampilanDetail();
                            System.out.println("========================================");
                        } 
                    }
                    break;
                case "c":
                    System.out.println("Terimakasihh");
                    isRunning = false;
                    break;
                default:
                    break;
            }
        }
    }
}
