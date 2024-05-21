package TP5_2_H071231053.Product;

public class Camera extends Product{
    int resolution;
    String lensType;

    public Camera(String brand, int seriesNumber, double price, int resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution \t: " + this.getResolution() + "MP");
        System.out.println("Lens Type  \t: " + this.getLensType());
    }

    public int getResolution() {
        return resolution;
    }
    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public String getLensType() {
        return lensType;
    }
    public void setLensType(String lensType) {
        this.lensType = lensType;
    }
}
