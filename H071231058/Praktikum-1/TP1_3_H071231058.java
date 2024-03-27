import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        String tanggal = input.nextLine();

        String[] date = tanggal.split("-");
        int tgl = Integer.parseInt(date[0]);
        int bulan = Integer.parseInt(date[1]);
        int tahun = Integer.parseInt(date[2]);

        String namaBulan = Bulan(bulan);
        String thn = Tahun(tahun);

        if (tgl <= 31 && bulan <= 12) {
            boolean kabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
            if ((bulan == 2 && kabisat && tgl <= 29) || (bulan == 2 && !kabisat && tgl <= 28) || (tgl <= 31 && bulan != 2)) {
                String result = tgl + " " + namaBulan + " " + thn;
                System.out.println(result);
            } else {
                System.out.println("Tanggal tidak valid untuk bulan dan tahun tertentu.");
            }
        } else {
            System.out.println("Tanggal atau bulan tidak valid.");
        }
        
            
        input.close();
    }

    static String Bulan(int bulan){
        switch (bulan) {
            case 1: return "Januari";
            case 2: return "Februari";
            case 3: return "Maret";
            case 4: return "April";
            case 5: return "Mei";
            case 6: return "Juni";
            case 7: return "Juli";
            case 8: return "Agustus";
            case 9: return "September";
            case 10: return "Oktober";
            case 11: return "November";
            case 12: return "Desember";
            default: return "Bulan tidak valid";
        }
    }

    static String Tahun(int tahun){
        if (tahun >= 0 && tahun <= 99){
            if (tahun >=0 && tahun <= 24){
                return "20" + String.format("%02d", tahun);
            } else {
                return "19" +String.format("%02d", tahun);
            }
        }else{
            return String.valueOf(tahun);
        }
        
    }
}
