package TP5_2_H071231051.daftarProduk;

public class Camera extends Product{
    int resolution;
    String lensType;

    public Camera(int resolution, String lensType, String brand, int seriesNumber, double price){
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Resolution       : "+ this.resolution + "MP");
        System.out.println("Lens Type        : "+ this.lensType);
    }
}