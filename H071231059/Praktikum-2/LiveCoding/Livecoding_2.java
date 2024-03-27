package LiveCoding;
class Produk {
    String ID;
    String nama;
    int harga;
    int stok;

    void setID(String ID) {
        this.ID = ID;
    }
    void setNama(String nama) {
        this.nama = nama;
    }
    void setHarga(int harga) {
        this.harga = harga;
    }
    void setStok(int stok) {
        this.stok = stok;
    }

    void getDetail() {
        System.out.println("ID: " + ID);
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
    }
    void getStok() {
        if (stok == 0) {
            System.out.println("stok " + nama + " sudah habis");

        } else {
            System.out.println("Stok: " + stok);
        }
    }
}
class Main1 {
    public static void main(String[] args) {
        Produk produk = new Produk();
        produk.setID("K0987532");
        produk.setNama("Keychain");
        produk.setHarga(80000);
        produk.setStok(44);

        produk.getDetail();
        produk.getStok();

    }
}
