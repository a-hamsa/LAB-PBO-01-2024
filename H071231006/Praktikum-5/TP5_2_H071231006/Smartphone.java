package TP5_2_H071231006;

class Smartphone extends Product {
  double screenSize;
  int storageCapacity;

  public Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
    super(brand, seriesNumber, price);
    this.screenSize = screenSize;
    this.storageCapacity = storageCapacity;
  }

  void displayInfo() {
    super.displayInfo();
    System.out.println("Screen Size: " + screenSize + " inch");
    System.out.println("Storage Capacity: " + storageCapacity + "GB");
  }
}
