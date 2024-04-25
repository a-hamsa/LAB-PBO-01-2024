package TP5_2_H071231059;

public class Camera extends Product{
    int resolution;
    String lensType;

    public void displayinfo() {
        super.displayinfo();
        System.out.println("Resolution: " + getResolution() + "MP");
        System.out.println("Lens Type: " + getLensType());
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
