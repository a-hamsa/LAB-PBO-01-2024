package TP5_1_H071231078;
import java.util.Scanner;

class persegi extends bangun {
    void LuasDanVolume(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Sisi : ");
        this.sisi = scan.nextDouble();
        System.out.println("Luas permukaan persegi adalah : " + (sisi*sisi));
        System.out.println("keliling persegi adalah : " + (4*sisi));
        scan.close();
    }
}

class persegiPanjang extends bangun{
    void LuasDanVolume(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        this.panjang = scan.nextDouble();
        System.out.print("Masukkan lebar : ");
        this.lebar = scan.nextDouble();
        System.out.println("Luas permukaan persegi panjang adalah : " + (panjang*lebar));
        System.out.println("keliling persegi panjang adalah : " + (2*(panjang+lebar)));
        scan.close();
    }
}

class lingkaran extends bangun{
    double r;
    double phi = Math.PI;

    void LuasDanVolume(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari : ");
        this.r = scan.nextDouble();
        System.out.println("Luas permukaan persegi panjang adalah : " + (phi*(r*r)));
        System.out.println("keliling persegi panjang adalah : " + (2*phi*r));
        scan.close();
    }
}

class trapesium extends bangun{
    double a,b,c,d,tinggi;

    void LuasDanVolume(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan sisi ke 1 trapesium : ");
        this.a = scan.nextDouble();
        System.out.print("Masukkan sisi ke 2 trapesium : ");
        this.b = scan.nextDouble();
        System.out.print("Masukkan sisi ke 3 trapesium : ");
        this.c = scan.nextDouble();
        System.out.print("Masukkan sisi ke 4 trapesium : ");
        this.d = scan.nextDouble();
        System.out.print("Masukkan Tinggi Trapesium : ");
        this.tinggi = scan.nextDouble();
        System.out.println("Luas permukaan trapesium adalah : " + (((1.0/2)*(a+b)*tinggi)));
        System.out.println("keliling trapesium adalah : " + (a+b+c+d));
        scan.close();
    }
}