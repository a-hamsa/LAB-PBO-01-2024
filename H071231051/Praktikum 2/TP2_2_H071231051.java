import java.util.Scanner;
class Produk{
    String id;
    String nama;
    int stok;
    int harga;

    public void infoProduk(){
        System.out.println("ID produk : " + this.id);
        System.out.println("Nama produk : " + this.nama);
        System.out.println("Stok : " + this.stok);
        System.out.println("Harga produk : Rp. " + this.harga);
        System.out.println(cekProduk());
    }

    public boolean produkTersedia() {
        return stok > 0;
    }

    public String cekProduk(){  
        if (produkTersedia()) {
            return "\n----------- " + nama + " tersedia di stok -----------";
        } else {
            return "\n-------- " + nama + " tidak tersedia di stok --------";
        }
    }

}

public class TP2_2_H071231051 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Produk[] daftarProduk = new Produk[10];

        int jumlahProduk = 0;

        while (true){
            System.out.println("\nPilihan: ");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Info produk");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan: ");
            int pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    Produk produkBaru = new Produk();

                    System.out.println("\nTambah Produk: ");
                    System.out.print("ID    : ");
                    produkBaru.id = scan.nextLine();

                    System.out.print("Nama  : ");
                    produkBaru.nama = scan.nextLine();

                    System.out.print("Stok : ");
                    produkBaru.stok= scan.nextInt();

                    System.out.print("Harga : ");
                    produkBaru.harga= scan.nextInt();


                    daftarProduk[jumlahProduk] = produkBaru;
                    jumlahProduk++;
                    System.out.println("\nProduk berhasil ditambahkan");
                    break;
                
                case 2:
                    System.out.println("\nTampilkan Daftar Produk");
                    for (int i = 0; i < jumlahProduk ; i++) {
                        System.out.println("\nProduk ke-" + (i + 1) + " ");
                        daftarProduk[i].infoProduk();
                    }
                    break;
                case 3:
                    System.out.println("\nPROGRAM SELESAI");
                    scan.close();
                    System.exit(0);
            
                default:
                    break;
            }
        }
    }
}