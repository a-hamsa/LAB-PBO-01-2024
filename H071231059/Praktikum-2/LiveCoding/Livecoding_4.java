package LiveCoding;
class Alamat{
    String kota;
    String jalan;

    void setJalan(String jalan) {
        this.jalan = jalan;
    }
    String getJalan(){
        return jalan;
    }

    void setKota(String kota){
        this.kota = kota;
    }
    String getKota(){
        return kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;


    String getNim(){
        return nim;
    }

    String getNama(){
        return nama;
    }

    String getAlamat(Alamat alamat){
        return this.alamat.getJalan() + ", "+this.alamat.getKota();
    }

}
public class Livecoding_4 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Farhan";
        mahasiswa.nim = "H071231025";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: "+ mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat(alamat));
    }
}


