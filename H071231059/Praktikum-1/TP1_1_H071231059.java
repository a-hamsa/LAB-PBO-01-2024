import java.util.Scanner;
public class TP1_1_H071231059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah bilangan: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String input = scanner.nextLine();

        String[] pisah = input.split("\\s+");
        double[] bilangan = new double[pisah.length];

        if (pisah.length == n) {
            for (int i = 0; i < pisah.length; i++) {
                try {
                    bilangan[i] = Double.parseDouble(pisah[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Input anda salah. Input harus berupa angka");
                    scanner.close();
                    return; 
                }
            }

        int bulat = 0;
        int desimal = 0;

        for(int j = 0; j < n; j++ ) {
            if (bilangan[j] == (int) bilangan[j]) {
                bulat++;
            }else {
                desimal++;
            }        
        }
            System.out.println(bulat + " Bilangan Bulat");
            System.out.println(desimal + " Bilangan Desimal");

        } else {
            System.out.println("Jumlah bilangan yang anda masukkan salah.");
        }
        scanner.close(); 
    } 
}