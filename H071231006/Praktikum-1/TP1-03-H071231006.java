import java.util.HashMap;
import java.util.Scanner;

public class no3 {
    public static String konversi(String input) {
        HashMap<String, String> bulan = new HashMap<>();
        bulan.put("01","Januari");
        bulan.put("02","Februari");
        bulan.put("03","Maret");
        bulan.put("04","April");
        bulan.put("05","Mei");
        bulan.put("06","Juni");
        bulan.put("07","Juli");
        bulan.put("08","Agustus");
        bulan.put("09","September"); 
        bulan.put("10","Oktober"); 
        bulan.put("11","November");
        bulan.put("12","Desember");
        

        String[] splitInput = input.split("-");
        String Tanggal = splitInput[0];
        String Bulan = splitInput[1];
        String Tahun = splitInput[2];

        if (Tanggal.startsWith("0")) {
            Tanggal = Tanggal.substring(1);
        }

        if (Bulan.startsWith("0, 1")) {
            Bulan = Bulan.substring(1); 
        }

        int tanggalInt = Integer.parseInt(Tanggal);
        int bulanInt = Integer.parseInt(Bulan);
        if (tanggalInt > 31 || bulanInt > 12) {
            return "Invalid";
        }

        String namaBulan = bulan.get(Bulan);

        int Tahun1 = Integer.parseInt(Tahun);
        if(Tahun1 >= 0 && Tahun1 <= 30){
            Tahun = "20"+splitInput[2];
        } else {
            Tahun = "19"+splitInput[2];

        }

        return Tanggal + " " + namaBulan + " " + Tahun;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        String output = konversi(input);
        System.out.println(output);
    }
}