package TP6_H071231051;

import TP6_H071231051.induk.Move;

public class Car implements Move {
    int totalForwardGear;
    int maxSpeed;
    String color;

    public Car(int totalForwardGear, int maxSpeed, String color) {
        this.totalForwardGear = totalForwardGear;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}
