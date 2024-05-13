package LiveCoding;

import java.util.Scanner;

public class Pengalamann extends Kehidupann {
    String[] pengalaaman = {"Freelancer", "Magang", "Pekerjaan Tetap", "Tidak", "Lainnya"};
    String pengalamanLainnyaa;
    int inputPengalamann;
    double gajiSebeelumnya;

    public void prosesKehidupann(Scanner scan){
        System.out.println("Pengalaman Sebelumnya: ");
        for(int i = 0; i < pengalaaman.length; i++){
            System.out.println((i + 1) + ". " + pengalaaman[i]);
        }

        try {
            System.out.print("input: ");
            inputPengalamann = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("inputan harus angka");
        }

        if(inputPengalamann == 5){
            System.out.print("masukkan pengalaman lain");
            pengalamanLainnyaa = scan.nextLine();
            prosesKehidupann(pengalamanLainnyaa, gajiSebeelumnya);
        }
        if(inputPengalamann != 4){
            System.out.print("masukkan gaji: ");
            gajiSebeelumnya = Double.parseDouble(scan.nextLine());
        }

    }

    public void prosesKehidupann(String pengalamanLainnyaa, double gajiSebeelumnya){
        this.pengalamanLainnyaa = pengalamanLainnyaa;
        this.gajiSebeelumnya = gajiSebeelumnya;

    }

    public String[] getPengalaaman() {
        return pengalaaman;
    }

    public void setPengalaaman(String[] pengalaaman) {
        this.pengalaaman = pengalaaman;
    }

    public String getPengalamanLainnyaa() {
        return pengalamanLainnyaa;
    }

    public void setPengalamanLainnyaa(String pengalamanLainnyaa) {
        this.pengalamanLainnyaa = pengalamanLainnyaa;
    }

    public int getInputPengalamann() {
        return inputPengalamann;
    }

    public void setInputPengalamann(int inputPengalamann) {
        this.inputPengalamann = inputPengalamann;
    }

    public double getGajiSebeelumnya() {
        return gajiSebeelumnya;
    }

    public void setGajiSebeelumnya(double gajiSebeelumnya) {
        this.gajiSebeelumnya = gajiSebeelumnya;
    }
}
