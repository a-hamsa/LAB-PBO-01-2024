package TP5_2_H071231006;

class Laptop extends Product {
  String processorType;
  int ramSize;

  public Laptop(String brand, int seriesNumber, double price, String processorType, int ramSize) {
    super(brand, seriesNumber, price);
    this.processorType = processorType;
    this.ramSize = ramSize;
  }

  void displayInfo() {
    super.displayInfo();
    System.out.println("Processor Type: " + processorType);
    System.out.println("RAM Size: " + ramSize + "GB");
  }
}
