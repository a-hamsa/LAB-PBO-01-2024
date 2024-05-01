package TP6_1_H071231078;
public class SmartPhone implements Moving {

    //attribute
    int price;
    String brand;

    

    public SmartPhone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    //method
    @Override
    public void Move() {
        System.out.println("SmartPhone Sedang Berpindah...");
        
    }

    void Display(){
        System.out.println("==============================");
        System.out.println("Brand    : " + this.brand);
        System.out.println("Price    : " + this.price);
        System.out.println("==============================");
    }

    

}
