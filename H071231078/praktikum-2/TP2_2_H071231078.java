package TP_2;

public class TP2_2_H071231078 {
    public static void main(String[] args) {
        Produk produk_01 = new Produk();
        Produk produk_02 = new Produk();

        produk_01.setProduk(01, "meja", 20, "9.000.000"); 
        produk_02.setProduk(02, "kursi", 0, "7.000.000"); 

        produk_01.getProductStatus();
        produk_02.getProductStatus();

    }
}

class Produk {
    int id;
    String nama;
    int stock;
    String harga;

    public void setProduk(int id,String nama,int stock,String harga){
        this.id = id;
        this.nama = nama;
        this.stock = stock;
        this.harga = harga;
    }

    public void getProductStatus(){
        System.out.println("-----Product Status-----");
        System.out.println("Nama Produk : " + nama);
        System.out.println("ID          : " + id);
        System.out.println("Harga       : " + harga);
        if (stock == 0) {
            System.out.println("Stock       : Stock Habis...!!");
        } else {
            System.out.println("Stock       : " + stock);
        }
    }
}
