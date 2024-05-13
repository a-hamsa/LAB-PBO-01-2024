package LiveCoding;

import java.util.Scanner;

public class Projekk {
    int jumlahProjekk;

    public void jenisProjekk(Scanner scan){
        System.out.println("Projek IT: ");
        System.out.print("1. Minimal 4 \n2. Minimal 8 \n3. Minimal 12 \n4. lebih dari 15 \ninput:  ");
        try {
            jumlahProjekk = Integer.parseInt(scan.nextLine());
            switch (jumlahProjekk) {
                case 1:
                    jumlahProjekk = 3;
                    break;
                case 2:
                    jumlahProjekk = 8;
                    break;
                case 3:
                    jumlahProjekk = 12;
                    break;
                case 4:
                    jumlahProjekk = 15;
                    break;
                default:
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("inputan harus angka");
        }

    }
    
    public int getJumlahProjekk() {
        return jumlahProjekk;
    }

}
