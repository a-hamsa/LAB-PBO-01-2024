import java.util.Scanner;

public class Pengalaman extends Kehidupan {
    String[] pengalaman = {"Freelancer", "Magang", "Pekerja tetap", "Tidak ada"};
    int inputPengalaman;
    int gajiSebelum;

    @Override
    public void prosesKehidupan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Pengalaman Sebelumnya:");
        System.out.println("=========================");
        for (int i = 0; i < pengalaman.length; i++) {
            System.out.println((i + 1) + "." + pengalaman[i]);
        }
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Input: ");
                inputPengalaman = Integer.parseInt(scanner.nextLine());
                if (inputPengalaman >= 1 && inputPengalaman <= pengalaman.length) {
                    validInput = true;  
                } else {
                    System.out.println("Pilihan Tidak Valid.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inputan harus berupa Angka.");
            }
        }
        if (inputPengalaman != 4) {
            System.out.print("Gaji sebelumnya: ");
            boolean validGaji = false;
            while (!validGaji) {
                try {
                    gajiSebelum = Integer.parseInt(scanner.nextLine());
                    validGaji = true;
                } catch (NumberFormatException e) {
                    System.out.println("Inputan gaji harus berupa angka.");
                    System.out.print("Gaji sebelumnya: ");
                }
            }
        }
    }

    public int getInputPengalaman() {
        return inputPengalaman;
    }

    public double getGajiSebelumnya() {
        return gajiSebelum;
    }
}
