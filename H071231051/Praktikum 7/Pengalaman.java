import java.util.Scanner;

public class Pengalaman extends Kehidupan {
    String[] pengalaman = {"Freelancer", "Magang", "Pekerja Tetap", "Tidak ada", "Lainnya"};
    String pengalamanLain;
    int inputPengalaman;
    double gajiSebelumnya;
    String inputOrganisasi;

    public void prosesKehidupan(Scanner scan) {
        System.out.println("Pengalaman sebelumnya:");
        for (int i = 0; i < pengalaman.length; i++) {
            System.out.println((i + 1) + ". " + pengalaman[i]);
        }
        boolean cekInput = false;
        do {
            try {
                System.out.print("Input: ");
                inputPengalaman = Integer.parseInt(scan.nextLine());
                if (inputPengalaman >= 1 && inputPengalaman <= pengalaman.length) {
                    cekInput = true;
                } else {
                    System.out.println("inputan tidak valid. Silahkan masukkan angka 1-5");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inputan harus berupa angka");
            }
        } while (!cekInput);
        if (inputPengalaman == 5){
            do {
                System.out.print("Pengalaman Lainnya: ");
                pengalamanLain = scan.nextLine();
                if (pengalamanLain.isEmpty()) {
                    System.out.println("Pengalaman Lainnya tidak boleh kosong.");
                }
            } while (pengalamanLain.isEmpty());
            prosesKehidupan(pengalamanLain, gajiSebelumnya, inputOrganisasi);
        }
        
        if (inputPengalaman != 4) {
            System.out.print("Gaji sebelumnya: ");
            gajiSebelumnya = Double.parseDouble(scan.nextLine());
        }
        System.out.print("Pengalaman Organisasi: ");
        inputOrganisasi = scan.nextLine();

    }

    public void prosesKehidupan(String pengalamanLain, double gajiSebelumnya, String inputOrganisasi) {
        this.pengalamanLain = pengalamanLain;
        this.gajiSebelumnya = gajiSebelumnya;
        this.inputOrganisasi = inputOrganisasi;
    }

    public String[] getPengalaman() {
        return pengalaman;
    }

    public void setPengalaman(String[] pengalaman) {
        this.pengalaman = pengalaman;
    }

    public int getInputPengalaman() {
        return inputPengalaman;
    }

    public void setInputPengalaman(int inputPengalaman) {
        this.inputPengalaman = inputPengalaman;
    }

    public double getGajiSebelumnya() {
        return gajiSebelumnya;
    }

    public void setGajiSebelumnya(double gajiSebelumnya) {
        this.gajiSebelumnya = gajiSebelumnya;
    }

    public String getInputOganisasi() {
        return inputOrganisasi;
    }

    public void setInputOganisasi(String inputOrganisasi) {
        this.inputOrganisasi = inputOrganisasi;
    }
}
