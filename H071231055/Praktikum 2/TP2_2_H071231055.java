class Data {

  int id;
  String nama;
  int stok;
  double harga;

    public Data(int id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void infoProduk() {
        System.out.println("ID     : " + this.id);
        System.out.println("Produk : " + this.nama);
        System.out.println("Stok   : " + this.stok);
        System.out.println("Harga  : " + this.harga);
    }

    public static String cekStok(int stok) {
        if (stok > 0) {
            return "Produk tersedia!";
        } else {
            return "Produk tidak tersedia!";
        }
    }

    public static void main(String[] args) {
        Data produk1 = new Data(7642, "Parfum", 2, 22000);
        produk1.infoProduk();
        System.out.println(cekStok(produk1.getStok()));
    }
}

//Live Coding
public class TP2_2_H071231055 {
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
        TP2_2_H071231055 hasil = new TP2_2_H071231055();
        hasil.id = 123;
        hasil.nama = "Baju";
        hasil.stok = 0;
        hasil.harga = 22000;
        hasil.infoProduk();
        System.out.println(hasil.cekStok());
    }
}
