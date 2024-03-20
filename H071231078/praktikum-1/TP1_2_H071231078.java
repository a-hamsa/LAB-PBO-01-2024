import java.util.Scanner;

public class TP1_2_H071231078 {

    public static String capitalize(String movie_name){
        String[] separated_movie_name = movie_name.split("\\s+");

        String List_character = "";

        for (int i = 0; i < separated_movie_name.length; i++) {
            String name = separated_movie_name[i];
            String names = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
            List_character += names + " ";
        }

        return List_character;
    }

    public static void main(String[] args) {
        System.out.println("Masukkan judul movie : ");
        System.out.print(">");
        Scanner Scan = new Scanner(System.in);
        String movie_name = Scan.nextLine();

        

        System.out.println(capitalize(movie_name));
        Scan.close();
    }
}
