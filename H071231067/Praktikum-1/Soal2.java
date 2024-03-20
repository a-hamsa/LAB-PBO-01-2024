import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String hasil = "";

        System.out.println("Masukkan Judul Film : ");
        System.out.print("> ");
        String judul = scan.nextLine();
        String judulKecil = judul.toLowerCase();
        String[] list_kata = judulKecil.split(" ");

        for (String kata:list_kata){
            char hurufPertama = Character.toUpperCase(kata.charAt(0));
            String kataBesar = hurufPertama + kata.substring(1);
            hasil = hasil + kataBesar + " ";
        }

        System.out.println(hasil);
        scan.close();

    }
}
