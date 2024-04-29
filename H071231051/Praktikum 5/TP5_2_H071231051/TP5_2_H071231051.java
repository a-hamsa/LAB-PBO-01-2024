package TP5_2_H071231051;

import java.util.ArrayList;
import java.util.Scanner;
import TP5_2_H071231051.daftarProduk.Product;
import TP5_2_H071231051.daftarProduk.Smarthphone;
import TP5_2_H071231051.daftarProduk.Camera;
import TP5_2_H071231051.daftarProduk.Laptop;

public class TP5_2_H071231051 {
    private static ArrayList<Product> daftarProduk = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
       menu(); 
    }
    private static void menu(){
        while(true){
            int pilihMenu;
            System.out.println("==================================================");
            System.out.println("\t\t      Menu ");
            System.out.println("==================================================");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar\n");
            do{
                System.out.print(">>> Pilih Menu (1-4) : ");
                while(!scan.hasNextInt()){
                    System.out.println("Inputan berupa angka (1-4) ");
                    System.out.print(">>> Pilih Menu (1-4) : ");

                    scan.next();
                }
                pilihMenu = scan.nextInt();
                System.out.println("==================================================");
                scan.nextLine();
            }while(pilihMenu<=0 );

            switch (pilihMenu) {
                case 1:
                    tambahProduk();
                    break;
                case 2:
                    if(daftarProduk.isEmpty()){
                        System.out.println("Daftar Produk Kosong");
                    }else{
                        tampilkanProduk();
                    }
                    break;
                case 3:
                    if(daftarProduk.isEmpty()){
                        System.out.println("Daftar produk Kosong");
                    }else{
                        beliProduk();
                    }
                    break;
                case 4:
                    System.out.println("Terimakasih telh menggunakan layanan kami. Sampai Jumpa!!");
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    private static void tambahProduk(){
        System.out.print("Masukkan nama produk: ");
        String brand = scan.nextLine(); 
        int nomorSeri;
        do{
            System.out.print("Masukkan nomor Seri : ");
            while(!scan.hasNextInt()){
                System.out.print("Masukkan nomor Seri : ");
                scan.next();
            }
            nomorSeri = scan.nextInt();
        }while(nomorSeri <= 0);
        System.out.print("Masukkan harga      : ");
        double harga = scan.nextDouble();
        System.out.println("--------------------------------------------------");
        System.out.println("Pilih tipe produk ");
        System.out.println("--------------------------------------------------");
        System.out.println("1. Smarthphone ");
        System.out.println("2. Camera ");
        System.out.println("3. Laptop ");
        System.out.println("--------------------------------------------------");
        System.out.print("Pilih tipe produk (1-3): ");
        int tipeProduk = scan.nextInt();
        System.out.println("--------------------------------------------------");
        scan.nextLine();
        switch (tipeProduk) {
            case 1:
                System.out.print("Masukkan ukuran layar (inci)  : ");
                double ukuranLayar = scan.nextDouble();
                System.out.print("Masukkan kapasitas penyimpanan: ");
                int kapasitasPenyimpanan = scan.nextInt();
                daftarProduk.add(new Smarthphone(ukuranLayar, kapasitasPenyimpanan, brand, nomorSeri, harga));
                break;
            case 2:
                System.out.print("Masukkan resolusi kamera: ");
                int resolusi = scan.nextInt();
                System.out.print("Masukkan tipe lensa     :");
                scan.nextLine();
                String tipeLensa = scan.nextLine();
                daftarProduk.add(new Camera(resolusi, tipeLensa, brand, nomorSeri, harga));
                break;
            case 3:
                System.out.print("Masukkan tipe processor: ");
                String jenisProcessor = scan.nextLine();
                System.out.print("Masukkan ukuran RAM    : ");
                int ukuranRAM = scan.nextInt();
                daftarProduk.add(new Laptop(ukuranRAM, jenisProcessor, brand, nomorSeri, harga));
                break;
            default:
                break;
        }
    }

    private static void tampilkanProduk(){
        System.out.println("--------------------------------------------------");
        System.out.println("\t\tDaftar Produk");
        System.out.println("--------------------------------------------------");
        for(Product produk : daftarProduk){
            produk.displayInfo();
            System.out.println("--------------------------------------------------");
        }
    }

    private static void beliProduk(){
        System.out.print("Masukkan nomor seri yang ingin dibeli: ");
        int nomorSeriygdibeli = scan.nextInt();
        boolean found = false;
        for(Product nomor : daftarProduk){
            if(nomor.getSeriesNumber() == nomorSeriygdibeli){
                found = true;
                System.out.println("Anda telah membeli produk : ");
                nomor.displayInfo();
                daftarProduk.remove(nomor);
                break;
            }
        }
        if(!found){
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan");
        }
    }
}

