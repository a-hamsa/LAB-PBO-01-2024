import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Input jari-jari: ");
            double r = input.nextDouble();
            double luas = 3.1415 * r * r;
            String format = String.format("%.2f", luas);
            System.out.println("Luas lingkaran: " + format);
        } catch (Exception e) {
            System.out.println("Input invalid");
        }
    }
}
