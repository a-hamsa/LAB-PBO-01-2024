class Alamat{
    String jalan;
    String kota;
}
class Mahasiswa{
    Alamat alamat;
    String nama;
    String nim;
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getAlamat(){
        return alamat.jalan +", "+ alamat.kota;
    }
}
public class TP2_4_H071231067 {
    public static void main(String[] args){
        Alamat alamat = new Alamat();
        alamat.jalan = "Todopuli Raya";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Jevon";
        mahasiswa.nim = "H071231067";

        System.out.println("Nama: "+ mahasiswa.getNama());
        System.out.println("Nim: "+ mahasiswa.getNim());
        System.out.println("Alamat: "+ mahasiswa.getAlamat());
    }
}