import TP6_1_H071231067.Dog.pitbull;
import TP6_1_H071231067.Smartphone.smartphone;
import TP6_1_H071231067.Car.car;

public class TP6_2_H071231067 {
    public static void main(String[] args) {
        pitbull dog1 = new pitbull(10, 1);
        smartphone hp1 = new smartphone(80000, "Samsung");
        car mobil1 = new car(9, "Red", 99);

        dog1.move();
        dog1.describe();
        System.out.println();
        hp1.move();
        System.out.println();
        mobil1.move();
    }
}
