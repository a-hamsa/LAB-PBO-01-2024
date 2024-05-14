package LV1_1_H071231055;

import java.util.Scanner;

public class Pendidikan extends Kehidupan {
    String[] jenjang = {"SD", "SMP", "SMA", "SMK", "S1", "S2", "S3"};
    int inputPendidikan;
    
    public String getJenjang() {
        return jenjang [inputPendidikan];
    }

    public int getInputPendidikan() {
        return inputPendidikan;
    }

    @Override
    void prosesKehidupan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");

        boolean validInput = false;
        while (!validInput) {
            String input = scanner.nextLine().toUpperCase();
            for (int i = 0; i < jenjang.length; ++i){
                if (input.equals(jenjang[i])){
                    inputPendidikan = i;
                    validInput = true;
                    break;
                }
            }
            if (!validInput){
                System.out.println("Tidak ada pilihan. Masukkan kembali: ");
            }
        }
    }

    
}
