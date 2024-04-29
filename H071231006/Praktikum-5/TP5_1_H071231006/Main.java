package TP5_1_H071231006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("====== BANGUN RUANG ======");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG\n");
        System.out.println("====== BANGUN DATAR =====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.print("Pilihan : ");
        int pilihan = scanner.nextInt();
        System.out.println("------------------------------------------------------------------------------------");
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisiKubus = scanner.nextDouble();
                Kubus kubus = new Kubus(sisiKubus);
                System.out.println("Volume kubus: " + kubus.hitungVolume());
                System.out.println("Luas permukaan kubus: " + kubus.hitungLuas());
                break;
            case 2:
                System.out.print("Masukkan panjang balok: ");
                double panjangBalok = scanner.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double lebarBalok = scanner.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double tinggiBalok = scanner.nextDouble();
                Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                System.out.println("Volume balok: " + balok.hitungVolume());
                System.out.println("Luas permukaan balok: " + balok.hitungLuas());
                break;
            case 3:
                System.out.print("Masukkan panjang jari-jari bola: ");
                double jariJariBola = scanner.nextDouble();
                Bola bola = new Bola(jariJariBola);
                System.out.println("Volume bola: " + bola.hitungVolume());
                System.out.println("Luas permukaan bola: " + bola.hitungLuas());
                break;
            case 4:
                System.out.print("Masukkan jari-jari tabung: ");
                double jariJariTabung = scanner.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double tinggiTabung = scanner.nextDouble();
                Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                System.out.println("Volume tabung: " + tabung.hitungVolume());
                System.out.println("Luas permukaan tabung: " + tabung.hitungLuas());
                break;
            case 5:
                System.out.print("Masukkan panjang sisi persegi: ");
                double sisiPersegi = scanner.nextDouble();
                Persegi persegi = new Persegi(sisiPersegi);
                System.out.println("Luas persegi: " + persegi.hitungLuas());
                System.out.println("Keliling persegi: " + persegi.hitungKeliling());
                break;
            case 6:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjangPersegiPanjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebarPersegiPanjang = scanner.nextDouble();
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                System.out.println("Luas persegi panjang: " + persegiPanjang.hitungLuas());
                System.out.println("Keliling persegi panjang: " + persegiPanjang.hitungKeliling());
                break;
            case 7:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJariLingkaran = scanner.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
                System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
                break;
            case 8:
                System.out.print("Masukkan panjang sisi 1 trapesium: ");
                double sisi1 = scanner.nextDouble();
                System.out.print("Masukkan panjang sisi 2 trapesium: ");
                double sisi2 = scanner.nextDouble();
                System.out.print("Masukkan panjang sisi 3 trapesium: ");
                double sisi3 = scanner.nextDouble();
                System.out.print("Masukkan panjang sisi 4 trapesium: ");
                double sisi4 = scanner.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double tinggiTrapesium = scanner.nextDouble();
                Trapesium trapesium = new Trapesium(sisi1, sisi2, sisi3, sisi4,tinggiTrapesium);
                System.out.println("Luas trapesium: " + trapesium.hitungLuas());
                System.out.println("Keliling trapesium: " + trapesium.hitungKeliling());
                System.out.println("------------------------------------------------------------------------------------");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}