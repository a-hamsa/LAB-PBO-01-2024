package TP5_2_H071231053.Product;

public class Laptop extends Product{
    int ramSize;
    String processorType;

    public Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Processor Type \t: " + this.getProcessorType());
        System.out.println("RAM Size \t: " + this.getRamSize() + "GB");
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

