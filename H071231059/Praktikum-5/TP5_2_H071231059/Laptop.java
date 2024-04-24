package TP5_2_H071231059;

public class Laptop extends Product{
    int ramSize;
    String processorType;

    public void displayinfo() {
        super.displayinfo();
        System.out.println("Processor Type: " + getProcessorType());
        System.out.println("Ram Size: " + getRamSize() + "GB");
    }

    public int getRamSize() {
        return ramSize;
    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
    public String getProcessorType() {
        return processorType;
    }
    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }
}
