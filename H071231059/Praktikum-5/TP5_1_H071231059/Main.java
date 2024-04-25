package TP5_1_H071231059;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printBariers();
        System.out.println("===== BANGUN RUANG =====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");

        System.out.println();

        System.out.println("===== BANGUN DATAR =====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");

        printBariers();
        System.out.println("Pilihan: ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                try {
                    System.out.println("Masukkan rusuk kubus: ");
                    double rusuk = sc.nextDouble();

                    Kubus kubus = new Kubus(rusuk);
                    System.out.println("Luas permukaan kubus: " + kubus.hitungLuasPermukaan());
                    System.out.println("Volume kubus: " + kubus.hitungVolume());
                } catch (Exception e) {
                    System.out.println("Inputan harus bersifat angka.");
                    break;
                }
                break;
            case 2:
            try {  
                System.out.println("Masukkan panjang balok: ");
                double panjang = sc.nextDouble();

                System.out.println("Masukkan lebar balok: ");
                double lebar = sc.nextDouble();

                System.out.println("Masukkan tinggi balok: ");
                double tinggi = sc.nextDouble();

                Balok balok = new Balok(panjang, lebar, tinggi);

                System.out.println("Luas permukaan balok: " + balok.hitungLuasPermukaan());
                System.out.println("Volume balok: " + balok.hitungVolume());
            } catch (Exception e) {
                System.out.println("Inputan harus bersifat angka.");
                break;
            }
                break;
            case 3:
                try { 
                    System.out.println("Masukkan jari-jari bola: ");
                    double jariJari = sc.nextDouble();

                    Bola bola = new Bola(jariJari);
                    System.out.printf("Luas permukaan bola:  %.2f", bola.hitungLuasPermukaan());
                    System.out.println();
                    System.out.printf("Volume bola: %.2f", bola.hitungVolume());
                } catch (Exception e) {
                    System.out.println("Inputan harus bersifat angka.");
                    break;
                }
                break;
            case 4:
            try { 
                System.out.println("Masukkan jari-jari tabung: ");
                double jariJari = sc.nextDouble();
                System.out.println("Masukkan tinggi tabung: ");
                double tinggi = sc.nextDouble();

                Tabung tabung = new Tabung(jariJari, tinggi);
                System.out.printf("Luas permukaan tabung:  %.2f", tabung.hitungLuasPermukaan());
                System.out.println();
                System.out.printf("Volume tabung: %.2f", tabung.hitungVolume());
            } catch (Exception e) {
                System.out.println("Inputan harus bersifat angka.");
                break;
            }
                break;
            case 5:
               try {
                    System.out.println("Masukkan sisi persegi: ");
                    double sisi = sc.nextDouble();

                    Persegi persegi = new Persegi(sisi);

                    System.out.println("Luas persegi: " + persegi.hitungLuas());
                    System.out.println("Keliling: " + persegi.hitungKeliling());
               } catch (Exception e) {
                    System.out.println("Inputan harus bersifat angka.");
               }
                break;
            case 6:
                try {
                    System.out.println("Masukkan panjang persegipanjang: ");
                    double panjang = sc.nextDouble();

                    System.out.println("Masukkan lebar persegipanjang: ");
                    double lebar = sc.nextDouble();

                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

                    System.out.println("Luas persegipanjang: " + persegiPanjang.hitungLuas());
                    System.out.println("Keliling: " + persegiPanjang.hitungKeliling());
                } catch (Exception e) {
                    System.out.println("Inputan harus bersifat angka.");
                }
                break;
            case 7:
                try {
                    System.out.println("Masukkan jari-jari lingkaran: ");
                    double jariJari = sc.nextDouble();

                    Lingkaran lingkaran = new Lingkaran(jariJari);

                    System.out.printf("Luas lingkaran:  %.2f", lingkaran.hitungLuas());
                    System.out.println();
                    System.out.printf("Keliling lingkaran: %.2f", lingkaran.hitungKeliling());
                } catch (Exception e) {
                    System.out.println("Inputan harus bersifat angka.");
                }
                break;
            case 8:
                try {
                    System.out.println("Masukkan sisi 1 trapesium: ");
                    double sisi1 = sc.nextDouble();

                    System.out.println("Masukkan sisi 2 trapesium: ");
                    double sisi2 = sc.nextDouble();

                    System.out.println("Masukkan sisi 3 trapesium: ");
                    double sisi3 = sc.nextDouble();

                    System.out.println("Masukkan sisi 4 trapesium: ");
                    double sisi4 = sc.nextDouble();

                    System.out.println("Masukkan tinggi trapesium: ");
                    double tinggi = sc.nextDouble();

                    Trapesium trapesium = new Trapesium(sisi1, sisi2, sisi3, sisi4, tinggi);

                    System.out.println("Luas trapesium: " + trapesium.hitungLuas());
                    System.out.println("Keliling: " + trapesium.hitungKeliling());
                } catch (Exception e) {
                    System.out.println("Inputan harus bersifat angka.");
                }
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        sc.close();
    }

    public static void printBariers() {
        System.out.println("------------------------------");
    }
}
