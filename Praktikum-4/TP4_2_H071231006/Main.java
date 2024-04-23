package TP4_2_H071231006;
import TP4_2_H071231006.Laptop;
import TP4_2_H071231006.SelfUtils;

public class Main {
    public static void main(String[] args) {
    Laptop laptop = new Laptop("Asus", 20, 500000, 2015, "Ini adalah laptop Asus");
    laptop.displayInfo(); 
    System.out.println("=========================");
    Laptop laptop1 = new Laptop();
    laptop1.displayInfo();
    System.out.println("=========================");
    SelfUtils.displaySelfData();
    }

}