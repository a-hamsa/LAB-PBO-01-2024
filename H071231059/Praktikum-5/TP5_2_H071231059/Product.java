package TP5_2_H071231059;

public class Product {
    String brand;
    int seriesNumber;
    double price;

    public void displayinfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Serier Number: " + getSeriesNumber());
        System.out.println("Price: $" + getPrice());
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }
    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
