import java.util.Scanner;

public class Keluarga extends Kehidupan {
    String status;

    public void prosesKehidupan(Scanner scan) {
        System.out.print("Status(Menikah/Belum Menikah): ");
        while (true) {
            status = scan.nextLine().toUpperCase();
            if (status.equals("MENIKAH") || status.equals("BELUM MENIKAH")) {
                break;
            } else {
                System.out.println("Inputan yang dimasukkan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
