import java.util.Scanner;

public class Keluarga {
    boolean sudahMenikah;
    Scanner scanner;

    // Konstruktor untuk inisialisasi scanner
    public Keluarga(Scanner scanner) {
        this.scanner = scanner;
    }

    void nikah() {
        System.out.print("Apakah sudah menikah? (ya/tidak): ");
        String jawabanNikah = scanner.nextLine();
        sudahMenikah = jawabanNikah.equalsIgnoreCase("ya");
    }

    boolean isSudahMenikah() {
        return sudahMenikah;
    }
}
