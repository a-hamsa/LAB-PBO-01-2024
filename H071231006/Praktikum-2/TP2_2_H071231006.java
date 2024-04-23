import java.util.Scanner;

public class TP2_2_H071231006 {
    static class Produk {
        String nama;
        int ID, stok;
        double harga;

        void cekDataProduk() {
            System.out.println("Data Produk");
            System.out.println("Nama      : " + nama);
            System.out.println("ID Produk : " + ID);
            System.out.println("Stok      : " + stok);
            System.out.println("Harga     : Rp." + harga);
        }

        void cekStokProduk() {
            if (stok == 0) {
                System.out.println("Tidak tersedia");
            } else {
                System.out.println("Stok tersedia: " + stok);
                
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Produk produk = new Produk();

            System.out.print("Masukkan nama produk: ");
            produk.nama = scanner.nextLine();

            System.out.print("Masukkan ID produk: ");
            produk.ID = scanner.nextInt();

            System.out.print("Masukkan stok produk: ");
            produk.stok = scanner.nextInt();

            System.out.print("Masukkan harga produk: ");
            produk.harga = scanner.nextDouble();

            scanner.close();

            produk.cekDataProduk();

            produk.cekStokProduk();
        }
    }
}