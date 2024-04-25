class Buku{
    String judul, durasi, pengarang, genre, sinopsis;

    public Buku(){
        this.judul = "Queen Of Tears";
        this.genre = "Romantis";
        this.durasi = "60 menit";
        this.pengarang = "Kim Soo hyun";
        this.sinopsis = "Menceritakan kisah romantis";
    }

    public Buku(String judul, String durasi, String pengarang, String genre, String sinopsis){
        this.judul = judul;
        this.durasi = durasi;
        this.pengarang = pengarang;
        this.genre = genre;
        this.sinopsis = sinopsis;
    }

    public String getJudul() {
        return this.judul;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getDurasi() {
        return this.durasi;
    }
    
    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }
    
    public String getPengarang() {
        return this.pengarang;
    }
    
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    
    public String getGenre() {
        return this.genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String getSinopsis() {
        return this.sinopsis;
    }
    
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    public void displayInfo(){
        System.out.println("Judul Buku     : " + getJudul());
        System.out.println("Durasi         : " + getDurasi());
        System.out.println("genre Buku     : " + getGenre());
        System.out.println("Pengarang Buku : " + getPengarang());
        System.out.println("Sinopsis       : " + getSinopsis());
        System.out.println("--------------------------------------");
    }
}

public class TP4_2_H071231051 {
    public static void main(String[] args) {
        SelfUtils.displaySelfData();
        Buku buku1 = new Buku("QoT", "4 jam", "Kim Jiwoo", "Action", "Peperangan menhancurkan kerajaan");
        buku1.displayInfo();
        Buku buku = new Buku();
        buku.displayInfo();
    }
}
