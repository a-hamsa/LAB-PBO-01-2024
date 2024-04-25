import java.util.Scanner;

public class no2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Masukkan Sebuah Kalimat :");
        String input = scanner.nextLine();

        String result = hurufkapital(input);
        System.out.println("Kalimat Setelah Dirubah : " + result);

        scanner.close();
    
    }
    
    public static String hurufkapital(String input) {
        StringBuilder result = new StringBuilder();
        boolean kapitalselanjutnya = true;

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                kapitalselanjutnya = true;
                result.append(c);
            } else if (kapitalselanjutnya) {
                result.append(Character.toUpperCase(c));
                kapitalselanjutnya = false;
            } else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
