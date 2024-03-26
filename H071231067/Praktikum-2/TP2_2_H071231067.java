class Produk{
    String ID;
    String nama;
    int stok;
    int harga;

    public void setID(String ID) {
        this.ID = ID;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }

    public void cekStok(){
        if(stok > 0){
            System.out.println("Stok produk "+nama+" tersedia sebanyak "+stok);
        }else{
            System.out.println("Stok produk "+nama+" habis");
        }
    }

    public void cekDataProduk(){
        System.out.println("================================");
        System.out.println("ID Produk : "+ID);
        System.out.println("Nama Produk : "+nama);
        System.out.println("Stok Produk : "+stok);
        System.out.println("Harga Produk : "+harga);
    }
}
public class TP2_2_H071231067{
    public static void main(String[] args){
        Produk produk1 = new Produk();
        produk1.setID("001");
        produk1.setNama("Buku");
        produk1.setStok(2);
        produk1.setHarga(5000);
        produk1.cekDataProduk();
        produk1.cekStok();

        Produk produk2 = new Produk();
        produk2.setID("002");
        produk2.setNama("Pulpen");
        produk2.setStok(0);
        produk2.setHarga(5000);
        produk2.cekDataProduk();
        produk2.cekStok();
    }
}