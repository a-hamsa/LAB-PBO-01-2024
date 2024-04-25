package TP5_2_H071231051.daftarProduk;

public class Product{
    String brand;
    int seriesNumber;
    double price;
    
    public Product(String brand, int seriesNumber, double price){
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }
    public void displayInfo(){
        System.out.println("Brand            : " + brand);
        System.out.println("Serial Number    : " + seriesNumber);
        System.out.println("Price            : $" + price);
    }
    public int getSeriesNumber() {
        return seriesNumber;
    }
}
