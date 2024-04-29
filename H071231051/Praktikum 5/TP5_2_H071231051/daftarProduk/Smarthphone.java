package TP5_2_H071231051.daftarProduk;

public class Smarthphone extends Product{
    double screenSize;
    int strotageCapacity;

    public Smarthphone(double screenSize, int strotageCapacity, String brand, int seriesNumber, double price){
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.strotageCapacity = strotageCapacity;
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Screen size      : " + this.screenSize + " inches");
        System.out.println("Strotage Capacity: " + this.strotageCapacity + "GB");
    }
}