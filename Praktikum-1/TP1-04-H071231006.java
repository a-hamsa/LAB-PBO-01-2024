import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {

        try {
            
            Scanner scanner = new Scanner(System.in);
            int jarijari = scanner.nextInt();
            double hasil = Math.PI*jarijari*jarijari;
            System.out.printf("%.2f", hasil);
            scanner.close();

        } catch (Exception e) {
             System.out.println("Inputan harus berupa angka");
        }
    }
}