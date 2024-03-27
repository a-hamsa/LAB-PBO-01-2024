public class TP2_4_H071231059 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Farhan";
        mahasiswa.nim = "H071231025";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
} 

class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat; 

    String getNama(){
        return nama;
    }

    String getNim(){
        return nim;
    }

    void setAlamat(Alamat alamat) { 
        this.alamat = alamat;
    }

    String getAlamat() { 
        return alamat.getJalan() + ", " + alamat.getKota();
    } 
}

class Alamat {
    String jalan;
    String kota;

    String getJalan() {
        return jalan;
    }
    String getKota() {
        return kota;
    }
}

