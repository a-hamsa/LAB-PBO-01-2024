package TP_2;

public class TP2_4_H071231078 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.Kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Muhammad Raihan";
        mahasiswa.nim = "H071231078";
        mahasiswa.alamat = alamat;

        System.out.println("Nama   : " + mahasiswa.getNama());
        System.out.println("Nim    : " + mahasiswa.getNim());
        System.out.println("Alamat : " + mahasiswa.getAlamat());
    }
}

class Alamat{
    String jalan;
    String Kota;
}

class Mahasiswa {
    Alamat alamat;
    String nama;
    String nim;

    public String getAlamat() {
        return alamat.jalan + ", " + alamat.Kota;
    }

    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }

    
}
