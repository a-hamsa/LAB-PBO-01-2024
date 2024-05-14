import java.util.Scanner;

public class Keluarga {
    int status;
    private static Scanner input = new Scanner(System.in);
        
    
    public void cekStatus(){
        System.out.println("Status: ");
        System.out.println("1. Menikah");
        System.out.println("2. Bertunangan");
        System.out.println("3. Berpacaran");
        System.out.println("4. Single");
        System.out.print("Input: ");
        status = input.nextInt();
        if (status<1 || status>4){
            System.out.println("Diluar opsi");
            cekStatus();
        }
    }
}
