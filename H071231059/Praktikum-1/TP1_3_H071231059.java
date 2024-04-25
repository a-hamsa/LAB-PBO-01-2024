import java.util.Scanner;

public class TP1_3_H071231059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Tanggal: ");
        String input = scanner.nextLine();
        String[] pisah = input.split("-"); 

        String bulan = "";
        String awaltahun = "";
        int[] angka = new int[pisah.length];

        for (int i = 0; i < pisah.length; i++) {
            angka[i] = Integer.parseInt(pisah[i]);
        }



        if (angka[2] >= 0 && angka[2] <= 9) {
            awaltahun = "200";
        }else if (angka[2] >= 10 && angka[2] <= 24) {
            awaltahun = "20";
        }else if (angka[2] >= 25 && angka[2] <= 99) {
            awaltahun = "19";
        }else {
            System.out.println("Invalid Input");
        }


        if (angka[1] == 1 && angka[0] >= 1 && angka[0] <= 31 ) {
            bulan = " Januari ";
        } else if (angka[1] == 2 && angka[0] >= 1 && angka[0] <= 28) {
            bulan = " Februari ";
        } else if (angka[1] == 3 && angka[0] >= 1 && angka[0] <= 31) {
            bulan = " Maret ";
        } else if (angka[1] == 4 && angka[0] >= 1 && angka[0] <= 30) {
            bulan = " April ";
        } else if (angka[1] == 5 && angka[0] >= 1 && angka[0] <= 31) {
            bulan = " Mei ";
        } else if (angka[1] == 6 && angka[0] >= 1 && angka[0] <= 30) {
            bulan = " Juni ";
        } else if (angka[1] == 7 && angka[0] >= 1 && angka[0] <= 31) {
            bulan = " Juli ";
        } else if (angka[1] == 8 && angka[0] >= 1 && angka[0] <= 31) {
            bulan = " Agustus ";
        } else if (angka[1] == 9 && angka[0] >= 1 && angka[0] <= 30) {
            bulan = " September ";
        } else if (angka[1] == 10 && angka[0] >= 1 && angka[0] <= 31) {
            bulan = " Oktober ";
        } else if (angka[1] == 11 && angka[0] >= 1 && angka[0] <= 30) {
            bulan = " November ";
        } else if (angka[1] == 12 && angka[0] >= 1 && angka[0] <= 31) {
            bulan = " Desember ";
        } else {
            System.out.println("Invalid Input");
        }

        if (bulan != "" && awaltahun != "") {
            System.out.println(angka[0] + bulan + awaltahun + angka[2]);
        }
        scanner.close();
    }
}