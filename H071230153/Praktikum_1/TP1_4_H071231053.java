package Praktikum_1;
import java.util.Scanner;

public class TP1_4_H071231053 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        double r, luas; 
        try {
            System.out.print("Masukkan Jari-Jari Lingkaran : ");
            r = inputan.nextDouble();
            inputan.close();

        } catch (Exception e) {
            System.out.println("Input Harus Berupa Angka. Coba Lagi!");
            return;
        }
            
        luas = Math.PI * r * r;
        System.out.printf("Luas Lingkaran : %.2f\n", luas);
    }
    
}
