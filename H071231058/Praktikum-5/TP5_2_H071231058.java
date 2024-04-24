import java.util.Scanner;
import java.util.ArrayList;

class Product{
    String brand;
    int seriesNumber;
    double price;

    Product(){}
    Product(String brand, int seriesNumber, double price){
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    void displayInfo(){}

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setSeriesNumber(int seriesNumber){
        this.seriesNumber = seriesNumber;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getBrand(){
        return brand;
    }
    public int getSeriesNumber(){
        return seriesNumber;
    }
    public double getPrice(){
        return price;
    }
}

class Smartphone extends Product{
    double screenSize;
    int storageCapacity;

    Smartphone(){}
    Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity){
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    public void setScreenSize(double screenSize){
        this.screenSize = screenSize;
    }
    public void setStorageCapacity(int storageCapacity){
        this.storageCapacity = storageCapacity;
    }
    public double getScreenSize(){
        return screenSize;
    }
    public int getStorageCapacity(){
        return storageCapacity;
    }

    void displayInfo(){
        System.out.println("Brand           : " + this.brand);
        System.out.println("Serial Number   : " + this.seriesNumber);
        System.out.println("Price           : " + this.price);
        System.out.println("Screen Size     : " + this.screenSize + " inches");
        System.out.println("Storage Capacity: " + this.storageCapacity + " GB");
    }
}

class Camera extends Product{
    int resolution;
    String lensType;

    Camera(){}
    Camera(String brand, int seriesNumber, double price, int resolution, String lensType){
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    public void setResolution(int resolution){
        this.resolution = resolution;
    }
    public void setLensType(String lensType){
        this.lensType = lensType;
    }
    public int getResolution(){
        return resolution;
    }
    public String getLensType(){
        return lensType;
    }

    void displayInfo(){
        System.out.println("Brand        : " + this.brand);
        System.out.println("Serial Number: " + this.seriesNumber);
        System.out.println("Price        : " + this.price);
        System.out.println("Resolution   : " + this.resolution + " MP");
        System.out.println("Lens Type    : " + this.lensType);
    }
}

class Laptop extends Product{
    int ramSize;
    String processorType;

    Laptop(){}
    Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType){
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public void setRamSize(int ramSize){
        this.ramSize = ramSize;
    }
    public void setProcessorType(String processorType){
        this.processorType = processorType;
    }
    public int getRamSize(){
        return ramSize;
    }
    public String getProcessorType(){
        return processorType;
    }

    void displayInfo(){
        System.out.println("Brand         : " + this.brand);
        System.out.println("Serial Number : " + this.seriesNumber);
        System.out.println("Price         : " + this.price);
        System.out.println("Processor Type: " + this.processorType);
        System.out.println("RAM Size      : " + this.ramSize + " GB");
    }
}

public class TP5_2_H071231058{
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Product> arr = new ArrayList<>();
    public static void main(String[] args) {
        showMenu();
    }
    
    static void showMenu(){
        System.out.println("Menu:\n1. Tambah Produk\n2. Tampilkan Semua Produk\n3. Beli Produk\n4. Keluar");
        System.out.println();
        System.out.print(">>> Pilih menu (1-4): ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                System.out.print("Masukkan nama produk: ");
                String brand = input.next();
                input.nextLine();
                System.out.print("Masukkan nomor seri: ");
                int seriesNumber = input.nextInt();
                System.out.print("Masukkan harga: ");
                double price = input.nextDouble();

                System.out.println("Pilih tipe produk:\n1. Smartphone\n2. Laptop\n3. Camera");
                System.out.print("Pilih tipe produk (1-3): ");
                int pil = input.nextInt();
                if (pil == 1){
                    System.out.print("Masukkan ukuran layar (inci): ");
                    double screenSize = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                    int storageCapacity = input.nextInt();

                    Smartphone phone = new Smartphone();
                    phone.setBrand(brand);
                    phone.setSeriesNumber(seriesNumber);
                    phone.setPrice(price);
                    phone.setScreenSize(screenSize);
                    phone.setStorageCapacity(storageCapacity);

                    arr.add(new Smartphone(brand, seriesNumber, price, screenSize, storageCapacity));
                } else if (pil == 2){
                    System.out.print("Masukkan ukuran RAM (GB): ");
                    int ramSize = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan tipe processor: ");
                    String processorType = input.nextLine();

                    Laptop laptop = new Laptop();
                    laptop.setBrand(brand);
                    laptop.setSeriesNumber(seriesNumber);
                    laptop.setPrice(price);
                    laptop.setRamSize(ramSize);
                    laptop.setProcessorType(processorType);

                    arr.add(new Laptop(brand, seriesNumber, price, ramSize, processorType));
                } else if (pil == 3){
                    System.out.print("Masukkan resolusi (pixel): ");
                    int resolution = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan tipe lensa: ");
                    String lensType = input.nextLine();

                    Camera cam = new Camera();
                    cam.setBrand(brand);
                    cam.setSeriesNumber(seriesNumber);
                    cam.setPrice(price);
                    cam.setResolution(resolution);
                    cam.setLensType(lensType);

                    arr.add(new Camera(brand, seriesNumber, price, resolution, lensType));
                } 
                showMenu();
            case 2:
                if (arr.isEmpty()){
                    System.out.println("Belum ada produk, silahkan tambahkan produk");
                    System.out.println();
                    showMenu();
                } else {
                    System.out.println("Daftar produk: ");
                    for (Product product : arr){
                        product.displayInfo();;
                        System.out.println();
                    }
                }
                showMenu();
            case 3:
                if (arr.isEmpty()){
                    System.out.println("Belum ada produk ditambahkan, silahkan tambahkan produk terlebih dahulu.");
                    System.out.println();
                    showMenu();
                } else{
                    System.out.print("Masukkan nomor seri yang ingin dibeli: ");
                    int nomor = input.nextInt();
                    for (Product product  : arr){
                        if (product.seriesNumber == nomor){
                            System.out.println("Anda telah membeli produk: ");
                            product.displayInfo();
                            arr.remove(product);
                            showMenu();
                        } else{
                            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
                            showMenu();
                        }
                    }
                }
            case 4:
                System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                break;
        
            default:
                System.out.println("Input tidak valid");
                showMenu();
                break;
        }
    }
}
