package TP6_2_H071231053;

public class Main {
    public static void main(String[] args) {
        Infinix GT10 = new Infinix(256, 108, 1200000, "Dim 1080", "Infinix");
        GT10.showInfo();
        GT10.move();

        System.out.println(" ");

        Dodge Hellcat = new Dodge(100000000, "Carbon", 326 , "Phantom Black");

        System.out.println(" ");
        Hellcat.move();
        Hellcat.showInfo();
    }
}
