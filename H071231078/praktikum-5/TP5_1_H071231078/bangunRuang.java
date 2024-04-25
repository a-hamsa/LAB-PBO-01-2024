package TP5_1_H071231078;
import java.util.Scanner;

public class bangunRuang extends bangun{
    double tinggi;
}

class kubus extends bangunRuang{
    void LuasDanVolume(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Sisi : ");
        this.sisi = scan.nextDouble();
        System.out.println("Luas permukaan Kubus adalah : " + (6*(sisi*sisi)));
        System.out.println("Volume Kubus adalah : " + (sisi*sisi*sisi));
        scan.close();
    }
}

class balok extends bangunRuang{
    void LuasDanVolume(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        this.panjang = scan.nextDouble();
        System.out.print("Masukkan lebar : ");
        this.lebar = scan.nextDouble();
        System.out.print("Masukkan tinggi : ");
        this.tinggi = scan.nextDouble();
        System.out.println("Luas permukaan balok adalah : " + (2*(panjang*lebar)+(panjang*tinggi)+(lebar*tinggi)));
        System.out.println("Volume balok adalah : " + panjang*lebar*tinggi);
        scan.close();
    }
}

class bola extends bangunRuang{
    double phi = Math.PI;
    double r;

    void LuasDanVolume(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari : ");
        this.r = scan.nextDouble();
        System.out.println("Luas permukaan bola adalah : " + (4*phi*(r*r)));
        System.out.println("Volume bola adalah : " + ((4/3)*phi*(r*r*r)));
        scan.close();
    }
}

class tabung extends bangunRuang{
    double phi = Math.PI;
    double r;

    void LuasDanVolume(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari : ");
        this.r = scan.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        this.tinggi = scan.nextDouble();
        System.out.println("Luas permukaan tabung adalah : " + (2*phi*r*(r*tinggi)));
        System.out.println("Volume tabung adalah : " + (phi*(r*r)*tinggi));
        scan.close();
    }
}