import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Judul Film :");
        String film = input.nextLine();
        System.out.println(capitalizeWord(film));
    }

    static String capitalizeWord(String txt){
        String words[] = txt.split("\\s");
        String capitalizeWord = "";
        for (String w : words){
            String first = w.substring(0,1);
            String afterfirst = w.substring(1).toLowerCase();
            capitalizeWord += first.toUpperCase() + afterfirst + " ";
        }
        return capitalizeWord.trim();
    }
}
