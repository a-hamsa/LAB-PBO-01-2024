import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul Film : ");
        String kalimat = input.nextLine();
        String Hasil = ubahJudul(kalimat);
        System.out.println(Hasil);
        input.close();
    }
    public static String ubahJudul(String awal){
        String[] kata = awal.split(" ");
        String akhir = "";
        for (String s : kata){
            String besar = s.substring(0, 1).toUpperCase();
            String kecil = s.substring(1).toLowerCase();
            akhir += besar + kecil +" ";
        }
        return akhir;
    }
}