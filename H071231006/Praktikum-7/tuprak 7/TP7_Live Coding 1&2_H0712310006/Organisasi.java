import java.util.Scanner;

public class Organisasi {
    String jenisOrganisasi;
    Scanner scanner;

    // Konstruktor untuk inisialisasi scanner
    public Organisasi(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getJenisOrganisasi() {
        return jenisOrganisasi;
    }

    void setJenisOrganisasi() {
        System.out.println("Organisasi:");
        System.out.println("1. Olahraga");
        System.out.println("2. Sosial");
        System.out.println("3. Akademik");
        System.out.println("4. Tidak ada");
        System.out.print("Input: ");
        int jenis = Integer.parseInt(scanner.nextLine());
        switch (jenis) {
            case 1:
                jenisOrganisasi = "Olahraga";
                break;
            case 2:
                jenisOrganisasi = "Sosial";
                break;
            case 3:
                jenisOrganisasi = "Akademik";
                break;
            case 4:
                jenisOrganisasi = "Tidak ada";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        
    }
}