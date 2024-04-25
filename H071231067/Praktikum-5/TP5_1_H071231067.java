import java.util.Scanner;

class bangun{
    double luas;
    double volume;
    double keliling;

    double sisi;
    double panjang;
    double lebar;
    double tinggi;
    double jari2;

    void garis(){
        System.out.println("--------------------------------");
    }
}

class kubus extends bangun{
    public void hitungLuasDanVolume(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Sisi Kubus : ");
        sisi = input.nextDouble();
        garis();

        luas = 6 * (sisi * sisi);
        volume = sisi * sisi * sisi;
        System.out.println("Luas Kubus    : " + luas);
        System.out.println("Volume Kubus  : " + volume);
        input.close();
    }
}
class balok extends bangun{
    public void hitungLuasDanVolume(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang Balok : ");
        panjang = input.nextDouble();
        System.out.print("Masukkan Lebar Balok   : ");
        lebar = input.nextDouble();
        System.out.print("Masukkan Tinggi Balok  : ");
        tinggi = input.nextDouble();
        garis();

        luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        volume = panjang * lebar * tinggi;
        System.out.println("Luas Balok     : " + luas);
        System.out.println("Volume Balok   : " + volume);
        input.close();
    }
}
class bola extends bangun{
    public void hitungLuasDanVolume(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jari - Jari Bola : ");
        jari2 = input.nextDouble();
        garis();

        luas = 4 * Math.PI * (jari2 * jari2);
        volume = 1.333 * Math.PI * (jari2 * jari2 * jari2);
        System.out.printf("Luas Bola    : %.3f%n" , luas);
        System.out.printf("Volume Bola  : %.3f%n" , volume);
        input.close();
    }
}
class tabung extends bangun{

    public void hitungLuasDanVolume(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jari - Jari Tabung : ");
        jari2 = input.nextDouble();
        System.out.print("Masukkan Tinggi Tabung      : ");
        tinggi = input.nextDouble();
        garis();

        luas = 2 * Math.PI * jari2 * (jari2 + tinggi);
        volume = Math.PI * (jari2 * jari2) * tinggi;
        System.out.printf("Luas Tabung     : %.3f%n" , luas);
        System.out.printf("Volume Tabung   : %.3f%n" , volume);
        input.close();
    }
}

class persegi extends bangun{

    public void hitungLuasDanKeliling(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi Persegi : ");
        sisi = input.nextDouble();
        garis();

        luas = sisi * sisi;
        keliling = 4 * sisi;
        System.out.println("Luas Persegi      : " + luas);
        System.out.println("Keliling Persegi  : " + keliling);
        input.close();
    }
}
class persegiPanjang extends bangun{

    public void hitungLuasDanKeliling(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang Persegi Panjang : ");
        panjang = input.nextDouble();
        System.out.print("Masukkan Lebar Persegi Panjang   : ");
        lebar = input.nextDouble();
        garis();

        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);
        System.out.println("Luas Persegi Panjang     : " + luas);
        System.out.println("Keliling Persegi Panjang : " + keliling);
        input.close();
    }
}
class lingkaran extends bangun{

    public void hitungLuasDanKeliling(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jari - Jari Lingkaran : ");
        jari2 = input.nextDouble();
        garis();

        luas = Math.PI * (jari2 * jari2);
        keliling = 2 * Math.PI * jari2;
        System.out.printf("Luas Lingkaran      : %.3f%n" , luas);
        System.out.printf("Keliling Lingkaran  : %.3f%n" , keliling);
        input.close();
    }
}
class trapesium extends bangun{
    double sisiA;
    double sisiB;
    double sisiC;
    double sisiD;

    public void hitungLuasDanKeliling(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Sisi 1 Trapesium : ");
        sisiA = input.nextDouble();
        System.out.print("Masukkan Sisi 2 Trapesium : ");
        sisiB = input.nextDouble();
        System.out.print("Masukkan Sisi 3 Trapesium : ");
        sisiC = input.nextDouble();
        System.out.print("Masukkan Sisi 4 Trapesium : ");
        sisiD = input.nextDouble();
        System.out.print("Masukkan tinggi Trapesium : ");
        tinggi = input.nextDouble();
        garis();

        luas = 0.5 * tinggi * (sisiA + sisiB);
        keliling = sisiA + sisiB + sisiC + sisiD;
        System.out.println("Luas Trapesium     : " + luas);
        System.out.println("Keliling Trapesium : " + keliling);
        input.close();
    }
}

public class TP5_1_H071231067{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        garis();
        System.out.println("   ==== BANGUN RUANG ====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println();
        System.out.println("   ==== BANGUN DATAR ====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");
        garis();

        boolean loop = true;
        while (loop) {
            try {
                System.out.print("Pilihan : ");
                int pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        garis();
                        kubus kubus = new kubus();
                        kubus.hitungLuasDanVolume();
                        loop = false;
                        break;
                    case 2:
                        garis();
                        balok balok = new balok();
                        balok.hitungLuasDanVolume();
                        loop = false;
                        break;
                    case 3:
                        garis();
                        bola bola = new bola();
                        bola.hitungLuasDanVolume();
                        loop = false;
                        break;
                    case 4:
                        garis();
                        tabung tabung = new tabung();
                        tabung.hitungLuasDanVolume();
                        loop = false;
                        break;
                    case 5:
                        garis();
                        persegi persegi = new persegi();
                        persegi.hitungLuasDanKeliling();
                        loop = false;
                        break;
                    case 6:
                        garis();
                        persegiPanjang persegiPanjang = new persegiPanjang();
                        persegiPanjang.hitungLuasDanKeliling();
                        loop = false;
                        break;
                    case 7:
                        garis();
                        lingkaran lingkaran = new lingkaran();
                        lingkaran.hitungLuasDanKeliling();
                        loop = false;
                        break;
                    case 8:
                        garis();
                        trapesium trapesium = new trapesium();
                        trapesium.hitungLuasDanKeliling();
                        loop = false;
                        break;

                    default:
                        garis();
                        System.out.println("Tolong pilih 1-8");
                        break;
                }
            } catch (Exception e) {
                garis();
                System.out.println("Tolong pilih 1-8");
                input.nextLine();
            } 
        }
        input.close();
    }

    public static void garis(){
        System.out.println("--------------------------------");    
    }
}