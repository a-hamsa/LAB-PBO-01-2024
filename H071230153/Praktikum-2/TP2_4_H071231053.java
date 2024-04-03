class Mahasiswa {
    String nama;
    String nim;
    String alamat;

    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public String getAlamat() {
        return alamat;
    }
}

class Alamat {
    String jalan;
    String kota;

    public String getAlamat() {
        return jalan + ", " + kota;
    }
}


public class TP2_4_H071231053{
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "jalan beo";
        alamat.kota = "Sidrap";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat.getAlamat(); 
        mahasiswa.nama = "Ahmad budi santoso";
        mahasiswa.nim = "H03123854";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}
