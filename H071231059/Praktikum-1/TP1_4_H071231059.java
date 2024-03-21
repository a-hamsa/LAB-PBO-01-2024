import java.text.DecimalFormat;
import java.util.Scanner;

public class TP1_4_H071231059 {
    public static void main(String[] args) {
        double pi = Math.PI;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Jari-jari: ");
        double r = scanner.nextDouble();

        try {
            double luas = LuasLingkaran(r, pi);
            DecimalFormat desimal = new DecimalFormat("#.##");
            String luas2 = desimal.format(luas);

            System.out.println("Luas lingkaran adalah " + luas2);
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Input harus bersifat angka.");
            return;
        }  
    }
    public static double LuasLingkaran(double r, double pi) {
        return pi * r * r;
    }
}
    


