package Praktikum_1;
import java.util.*;

public class TP1_1_H071231053 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Bilangan : ");
        int n = inputan.nextInt();
        inputan.nextLine();

        int BilBul = 0;
        int BilDes = 0;

        System.out.print("Masukkan " + n + " Bilangan : ");
        String bilangan = inputan.nextLine();
        String[] angka = bilangan.split(" ");

        inputan.close();

        for (String angkaBaru : angka) {
            try { 
                double ang = Double.parseDouble(angkaBaru);
                if (ang == (int) ang) {
                    BilBul++;   
                } else {
                    BilDes++;
                }
            } catch (Exception e) {
                System.out.println("Input Harus Berupa Angka. Coba Lagi!");
                return;
            }

        }
        
        System.out.println("\nTerdapat " + BilBul + " Bilangan Bulat" );
        System.out.println("Terdapat " + BilDes + " Bilangan Desimal" );
    }
    
}
