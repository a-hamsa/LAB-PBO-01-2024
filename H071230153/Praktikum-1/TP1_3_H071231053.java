package Praktikum_1;
import java.util.*;

public class TP1_3_H071231053 {
   
    public static String konversiTanggal(String tgl) {
        String[] bagian = tgl.split("-");
        String tanggal = bagian[0];
        String bulan = bagian[1];
        String tahun = bagian[2];
    
        // Konversi kode bulan menjadi nama bulan
        String namaBulan;
        switch (bulan) {
            case "01":
                namaBulan = "Januari";
                break;
            case "02":
                namaBulan = "Februari";
                break;
            case "03":
                namaBulan = "Maret";
                break;
            case "04":
                namaBulan = "April";
                break;
            case "05":
                namaBulan = "Mei";
                break;
            case "06":
                namaBulan = "Juni";
                break;
            case "07":
                namaBulan = "Juli";
                break;
            case "08":
                namaBulan = "Agustus";
                break;
            case "09":
                namaBulan = "September";
                break;
            case "10":
                namaBulan = "Oktober";
                break;
            case "11":
                namaBulan = "November";
                break;
            case "12":
                namaBulan = "Desember";
                break;
            default:
                namaBulan = "Bulan tidak valid";
        }    

        int digTahun = Integer.parseInt(tahun);
        if (digTahun >= 0 && digTahun <= 25) {
            tahun = "20" + tahun;
        } else if (digTahun >= 26 && digTahun <= 99) {
            tahun = "19" + tahun;
        }
        
        int tanggal_int = Integer.parseInt(tanggal);
        if (tanggal_int > 31) {
            String output = "error";
            return output;
            
        }else {
            String output = tanggal_int + " " + namaBulan + " " + tahun;
            return output;
        }
        
    }
    
    public static void main(String[] args) {

        Scanner inputan = new Scanner(System.in);
        System.out.print("Input Tanggal-Bulan-Tahun : ");
        String tanggal = inputan.nextLine();

        
        String outan = konversiTanggal(tanggal);
        
        System.out.println("Output : " + outan);
        inputan.close();
    }
}

