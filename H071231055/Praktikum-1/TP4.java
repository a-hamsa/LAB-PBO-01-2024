import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
        System.out.print("Masukkan jari-jari lingkaran : ");
        double r = input.nextInt();
        double hasil = Math.PI * r * r;
        System.out.printf("%.2f", hasil);
        input.close();
        }catch (Exception e){
            System.out.println("Inputan bukan angka");
        }
    }
}