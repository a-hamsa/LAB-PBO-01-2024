package TP6_2_H071231053;

public interface Car{
    int totalForwardGear = 0;
    String color = " ";
    int maxSpeed = 0;

    void move();
    void showInfo();
}


class Dodge implements Car{
    int price;
    String buildMaterial;
    int maxSpeed;
    String color;

Dodge(int price, String buildMaterial,int maxSpeed,String color){
        this.price = price;
        this.buildMaterial = buildMaterial;
        this.maxSpeed = maxSpeed;
        this.color = color;

    }
    @Override
    public void move() {
        System.out.println("==================================");
        System.out.println("Mobil sedang berakselerasi!");
    }

    public void showInfo(){
        System.out.println("==================================");
        System.out.println("Price : " + price);
        System.out.println("Build Material : " + buildMaterial);
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Color : " + color);
        System.out.println("==================================");
    
    }

    
}