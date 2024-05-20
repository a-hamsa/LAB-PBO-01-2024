import java.util.Scanner;

public class Keluarga {
    boolean sudahMenikah;
    Scanner scanner;

    public Keluarga (Scanner scanner) {
        this.scanner = scanner;
    }

    void nikah(){
        System.out.println("Apakah sudah menikah? (ya/tidak)");
        String jawabanNikah = scanner.nextLine();
        String sudahMenikah = scanner.nextLine();
    }

    boolean isSudahMenikah(){
        return sudahMenikah;
    }

}
