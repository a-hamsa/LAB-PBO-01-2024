class Produk {
    String nama;
    int stok;
    int harga;
    int quantityInStock;



    void cekStok(int jumlahDibeli) {
        if (jumlahDibeli > stok) {
            System.out.println("/===============\\");
            System.out.println("Stok habis");
            System.out.println("/===============\\");

        } else {
            System.out.println("/====================\\");
            System.out.println(" Stok masih tersedia");
            System.out.println("/====================\\");

        }
        quantityInStock = stok - jumlahDibeli;

    }

    void displayInfo(){

        if(quantityInStock < 0 ){
            System.out.println("Sisa stok setelah dibeli: 0");
        }else{
            System.out.println("/===================\\");
            System.out.println("Sisa stok setelah dibeli : " + quantityInStock);
            System.out.println("/===================\\");
        }
    }
}

public class TP2_2_H071231053 {
    public static void main(String[] args) {
        Produk produk = new Produk();

        produk.nama = "Laptop";
        produk.stok = 3;
        produk.harga = 400;



        produk.cekStok(1);
        produk.displayInfo();

    }
}