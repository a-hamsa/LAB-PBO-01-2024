package TP_2;
// import java.util.Scanner;

public class TP2_3_H071231078 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        // Scanner scan = new Scanner(System.in);

        // System.out.print("Height  : ");
        // int tinggi = scan.nextInt();
        // System.out.print("Widht   : ");
        // int lebar = scan.nextInt();
        // System.out.print("Length  : ");
        // int panjang = scan.nextInt();

        // cuboid.height = tinggi;
        // cuboid.widht = lebar;
        // cuboid.length = panjang;
        // scan.close();

        cuboid.height = 2.0;
        cuboid.widht = 2.0;
        cuboid.length = 2.0;

        System.out.printf("Volume = %.2f", cuboid.getVolume());

    }
}

class Cuboid{
    double height;
    double widht;
    double length;

    double getVolume(){
        return height * widht * length;
    }
}
