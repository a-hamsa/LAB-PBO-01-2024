import java.util.ArrayList;

class MeowCare{
    int kapasitasMaksimum, jumlahPasienSekarang;
    ArrayList<Pasien> daftarPasien;

    public MeowCare(int kapasitasMaksimum){
        this.kapasitasMaksimum = kapasitasMaksimum;
        this.daftarPasien = new ArrayList<>();
        this.jumlahPasienSekarang = 0;
    }

    public MeowCare() {
        this.kapasitasMaksimum = 7;
    }
    
    public void tambahPasien(String namaOwner, String namaHewan, String jenisHewan, double usiaHewan){
        if(jumlahPasienSekarang < kapasitasMaksimum){
            Pasien pasienBaru = new Pasien(namaOwner, namaHewan, jenisHewan, usiaHewan);
            daftarPasien.add(pasienBaru);
            jumlahPasienSekarang++;
            System.out.println("Pasien baru telah ditambahkan");
        } else{
            System.out.println("Maaf Meowcare saat ini sedang penuh, tidak dapat menambahkan pasien baru");
        }
    }
 
    public void dibawaPulangOwner(String namaOwner, String namaHewan) {
        for (Pasien pasien : daftarPasien) {
            if (pasien.getNamaOwner().equals(namaOwner) && pasien.getNamaHewan().equals(namaHewan)) {
                daftarPasien.remove(pasien);
                jumlahPasienSekarang--;
                System.out.println("Pasien " + namaHewan + " milik " + namaOwner + " telah dibawa pulang.");
                return;
            }
        }
        System.out.println("Pasien tidak terdaftar.");      
    }
    

    public void daftarPasienSaatIni() {
        System.out.println("--------------------------------------------------");
        System.out.println("\t\tDaftar Pasien Hewan:");
        System.out.println("--------------------------------------------------");
        for (Pasien pasien : daftarPasien) {
            System.out.println("Nama Pemilik: " + pasien.getNamaOwner());
            System.out.println("Nama Pasien : " + pasien.getNamaHewan());
            System.out.println("Jenis Hewan : " + pasien.getJenisHewan());
            System.out.println("Usia Pasien : " + pasien.getUsiaHewan());
            System.out.println("--------------------------------------------------");
        }
    }
}
class Pasien{
    String namaOwner, namaHewan, jenisHewan;
    double  usiaHewan;

    public Pasien(String namaOwner, String namaHewan, String jenisHewan, double usiaHewan){
        this.namaOwner = namaOwner;
        this.namaHewan = namaHewan;
        this.jenisHewan = jenisHewan;
        this.usiaHewan = usiaHewan;
    }

    public String getNamaOwner() {
        return namaOwner;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public String getUsiaHewan() {
        return (usiaHewan < 1) ? usiaHewan + " Bulan" : usiaHewan + " Tahun";
    }

}
class TP3_1_H071231051{
    public static void main(String[] args) {
        MeowCare meowCare = new MeowCare(3);
        meowCare.tambahPasien("Naura", "Momo", "Kucing", 0.5);
        meowCare.tambahPasien("Syifa", "Lily", "Kucing", 1.5);
        meowCare.tambahPasien("Bambang", "Vals", "Kucing", 3);
        meowCare.tambahPasien("Anton", "Poby", "Kucing", 5);

        meowCare.daftarPasienSaatIni();

        meowCare.dibawaPulangOwner("Bambang", "Momo");
        meowCare.dibawaPulangOwner("Naura", "Momo");

        meowCare.tambahPasien("Anton", "Poby", "Kucing", 5);


        meowCare.daftarPasienSaatIni();
    }
}