package TP2;
class Produk {
    String nama;
    int id, stok;
    double harga;

    public Produk(int id, String nama, int stok, double harga){
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setStok(int stok){
        this.stok = stok;
    }

    public int getStok(){
        return stok;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public double getHarga(){
        return harga;
    }

    public boolean isTersedia(){
        return stok > 0;
    }
    public static void main(String[] args) {
        Produk produk = new Produk(1001, "Sepatu", 10, 50000);

        System.out.println("ID: " + produk.getId());
        System.out.println("Nama produk: " + produk.getNama());
        System.out.println("Stok: " + produk.getStok());
        System.out.println("Harga: " + produk.getHarga());

         if (produk.isTersedia()){
            System.out.println("Produk tersedia");
        } else {
            System.out.println("Produk tidak tersedia");
        }
    }
}
