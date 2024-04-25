class Produk{
    String ID;
    String nama;
    int stok;
    int harga;
    public void setID(String ID){
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

    public void cekDataProduk(){
        System.out.println("================================");
        System.out.println("ID Produk : "+ID);
        System.out.println("Nama Produk : "+nama);
        System.out.println("Stok Produk : "+stok);
        System.out.println("Harga Produk : "+harga);
    }
    public void cekStok(){
        if(stok > 0){
            System.out.println("Produk "+nama+" Tersedia "+stok+" buah");
        }
        else{
            System.out.println("Produk "+nama+ " Kosong");
        }
    }

}
public class LiveCodingTP2 {
    public static void main(String[]args){
        Produk Produk1 = new Produk();
        Produk1.setID("001");
        Produk1.setNama("Pulpen");
        Produk1.setHarga(5000);
        Produk1.setStok(0);

        Produk1.cekDataProduk();
        Produk1.cekStok();

    }
}