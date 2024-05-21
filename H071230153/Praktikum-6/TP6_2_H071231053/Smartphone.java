package TP6_2_H071231053;

interface Smartphone {
    int price = 0 ;
    String brand = " ";

    void move();
    void showInfo();
}

class Infinix implements Smartphone {
    int storageSize;
    int cameraMp;
    String processor;
    int price; 
    String brand; 

    Infinix(int storageSize, int cameraMp, int price, String processor, String brand) {
        this.storageSize = storageSize;
        this.cameraMp = cameraMp;
        this.price = price; 
        this.processor = processor;
        this.brand = brand;  
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah!");
        System.out.println("==================================");
    }

    public void showInfo(){
        System.out.println("==================================");
        System.out.println("Storage = " + storageSize);
        System.out.println("MP Camera = " + cameraMp);
        System.out.println("Price : " + price);
        System.out.println("Processor : " + processor);
        System.out.println("Brand : " + brand  );
        System.out.println("==================================");
    }
}
