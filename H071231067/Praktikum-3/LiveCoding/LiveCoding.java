package LiveCoding;

class Senjata {
    String nama;
    int damage = 10;

    public Senjata() {
    }

    public Senjata(String nama, int damage) {
        this.nama = nama;
        this.damage = damage;
    }

    public String getNama() {
        return nama;
    }

    public int getDamage() {
        return damage;
    }
}

class Karakter {
    String namaChar;
    Senjata senjata = new Senjata();
    int nyawa;

    public Karakter(String namaChar, int nyawa, Senjata senjata) {
        this.namaChar = namaChar;
        this.nyawa = nyawa;
        this.senjata = senjata;
    }

    public void Serang(Karakter musuh) {
        musuh.nyawa -= this.senjata.getDamage();
        System.out.printf("%s menyerang %s\n", this.namaChar, musuh.namaChar);
        if (musuh.nyawa <= 0) {
            System.out.printf("%s Kalah\n", musuh.namaChar);
        }
    }

    public void CheckStatus() {
        System.out.println("Status = ");
        System.out.println("Nama             : " + this.namaChar);
        System.out.println("Nyawa            : " + this.nyawa);
        System.out.println("Nama Senjata     : " + this.senjata.getNama());
        System.out.println("Damage Senjata   : " + this.senjata.getDamage());
        System.out.println("=================================================");
    }
}

public class LiveCoding {
    public static void main(String[] args) {
        Senjata senjata1 = new Senjata("pedang", 10);
        Karakter karakter1 = new Karakter("Budi", 100, senjata1);

        Senjata senjata2 = new Senjata("panah", 10);
        Karakter karakter2 = new Karakter("Rudi", 100, senjata2);

        karakter1.CheckStatus();
        karakter2.CheckStatus();
        karakter1.Serang(karakter2);
        karakter2.Serang(karakter1);
    }
}
