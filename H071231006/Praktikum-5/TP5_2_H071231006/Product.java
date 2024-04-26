package TP5_2_H071231006;

class Product {
  String brand;
  int seriesNumber;
  double price;

  public Product(String brand, int seriesNumber, double price) {
    this.brand = brand;
    this.seriesNumber = seriesNumber;
    this.price = price;
  }

  void displayInfo() {
    System.out.println("Brand: " + brand);
    System.out.println("Series Number: " + seriesNumber);
    System.out.println("Harga: " + price);
  }
}
