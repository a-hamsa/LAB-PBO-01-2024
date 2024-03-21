import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int N = input.nextInt();
            int buLat = 0;
            int desiMal = 0;
            for (int i = 0; i < N; i++) {
                float x = input.nextFloat();
                if (x % 1 == 0) {
                    buLat++;
                } else {
                    desiMal++;
                }
            }
            input.close();
            System.out.println(buLat + " Bilangan Bulat");
            System.out.println(desiMal + " Bilangan Desimal");
        } catch (Exception e) {
            System.out.println("Silahkan Masukkan Angka!");
        }
    }
}