class Alamat{
    String jalan;
    String kota;

    public String getalamat(){
        return jalan + ", " + kota;
    }
}

class Mahasiswa{
    String nama;
    String nim;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }

}
public class livecoding4 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("naura");
        mahasiswa.setNim("H071231051");

        System.out.println(mahasiswa.getNama());
        System.out.println(mahasiswa.getNim());
        System.out.println(alamat.getalamat());
    }
}
