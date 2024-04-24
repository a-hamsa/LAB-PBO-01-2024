package TP5_2_H071231078;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Mainapp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <product> productsList = new ArrayList<>();

        boolean stopper = true;
        while (stopper == true) {
            System.out.println("Menu : ");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");

            System.out.print(">>> Pilih Menu (1-4) : ");
            int pilihan1 = scan.nextInt();

            switch (pilihan1) {
                case 1:
                    Scanner scann = new Scanner(System.in);

                    System.out.print("Masukkan Nama Produk : ");
                    String namaProduk = scann.nextLine();

                    System.out.print("Masukkan Nomor Seri  : ");
                    int nomorSeri = scann.nextInt();
                    scann.nextLine();

                    System.out.print("Masukkan Harga       : ");
                    double harga = scann.nextDouble();
                    scann.nextLine();

                
                

                    System.out.println("Pilih Tipe Produk (1-3) : ");
                    System.out.println("1. Smartphone");
                    System.out.println("2. Laptop");
                    System.out.println("3. Camera");
                    System.out.print(">>> Pilihan : ");
                    int pilihan2 = scan.nextInt();

                    switch (pilihan2) {
                        case 1:
                            System.out.print("Masukkan Ukuran Layar (inci)   : ");
                            double ukuranLayar = scan.nextDouble();
                            System.out.print("Masukkan Kapasitas Penyimpanan : ");
                            int kapasitasPenyimpanan = scan.nextInt();

                            smartphone smartphone = new smartphone();
                            smartphone.brand = namaProduk;
                            smartphone.seriesNumber = nomorSeri;
                            smartphone.price = harga;
                            smartphone.screenSize = ukuranLayar;
                            smartphone.storageCapacity = kapasitasPenyimpanan;

                            productsList.add(smartphone);
                            System.out.println("");
                            System.out.println("Produk Ditambahkan......");
                            System.out.println("");
                            break;
                        case 2:
                            System.out.print("Masukkan Besar Ram      : ");
                            int ram = scan.nextInt();
                            scan.nextLine();
                            System.out.print("Masukkan Jenis Prosesor : ");
                            String prosesor = scan.nextLine();
                        

                            laptop laptop = new laptop();
                            laptop.brand = namaProduk;
                            laptop.seriesNumber = nomorSeri;
                            laptop.price = harga;
                            laptop.ramSize = ram;
                            laptop.processorType = prosesor;

                            productsList.add(laptop);
                            System.out.println("");
                            System.out.println("Produk Ditambahkan......");
                            System.out.println("");
                            break;
                        case 3:
                            System.out.print("Masukkan Resolusi Kamera      : ");
                            int resolusi = scan.nextInt();
                            scan.nextLine();
                            System.out.print("Masukkan jenis lensa : ");
                            String lensa = scan.nextLine();

                            camera camera = new camera();
                            camera.brand = namaProduk;
                            camera.seriesNumber = nomorSeri;
                            camera.price = harga;
                            camera.resolution = resolusi;
                            camera.lensType = lensa;

                            productsList.add(camera);
                            System.out.println("");
                            System.out.println("Produk Ditambahkan......");
                            System.out.println("");
                            break;
                    default:
                        break;
                }
                break;
                case 2:
                    if (productsList.isEmpty()) {
                        System.out.println("=====================");
                        System.out.println("Tidak ada Produk Saat Ini......");
                        System.out.println("=====================");
                    } else {
                        System.out.println("Daftar Produk : ");
                        for (product product : productsList) {
                            System.out.println("=====================");
                            product.DisplayInfo();
                        }
                    }
                    
                    break;
                
                case 3:
                    if (productsList.isEmpty()) {
                        System.out.println("=====================");
                        System.out.println("Produk Kosong.....");
                        System.out.println("=====================");
                    }else{
                        System.out.print("Masukkan Nomor Seri : ");
                        int buyProduk = scan.nextInt();
                        Iterator<product> iterator = productsList.iterator();
                        while (iterator.hasNext()) {
                            product product = iterator.next();
                            if (product.seriesNumber == buyProduk) {
                                System.out.println("Anda Telah Membeli Produk:");
                                product.DisplayInfo();
                                iterator.remove();
                                break;
                            }
                        }

                    }
                    break;

                case 4:
                    System.out.println("Sampai Ketemu Lagi.....");
                    stopper = false;
                    

                default:
                    break;
            }
        }
        scan.close();
    }
}
