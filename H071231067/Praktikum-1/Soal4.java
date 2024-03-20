import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Masukkan Jari - Jari Lingkaran = ");
            double jari_jari = scan.nextDouble();

            double luas = 3.14159 * jari_jari * jari_jari;
            String hasil = String.format("%.2f",luas);
            System.out.println("Luas Lingkaran = " + hasil);

        } catch (Exception e) {
            System.out.println("jari-jari tidak valid");
        }finally{
            scan.close();
        }
    }
}