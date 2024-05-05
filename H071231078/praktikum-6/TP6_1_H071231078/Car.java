package TP6_1_H071231078;

public class Car implements Moving{
    int totalForwardGear,maxSpeed;
    String color;


    @Override
    public void Move() {
        System.out.println("Mobil sedang berakselerasi...");
        
    }

    void Display(){
        System.out.println("==============================");
        System.out.println("totalForwardGear : " + this.totalForwardGear);
        System.out.println("maxSpeed         : " + this.maxSpeed);
        System.out.println("color            : " + this.color);
        System.out.println("==============================");
    }

    

}
