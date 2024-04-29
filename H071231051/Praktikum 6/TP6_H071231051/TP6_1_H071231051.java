package TP6_H071231051;
public class TP6_1_H071231051 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(1000000, "nokia");
        Car car = new Car(10, 100, "black");
        SiberianHusky siberianHusky = new SiberianHusky(2, 70);

        smartphone.move();
        car.move();
        siberianHusky.move();
        siberianHusky.describe();
    }
}
