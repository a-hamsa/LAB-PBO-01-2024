import java.util.Scanner;

class Komik {
    String judul;
    String genre;
    int episode;
    Komik komik;

    public Komik(String judul, String genre, int episode) {
        this.judul = judul;
        this.genre = genre;
        this.episode = episode;
    }
    public Komik() {
        this.judul = "The Firts Night with the Duke";
        this.genre = "Kerajaan";
        this.episode = 103;
    }

    public void setkomik(Komik komik) {
        this.komik = komik;
    }

    public Komik getkomik() {
        return komik;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public int getEpisode() {
        return episode;
    }

    
    public void infoKomik() {
        System.out.println("Genre\t\t: " + genre);
        System.out.println("Judul\t\t: " + judul);
        System.out.println("Episode Tersisa\t: " + episode);
        System.out.println("=============================================================");
    }
    public void bacaEpisode(int jumlahEpisode) {
        if (jumlahEpisode <= episode) {
            episode -= jumlahEpisode;
            int totalEpisode = episode + jumlahEpisode;
            System.out.println("Ely's telah membaca sebanyak " + jumlahEpisode + " episode dari " + totalEpisode + " episode");
        } else {
            System.out.println("Jumlah episode hanya " + episode + " episode...");
            System.out.println("=============================================================");
        }
    }
}

public class TP3_1_H071231055 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Komik komik1 = new Komik();
        Komik komik2 = new Komik("Suddenly, I Became a Princess", "Kerajaan", 125);
        Komik komik3 = new Komik("I Wanna Be U", "Kerajaan", 205);
        Komik komik4 = new Komik("The Second Marriage", "Kerajaan", 176);
        Komik komik5 = new Komik("Kemala", "Horor", 51);
        Komik komik6 = new Komik("Killstagram", "Horor", 100);
        Komik komik7 = new Komik("Ghost Teller", "Horor", 92);
        Komik komik8 = new Komik("Ghost Path", "Horor", 15);
        Komik komik9 = new Komik("Connect", "Thriller", 78);
        Komik komik10 = new Komik("Shotgun Boy", "Thriller", 68);
        Komik komik11 = new Komik("Perfect Family", "Thriller", 55);
        Komik komik12 = new Komik("Garden of the Dead Flowers", "Thriller", 61);

        komik1.setkomik(komik2);
        komik2.setkomik(komik3);
        komik3.setkomik(komik4);
        komik4.setkomik(komik5);
        komik5.setkomik(komik6);
        komik6.setkomik(komik7);
        komik7.setkomik(komik8);
        komik8.setkomik(komik9);
        komik9.setkomik(komik10);
        komik10.setkomik(komik11);
        komik11.setkomik(komik12);

        System.out.println("=============================================================");
        System.out.println("Pilihan Genre:");
        System.out.println("1. Horor");
        System.out.println("2. Thriller");
        System.out.println("3. Kerajaan");
        System.out.print("Pilih genre komik yang ingin dibaca (1-3): ");
        int pilihanGenre = input.nextInt();
        System.out.println("=============================================================");

        String inputGenre = "";
        if (pilihanGenre == 1) {
            inputGenre = "Horor";
        } else if (pilihanGenre == 2) {
            inputGenre = "Thriller";
        } else if (pilihanGenre == 3) {
            inputGenre = "Kerajaan";
        } else {
            System.out.println("Pilihan genre tidak ada...");
            System.out.println("=============================================================");
            return;
        }

        System.out.println("Pilihan Judul:");
        if (komik1.getGenre().equals(inputGenre)) {
            System.out.println("1. " + komik1.getJudul());
        }
        if (komik2.getGenre().equals(inputGenre)) {
            System.out.println("2. " + komik2.getJudul());
        }
        if (komik3.getGenre().equals(inputGenre)) {
            System.out.println("3. " + komik3.getJudul());
        }
        if (komik4.getGenre().equals(inputGenre)) {
            System.out.println("4. " + komik4.getJudul());
        }
        if (komik5.getGenre().equals(inputGenre)) {
            System.out.println("1. " + komik5.getJudul());
        }
        if (komik6.getGenre().equals(inputGenre)) {
            System.out.println("2. " + komik6.getJudul());
        }
        if (komik7.getGenre().equals(inputGenre)) {
            System.out.println("3. " + komik7.getJudul());
        }
        if (komik8.getGenre().equals(inputGenre)) {
            System.out.println("4. " + komik8.getJudul());
        }
        if (komik9.getGenre().equals(inputGenre)) {
            System.out.println("1. " + komik9.getJudul());
        }
        if (komik10.getGenre().equals(inputGenre)) {
            System.out.println("2. " + komik10.getJudul());
        }
        if (komik11.getGenre().equals(inputGenre)) {
            System.out.println("3. " + komik11.getJudul());
        }
        if (komik12.getGenre().equals(inputGenre)) {
            System.out.println("4. " + komik12.getJudul());
        }

        System.out.print("Pilih judul komik yang dibaca (1-4): ");
        int pilihanJudul = input.nextInt();
        System.out.println("=============================================================");
        String inputJudul = "";
        if (pilihanJudul == 1 && komik1.getGenre().equals(inputGenre)) {
            inputJudul = komik1.getJudul();
        } else if (pilihanJudul == 2 && komik2.getGenre().equals(inputGenre)) {
            inputJudul = komik2.getJudul();
        } else if (pilihanJudul == 3 && komik3.getGenre().equals(inputGenre)) {
            inputJudul = komik3.getJudul();
        } else if (pilihanJudul == 4 && komik4.getGenre().equals(inputGenre)) {
            inputJudul = komik4.getJudul();
        } else if (pilihanJudul == 1 && komik5.getGenre().equals(inputGenre)) {
            inputJudul = komik5.getJudul();
        } else if (pilihanJudul == 2 && komik6.getGenre().equals(inputGenre)) {
            inputJudul = komik6.getJudul();
        } else if (pilihanJudul == 3 && komik7.getGenre().equals(inputGenre)) {
            inputJudul = komik7.getJudul();
        } else if (pilihanJudul == 4 && komik8.getGenre().equals(inputGenre)) {
            inputJudul = komik8.getJudul();
        } else if (pilihanJudul == 1 && komik9.getGenre().equals(inputGenre)) {
            inputJudul = komik9.getJudul();
        } else if (pilihanJudul == 2 && komik10.getGenre().equals(inputGenre)) {
            inputJudul = komik10.getJudul();
        } else if (pilihanJudul == 3 && komik11.getGenre().equals(inputGenre)) {
            inputJudul = komik11.getJudul();
        } else if (pilihanJudul == 4 && komik12.getGenre().equals(inputGenre)) {
            inputJudul = komik12.getJudul();
        } else {
            System.out.println("Pilihan judul tidak tidak ada...");
            System.out.println("=============================================================");
            return;
        }

        System.out.print("Masukkan banyak episode yang dibaca: ");
        int inputepisode = input.nextInt();
        System.out.println("=============================================================");
        if (komik1.getGenre().equals(inputGenre) && komik1.getJudul().equals(inputJudul)) {
            komik1.bacaEpisode(inputepisode);
            komik1.infoKomik();
        } else if (komik2.getGenre().equals(inputGenre) && komik2.getJudul().equals(inputJudul)) {
            komik2.bacaEpisode(inputepisode);
            komik2.infoKomik();
        } else if (komik3.getGenre().equals(inputGenre) && komik3.getJudul().equals(inputJudul)) {
            komik3.bacaEpisode(inputepisode);
            komik3.infoKomik();
        } else if (komik4.getGenre().equals(inputGenre) && komik4.getJudul().equals(inputJudul)) {
            komik4.bacaEpisode(inputepisode);
            komik4.infoKomik();
        } else if (komik5.getGenre().equals(inputGenre) && komik5.getJudul().equals(inputJudul)) {
            komik5.bacaEpisode(inputepisode);
            komik5.infoKomik();
        } else if (komik6.getGenre().equals(inputGenre) && komik6.getJudul().equals(inputJudul)) {
            komik6.bacaEpisode(inputepisode);
            komik6.infoKomik();
        } else if (komik7.getGenre().equals(inputGenre) && komik7.getJudul().equals(inputJudul)) {
            komik7.bacaEpisode(inputepisode);
            komik7.infoKomik();
        } else if (komik8.getGenre().equals(inputGenre) && komik8.getJudul().equals(inputJudul)) {
            komik8.bacaEpisode(inputepisode);
            komik8.infoKomik();
        } else if (komik9.getGenre().equals(inputGenre) && komik9.getJudul().equals(inputJudul)) {
            komik9.bacaEpisode(inputepisode);
            komik9.infoKomik();
        } else if (komik10.getGenre().equals(inputGenre) && komik10.getJudul().equals(inputJudul)) {
            komik10.bacaEpisode(inputepisode);
            komik10.infoKomik();
        } else if (komik11.getGenre().equals(inputGenre) && komik11.getJudul().equals(inputJudul)) {
            komik11.bacaEpisode(inputepisode);
            komik11.infoKomik();
        } else if (komik12.getGenre().equals(inputGenre) && komik12.getJudul().equals(inputJudul)) {
            komik12.bacaEpisode(inputepisode);
            komik12.infoKomik();
        } else {
            System.out.println("Komik dengan genre dan judul tersebut tidak ada...");
            System.out.println("=============================================================");
        }
        input.close();
    }
}