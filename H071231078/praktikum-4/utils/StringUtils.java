package utils;
import java.util.Scanner;

public class StringUtils {
    private static Scanner sc = new Scanner(System.in);
    public static String namaPanggilan(String namaLengkap) {
        if (namaLengkap == null || namaLengkap.isBlank()) {
            return null; // atau kembalikan nilai default sesuai kebutuhan
        }

        String[] jumKata = namaLengkap.split(" ");
        if (jumKata.length == 1) {
            return namaLengkap;
        } else if (jumKata.length > 1) {
            return jumKata[1];
        }

        return null; // tambahkan kembalikan nilai default sesuai kebutuhan
    }

    public static void usernameTest(String username){
        while (username.isEmpty() || !username.matches("[a-zA-Z]+")) {
            System.out.println("Error: Username tidak boleh kosong dan harus berupa string.");
            System.out.println("Masukkan username");
            System.out.print("> ");
            username = sc.nextLine();
        }
    }

    public static void passwordTest(String password) {
        while (password.isEmpty() || password.length() < 8) {
            if (password.isEmpty()) {
                System.out.println("Error: password tidak boleh kosong");
            } else {
               System.out.println("Error: password harus memiliki minimal 8 karakter");
            }
            System.out.println("Masukkan password");
            System.out.print("> ");
            password = sc.nextLine();
        }
    }
    

    public static void notEmpty(String text){
        while (text.isEmpty()) {
            System.out.println("Error: input tidak boleh kosong");
            System.out.print("> ");
            text = sc.nextLine();
        }
    }

    public static void notEmpty(int text) {
        String stringValue = Integer.toString(text);
        while (stringValue.isEmpty()) {
            System.out.println("Error: input tidak boleh kosong");
            System.out.print("> ");
            text = sc.nextInt();
        }
    }


}
