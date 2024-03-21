import java.util.Scanner;

public class TP1_2_H071231059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Judul Film : ");
        String input = scanner.nextLine().toLowerCase();

        String[] kata = input.split("\\s+");
        String judul = "";

        for (int i = 0; i < kata.length; i++) {
            String huruf = kata[i].substring(0,1).toUpperCase(); 
            judul += huruf + kata[i].substring(1) + " ";
        } 
    System.out.println("> " + judul.trim());
    scanner.close();
    }
}
        