import java.util.Scanner;

public class TP1_4_H071231078 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan r : ");
        
        try {
            int r = scan.nextInt();
            double luas_lingkaran = r * r * 3.14;
            System.out.printf("Luas Lingkaran Adalah : %.2f%n", luas_lingkaran);
            scan.close();
        } catch (Exception e) {
            System.out.println("ERROR : Input Bukan Bilangan...!!");
        }
        
        
    }
}
