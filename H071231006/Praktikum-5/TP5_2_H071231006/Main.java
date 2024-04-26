package TP5_2_H071231006;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // membuat objek setiap produk
    Smartphone myPhone = new Smartphone("Iphone", 44444, 500.999, 6.0, 128);
    Laptop myLaptop = new Laptop("Asus", 11111, 530.999, "Intel Core i3", 16);
    Camera myCamera = new Camera("Fuji Film", 22222, 400.999, 36, "Fish Eye");

    // membuat ArrayList untuk menyimpan produknya
    ArrayList<Product> listProduk = new ArrayList<>();
    listProduk.add(myPhone);
    listProduk.add(myLaptop);
    listProduk.add(myCamera);

    // membuat objek Scanner agar dapat menerima inputan
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Menu:");
      System.out.println("1. Tambah Produk");
      System.out.println("2. Tampilkan Semua Produk");
      System.out.println("3. Beli Produk");
      System.out.println("4. Keluar\n");
      System.out.print(">>> Pilih menu (1-4):  ");

      int pilih = scanner.nextInt();
      scanner.nextLine();

      switch (pilih) {
        case 1:
          System.out.print("Masukkan nama produk: ");
          String name = scanner.nextLine();
          System.out.print("Masukkan nomor seri: ");
          int seriesNumber = scanner.nextInt();
          System.out.print("Masukkan harga: ");
          double price = scanner.nextDouble();
          scanner.nextLine();

          System.out.println("Pilih tipe produk:");
          System.out.println("1. Smartphone");
          System.out.println("2. Laptop");
          System.out.println("3. Camera");
          System.out.print("Pilih tipe produk (1-3): ");
          int tipeProduk = scanner.nextInt();
          scanner.nextLine();

          switch (tipeProduk) {
            case 1:
              System.out.print("Masukkan ukuran layar (inci): ");
              double screenSize = scanner.nextDouble();
              System.out.print("Masukkan kapasitas penyimpanan (GB): ");
              int storageCapacity = scanner.nextInt();
              listProduk.add(new Smartphone(name, seriesNumber, price, screenSize, storageCapacity));
              break;
            case 2:
              System.out.print("Masukkan tipe prosesor: ");
              String processorType = scanner.nextLine();
              System.out.print("Masukkan ukuran RAM (GB): ");
              int ramSize = scanner.nextInt();
              listProduk.add(new Laptop(name, seriesNumber, price, processorType, ramSize));
              break;
            case 3:
              System.out.print("Masukkan resolusi (MP): ");
              int resolution = scanner.nextInt();
              scanner.nextLine();
              System.out.print("Masukkan jenis lensa: ");
              String lensType = scanner.nextLine();
              listProduk.add(new Camera(name, seriesNumber, price, resolution, lensType));
              break;
            default:
              System.out.println("Pilihan tidak valid.");
          }
          break;
        case 2:
          System.out.println("Daftar Produk:");
          for (Product product : listProduk) {
            product.displayInfo();
            System.out.println();
          }
          if (listProduk.isEmpty()){
            System.out.println("Produk telah habis terjual.");
          }
          break;
        case 3:
          System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
          int buySeriesNumber = scanner.nextInt();
          scanner.nextLine();
          boolean found = false;
          for (Product product : listProduk) {
            if (product.seriesNumber == buySeriesNumber) {
              System.out.println("Anda telah membeli produk:");
              product.displayInfo();
              found = true;
              listProduk.remove(product);
              break;
            }
          }
          if (!found) {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan atau produk tersebut kosong.");
          }
            break;
        case 4:
          System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
          System.exit(0);
        default:
          System.out.println("Pilihan tidak valid.");

        scanner.close();
      }
    }
  }
}
