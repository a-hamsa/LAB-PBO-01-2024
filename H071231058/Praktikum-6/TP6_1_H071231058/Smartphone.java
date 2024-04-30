package TP6_1_H071231058;

public class Smartphone implements IMove {
    public int price;
    public String brand;

    public Smartphone(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    public void move(int position){
        System.out.println("Smartphone berpindah");
    }
}
