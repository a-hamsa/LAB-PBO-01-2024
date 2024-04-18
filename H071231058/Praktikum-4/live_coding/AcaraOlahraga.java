package live_coding;

public class AcaraOlahraga {
    String nama, penyiar, jenisOlahraga, deskripsi;
    int durasi;

    public AcaraOlahraga(){}
    public AcaraOlahraga(String nama, String penyiar, String jenisOlahraga, String deskripsi, int durasi){
        this.nama = nama;
        this.penyiar = penyiar;
        this.jenisOlahraga = jenisOlahraga;
        this.deskripsi = deskripsi;
        this.durasi = durasi;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setPenyiar(String penyiar){
        this.penyiar = penyiar;
    }

    public String  getPenyiar(){
        return penyiar;
    }

    public void setJenisOlahraga(String jenisOlahraga){
        this.jenisOlahraga = jenisOlahraga;
    }

    public String getJenisOlahraga(){
        return jenisOlahraga;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi(){
        return deskripsi;
    }

    public void setDurasi(int durasi){
        this.durasi = durasi;
    }

    public int getDurasi(){
        return durasi;
    }

    public void displayInfo(){
        System.out.println("Nama          : " + getNama() );
        System.out.println("Penyiar       : " + getPenyiar());
        System.out.println("Jenis olahraga: " + getJenisOlahraga());
        System.out.println("Deskripsi     : " + getDeskripsi());
        System.out.println("Durasi        : " + getDurasi());
    }
}



