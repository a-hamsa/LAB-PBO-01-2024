import java.util.Scanner;

public class Projek {
    int jumlahProjek;
    private static Scanner input = new Scanner(System.in);

    public void tampilkanProjek(){
        System.out.println("Projek IT: ");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Lebih dari 15");
        System.out.print("Input: ");
        int inputanProjek = input.nextInt();
        input.nextLine();
        if (inputanProjek >= 1 && inputanProjek <=4){
            switch(inputanProjek){
                case 1 :
                    jumlahProjek = 4;
                    break;
                case 2:
                    jumlahProjek = 8;
                    break;
                case 3:
                    jumlahProjek = 12;
                    break;
                case 4:
                    jumlahProjek = 15;
                    break;  
            }
        } else {
            System.out.println("Inputan diluar opsi!");
        }
    }

    //getter
    public int getJumlahProjek() {
        return jumlahProjek;
    }
}
