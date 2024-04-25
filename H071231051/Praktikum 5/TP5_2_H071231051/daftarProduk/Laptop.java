package TP5_2_H071231051.daftarProduk;

public class Laptop extends Product{
    int ramSize;
    String processorType;

    public Laptop(int ramSize, String processorType, String brand, int seriesNumber, double price){
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Processor Type   : " + this.processorType);
        System.out.println("RAM Size         : " + this.ramSize + "GB");
    }
}
