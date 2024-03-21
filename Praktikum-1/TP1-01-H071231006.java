import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Masukkan Jumlah Bilangan :");

        int totalBulat = 0;
        int totalDesimal = 0;

        try {

            int n = scanner.nextInt();
            System.out.println("Masukkan Bilangan :");

            for (int i = 0; i < n; i++) {
                double Bilangan = scanner.nextDouble();
                if (Bilangan % 1 == 0) {
                    totalBulat++;     
                } else {
                    totalDesimal++;
                }
            }

            System.out.println(totalBulat + " Bilangan Bulat");
            System.out.println(totalDesimal + " Bilangan Desimal");

        } catch (Exception e) {
            System.out.println("Inputan harus berupa angka");

            scanner.close();
        }
    } 
}