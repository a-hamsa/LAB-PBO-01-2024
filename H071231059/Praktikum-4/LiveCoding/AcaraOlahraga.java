package LiveCoding;

public class AcaraOlahraga {
   
    private String nama, penyiar, jenisOlahraga, deskripsi;
    private int durasi;

    public AcaraOlahraga(){
    }
    
    public AcaraOlahraga(String nama, String penyiar, String jenisOlahraga, String deskripsi, int durasi) {
        this.nama = nama;
        this.penyiar = penyiar;
        this.jenisOlahraga = jenisOlahraga;
        this.deskripsi = deskripsi;
        this.durasi = durasi;
    }

    public void displayInfo(){
        System.out.println("Nama: " + getNama());
        System.out.println("Penyiar: " + getPenyiar());
        System.out.println("Jenis Olahrga: " + getJenisOlahraga());
        System.out.println("Deskrpsi: " + getDeskripsi());
        System.out.println("Durasi: " + getDurasi()+ " menit");
    }


    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getPenyiar() {
        return penyiar;
    }
    public void setPenyiar(String penyiar) {
        this.penyiar = penyiar;
    }
    public String getJenisOlahraga() {
        return jenisOlahraga;
    }
    public void setJenisOlahraga(String jenisOlahraga) {
        this.jenisOlahraga = jenisOlahraga;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    public int getDurasi() {
        return durasi;
    }
    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
}
