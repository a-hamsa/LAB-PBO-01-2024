class Buku{
    private String judul;
    private int durasi;
    private String pengarang;
    private String genre;
    private String sinopsis;
    
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getDurasi() {
        return durasi;
    }
    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public String getPengarang() {
        return pengarang;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSinopsis() {
        return sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }


    Buku(){}
    
    Buku(String judul, int durasi , String pengarang , String genre , String sinopsis){
        this.judul = judul;
        this.durasi = durasi;
        this.pengarang = pengarang;
        this.genre = genre;
        this.sinopsis = sinopsis;
    }
    public void DisplayInfo(){
        System.out.println("Judul      : " + this.judul);
        System.out.println("Durasi     : " + this.durasi + " Menit");
        System.out.println("Pengarang  : " + this.pengarang);
        System.out.println("Genre      : " + this.genre);
        System.out.println("Sinopsis   : " + this.sinopsis);
        System.out.println();
    }
}

class SelfUtils{
    void DisplaySelfData(){
        System.out.println("Nama\t: Jevon Ivander Thomas");
        System.out.println("NIM\t: H071231067");
    }
}
public class TP4_2_H071231067 {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        System.out.println("Buku 1");
        buku1.setJudul("London Love Story");
        buku1.setDurasi(90);
        buku1.setPengarang("Loveable");
        buku1.setGenre("Percintaan dan Persahabatan");
        buku1.setSinopsis("Cerita dalam novel ini menceritakan mengenai bagaimana kelanjutan cinta di masa depan. Bagaimana seseorang mempertahankan dan memperjuangkan cintanya untuk masa yang akan datang. Novel London Love Story ini lebih menekankan mengenai perihal cinta dan sedikit kisah persabahatan.");
        buku1.DisplayInfo();

        Buku buku2 = new Buku("Laskar Pelangi",120,"Andrea Hirata","Roman","Novel yang ditulis oleh Andrea Hirata ini berkisahkan 10 orang anak yang tinggal di Belitung Timur, Desa Gantung, Kabupaten Gantung. Kisah ini awalnya dimulai karena Depdikbud yang akan membubarkan sekolah Muhammadiyah yang terancam akan dibubarkan jika tidak memiliki 10 murid.");
        System.out.println("Buku 2");
        System.out.println("Judul      : " + buku2.getJudul());
        System.out.println("Durasi     : " + buku2.getDurasi() + " Menit");
        System.out.println("Pengarang  : " + buku2.getPengarang());
        System.out.println("Genre      : " + buku2.getGenre());
        System.out.println("Sinopsis   : " + buku2.getSinopsis());
        System.out.println();

        SelfUtils selfUtils = new SelfUtils();
        System.out.println("Nama Dan NIM");
        selfUtils.DisplaySelfData();
    }
}
