package TP6_1_H071231078;

public class Main {
    public static void main(String[] args) {
        Pitbull dog_1 = new Pitbull();
        SmartPhone samsung = new SmartPhone(7000000,"samsung");
        Car ford = new Car();

        //dog
        dog_1.Describe();
        dog_1.Move();
        dog_1.Move();
        dog_1.Describe();

        //smartphone
        samsung.Display();
        samsung.Move();

        //car
        ford.Display();
        ford.Move();
    }
}
