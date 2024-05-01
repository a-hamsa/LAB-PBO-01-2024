package TP6_1_H071231058;

public class Car implements IMove{
    public int totalForwardGear, maxSpeed;
    public String color;

    public Car(int totalForwardGear, String color, int maxSpeed){
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void move(int position){
        System.out.println("Mobil sedang berakselerasi");
    }
}
