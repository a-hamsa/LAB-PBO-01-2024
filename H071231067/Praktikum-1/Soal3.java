import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try {
            String tanggal = scan.nextLine();
            int panjangTanggal= tanggal.length();
            int x = 8;
            int cekFormat = panjangTanggal - x;
            switch (cekFormat){
                case 0:
                    break;
                default:
                    System.out.println("Format input salah,tolong masukkan sesuai format(00-00-00)");
                    scan.close();
                    return;
            }

            String[] tanggalTanpaGaris = tanggal.split("-");

            String hari = tanggalTanpaGaris[0];
            int hariInt  = Integer.parseInt(tanggalTanpaGaris[0]);

            String bulan;
            int bulanInt = Integer.parseInt(tanggalTanpaGaris[1]);
            
            String tahun = tanggalTanpaGaris[2];
            int tahunInt = Integer.parseInt(tanggalTanpaGaris[2]);
            String abad;

            // bulan
            switch (bulanInt) {
                case 1:
                    bulan = "Januari";
                    break;
                case 2:
                    bulan = "Februari";
                    break;
                case 3:
                    bulan = "Maret";
                    break;
                case 4:
                    bulan = "April";
                    break;
                case 5:
                    bulan = "Mei";
                    break;
                case 6:
                    bulan = "Juni";
                    break;
                case 7:
                    bulan = "Juli";
                    break;
                case 8:
                    bulan = "Agustus";
                    break;
                case 9:
                    bulan = "September";
                    break;
                case 10:
                    bulan = "Oktober";
                    break;
                case 11:
                    bulan = "November";
                    break;
                case 12:
                    bulan = "Desember";
                    break;
                default:
                    System.out.println("Tanggal tidak valid");
                    scan.close();
                    return;
            }   

            //hari
            if (hari.startsWith("0")){
                hari = hari.substring(1);
            }
            switch (hari){
                case "0":
                    System.out.println("Tanggal tidak valid");
                    scan.close();
                    return;
                default:
                break;
            }
            if (hariInt < 1 || hariInt > 31){
                System.out.println("Tanggal tidak valid");
                scan.close();
                return;
            }else if (bulan.equals("Februari") && hariInt > 29){
                System.out.println("Tanggal tidak valid");
                scan.close();
                return;
            }else if ((bulan.equals("April") || bulan.equals("Juni") || bulan.equals("September") || bulan.equals("November")) && hariInt > 30) {
                System.out.println("Tanggal tidak valid");
                scan.close();
                return;
            }

            //tahunInt
            if (tahunInt >= 0 && tahunInt <= 24){
                abad = "20";
            }else{
                abad = "19";
            }

            System.out.println(hari +" "+ bulan +" "+ abad + tahun);
        } catch (Exception e) {
            System.out.println("Format input salah,tolong masukkan sesuai format(00-00-00)");
        }finally{
            scan.close();
        }
        scan.close();
    }
}