package LV1_1_H071231055;

import java.util.Scanner;

public class Pengalaman extends Kehidupan {
    Scanner input = new Scanner(System.in);
    String[] pengalaman = {"Freelancer", "Magang", "Pekerja Tetap", "Tidak ada"};
    int inputPengalaman;
    double gajiSebelumnya;
    
    public String getPengalaman() {
        return pengalaman [inputPengalaman];
    }
    public int getInputPengalaman() {
        return inputPengalaman;
    }
    public double getGajiSebelumnya() {
        return gajiSebelumnya;
    }
    @Override
    void prosesKehidupan() {
        System.out.println("Pengalaman sebelumnya:");
        for (int i = 0; i < pengalaman.length; ++i){
            System.out.println((i + 1) + ". " + pengalaman[i]);
        }
    
    boolean validInput = false;
    while (!validInput){
        try{
            System.out.println("Input: ");
            inputPengalaman = (int) Integer.parseInt(input.nextLine());
            if (inputPengalaman >= 1 && inputPengalaman <= pengalaman.length){
                validInput = true;
            } else {
                System.out.println("Pilihan tidak valid...");
            }
        } catch (NumberFormatException e){
            System.out.println("Inputan harus angka...");
        }
    }
    if (inputPengalaman != 4){
        boolean notValidInput = true;
        while (notValidInput){
            try{
                System.out.println("Gaji Sebelumnya: ");
                inputPengalaman = (int) Integer.parseInt(input.nextLine());
                this.gajiSebelumnya = inputPengalaman;
                return;
            } catch (NumberFormatException e){
                System.out.println("Inputan harus angka...");
            }
        }
    }
}}