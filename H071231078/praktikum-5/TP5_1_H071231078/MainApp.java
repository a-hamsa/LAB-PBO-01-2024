package TP5_1_H071231078;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("===== Bangun Ruang====");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung");
        System.out.println("===== Bangun Datar====");
        System.out.println("5. Persegi");
        System.out.println("6. Persegi Panjang");
        System.out.println("7. lingkaran");
        System.out.println("8. Trapesium");
        System.out.println("9. Keluar");
        System.out.println("--------------------------");
        System.out.print("Masukkan Pilihan : ");
        int Pilihan = scan.nextInt();
        System.out.println("--------------------------");

        switch (Pilihan) {
            case 1:
                kubus kubus = new kubus();
                kubus.LuasDanVolume();
                break;
            case 2:
                balok balok = new balok();
                balok.LuasDanVolume();
                break;
            case 3:
                bola bola = new bola();
                bola.LuasDanVolume();
                break;
            case 4:
                tabung tabung = new tabung();
                tabung.LuasDanVolume();
                break;
            case 5:
                persegi persegi = new persegi();
                persegi.LuasDanVolume();
                break;
            case 6:
                persegiPanjang persegiPanjang = new persegiPanjang();
                persegiPanjang.LuasDanVolume();
                break;
            case 7:
                lingkaran lingkaran = new lingkaran();
                lingkaran.LuasDanVolume();
                break;
            case 8:
                trapesium trapesium = new trapesium();
                trapesium.LuasDanVolume();
                break;

            default:
                break;
            
        }
        scan.close();
    }

}
