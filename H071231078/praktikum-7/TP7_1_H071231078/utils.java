package TP7_1_H071231078;
import java.util.Scanner;


public class utils {
    private static Scanner sc = new Scanner(System.in);

    public static void inputTestString(String input){
        while (input.isEmpty() || !input.matches("[a-zA-Z]+")) {
            System.out.println("Error: Field tidak boleh kosong dan harus berupa string.");
            System.out.print("Masukkan Data : ");
            input = sc.nextLine();
        }
    }

    public static void inputTestString_2(String input){
        while (input.isEmpty()) {
            System.out.println("Error: Field tidak boleh kosong dan harus berupa string.");
            System.out.print("Masukkan Data : ");
            input = sc.nextLine();
        }
    }





}
