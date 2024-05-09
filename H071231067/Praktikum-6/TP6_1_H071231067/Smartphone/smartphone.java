package TP6_1_H071231067.Smartphone;

import TP6_1_H071231067.Imove;

public class smartphone implements Imove{
    int price;
    String brand;

    public smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public void move(){
       System.out.println("Smartphone Berpindah"); 
    }
}
