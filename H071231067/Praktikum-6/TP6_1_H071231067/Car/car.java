package TP6_1_H071231067.Car;

import TP6_1_H071231067.Imove;

public class car implements Imove {
    int totalFowardGear;
    String color;
    int maxSpeed;

    public car(int totalFowardGear, String color, int maxSpeed) {
        this.totalFowardGear = totalFowardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void move(){
        System.out.println("Mobil sedang berakselerasi");
    }
}
