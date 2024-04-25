import java.security.PublicKey;

public class Series {
    String judul,sutradara,genre,sinopsis;
    int jumlahEpisode;


    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
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

    public int getJumlahEpisode() {
        return jumlahEpisode;
    }

    public void setJumlahEpisode(int jumlahEpisode) {
        this.jumlahEpisode = jumlahEpisode;
    }

    public Series(){
    }

    public Series(String judul, String sutradara, String genre, String sinopsis, int jumlahEpisode){
        this.judul = judul;
        this.sutradara = sutradara;
        this.genre = genre;
        this.sinopsis = sinopsis;
        this.jumlahEpisode = jumlahEpisode;
    }
    public void displayInfo(){
        System.out.println("judul : "+ getJudul());
        System.out.println("sutradara : "+ getSutradara());
        System.out.println("genre : "+ getGenre());
        System.out.println("sinopsis : "+ getSinopsis());
        System.out.println("jumlah episode : "+ getJumlahEpisode());
    }

    


    
}

