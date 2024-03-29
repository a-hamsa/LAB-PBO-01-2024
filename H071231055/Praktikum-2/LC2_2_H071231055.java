public class LC2_2_H071231055 {
    int id;
    String nama;
    int stok;
    double harga;

    public void infoProduk(){
        System.out.println("Id     : " + this.id);
        System.out.println("Produk : " + this.nama);
        System.out.println("Stok   : " + this.stok);
        System.out.println("Harga  : " + this.harga);
    }

    public String cekStok(){
        if (stok>0){
            return "Produk Tersedia";
        }else {
            return "Produk Tidak Tersedia";
        }
    }

    public static void main(String[] args) {
        LC2_2_H071231055 hasil = new LC2_2_H071231055();
        hasil.id = 123;
        hasil.nama = "Baju";
        hasil.stok = 0;
        hasil.harga = 22000;
        hasil.infoProduk();
        System.out.println(hasil.cekStok());
    }
}
