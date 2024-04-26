package TP5_1_H071231051;
import java.util.Scanner;

public class TP5_1_H071231051 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("--------------------------------------------------");
        System.out.println("------------------ BANGUN RUANG ------------------");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println("------------------ BANGUN DATAR ------------------");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");
        System.out.println("--------------------------------------------------");
        System.out.print("Pilihan : ");
        int pilihan = scan.nextInt();
        System.out.println("--------------------------------------------------");

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi: ");
                double sisiKubus = scan.nextDouble();
                Kubus kubus = new Kubus(sisiKubus);
                System.out.println("Luas Kubus   : " + kubus.hitungLuas());
                System.out.println("Volume Kubus : " + kubus.hitungVolume());
                System.out.println("--------------------------------------------------");
                break;
            case 2:
                System.out.print("Masukkan panjang Balok:");
                double panjangBalok = scan.nextDouble();
                System.out.print("Masukkan lebar Balok :");
                double lebarBalok = scan.nextDouble();
                System.out.print("Masukkan tinggi Balok:");
                double tinggiBalok = scan.nextDouble();
                Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                System.out.println("Luas Balok   : " + balok.hitungLuas());
                System.out.println("Volume Balok : " + balok.hitungVolume());
                System.out.println("--------------------------------------------------");
                break;
            case 3:
                System.out.print("Masukkan jari-jari Bola: ");
                double r = scan.nextDouble();
                Bola bola = new Bola(r);
                System.out.println("Luas Bola    : " + bola.hitungLuas());
                System.out.println("Volume Bola  : " + bola.hitungVolume());
                System.out.println("--------------------------------------------------");
                break;
            case 4:
                System.out.print("Masukkan jari-jari Tabung: ");
                double jariJari = scan.nextDouble();
                System.out.print("Masukkan tinggi Tabung   : ");
                double tinggiTabung = scan.nextDouble();
                Tabung tabung = new Tabung(jariJari, tinggiTabung);
                System.out.println("Luas Tabung   : " + tabung.hitungLuas());
                System.out.println("Volume Tabung : " + tabung.hitungVolume());
                System.out.println("--------------------------------------------------");
                break;
            case 5:
                System.out.print("Masukkan panjang sisi Persegi: ");
                double sisiPersegi = scan.nextDouble();
                Persegi persegi = new Persegi(sisiPersegi);
                System.out.println("Keliling Persegi : " + persegi.hitungKeliling());
                System.out.println("Luas Persegi     : " + persegi.hitungLuas());
                System.out.println("--------------------------------------------------");
                break;
            case 6:
                System.out.print("Masukkan panjang Persegi Panjang: ");
                double panjangPersegiPanjang = scan.nextDouble();
                System.out.print("Masukkan lebar Persegi Panjang  : ");
                double lebarPersegiPanjang = scan.nextDouble();
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                System.out.println("Keliling Persegi Panjang : " + persegiPanjang.hitungKeliling());
                System.out.println("Luas Persegi Panjang     : " + persegiPanjang.hitungLuas());
                System.out.println("--------------------------------------------------");
                break;
            case 7: 
                System.out.print("Masukkan jari-jari Lingkaran: ");
                double rLingkaran = scan.nextDouble();
                Lingkaran lingkaran = new Lingkaran(rLingkaran);
                System.out.println("Keliling Lingkaran : " + lingkaran.hitungKeliling());
                System.out.println("Luas Lingkaran     : " + lingkaran.hitungLuas());
                System.out.println("--------------------------------------------------");
                break;
            case 8:
                System.out.print("Masukkan sisi 1 Trapesium: ");
                double a = scan.nextDouble();
                System.out.print("Masukkan sisi 2 Trapesium: ");
                double b = scan.nextDouble();
                System.out.print("Masukkan sisi 3 Trapesium: ");
                double c = scan.nextDouble();
                System.out.print("Masukkan sisi 4 Trapesium: ");
                double d = scan.nextDouble();
                System.out.print("Masukkan tinggi Trapesium: ");
                double t = scan.nextDouble();
                Trapesium trapesium = new Trapesium(a, b, c, d, t);
                System.out.println("Keliling Trapesium: " + trapesium.hitungKeliling());
                System.out.println("Luas Trapesium    : " + trapesium.hitungLuas());
                System.out.println("--------------------------------------------------");
                break;

            default:
                break;
            }
            scan.close();
    }
}