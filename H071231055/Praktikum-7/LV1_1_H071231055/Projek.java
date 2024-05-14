package LV1_1_H071231055;

import java.util.Scanner;

public class Projek extends Kehidupan{
    int inputProjek;
    int jumlahProjek;

    public int getInputProjek() {
        return inputProjek;
    }

    void jumlahProjek(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Projek IT:");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Minimal 15");
        boolean validInput = false;
        while (!validInput){
            try{
                System.out.println("Input: ");
                inputProjek = Integer.parseInt(scanner.nextLine());
                if (inputProjek >= 1 && inputProjek <= 4){
                    validInput = true;
                    prosesKehidupan();
                } else {
                    System.out.println("Pilihan tidak valid...");
                }
            } catch (NumberFormatException e){
                System.out.println("Inputan harus angka...");
            }
        }
    }

    @Override
    void prosesKehidupan() {
        switch (inputProjek) {
            case 1:
            this.jumlahProjek = 4;
            
            break;
            case 2:
            this.jumlahProjek = 8;
           
            break;
            case 3:
            this.jumlahProjek = 12;
          
            break;
            case 4:
            this.jumlahProjek = 15;

            break;
            default:
                break;
        }
    }
    
}
