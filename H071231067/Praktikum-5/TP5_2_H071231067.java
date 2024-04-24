import java.util.Scanner;
import java.util.ArrayList;

class Product{
    String brand;
    int seriesNumber;
    double price;
    int index;
    
    Product(String brand , int seriesNumber , double price){
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Brand         : " + this.brand);
        System.out.println("Serial Number : " + this.seriesNumber);
        System.out.println("Price         : $" + this.price);
    }

    public int getSeriesNumber(){
        return this.seriesNumber;
    }
    void garis(){
        System.out.println("----------------------------------------------");
    }
}

class Smartphone extends Product{
    double screenSize;
    int storageCapacity;

    Smartphone(String brand , int seriesNumber , double price , double screenSize , int storageCapacity){
        super(brand,seriesNumber,price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    public void displayInfoSmartphone(){
        displayInfo();
        System.out.println("Screen Size      : " + this.screenSize + " inches");
        System.out.println("Storage Capacity : " + this.storageCapacity + "GB");
        garis();
    }
}

class Camera extends Product{
    int resolution;
    String lensType;

    Camera(String brand , int seriesNumber , double price , int resolution , String lensType){
        super(brand,seriesNumber,price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    public void displayInfoCamera(){
        displayInfo();
        System.out.println("Resolution : " + this.resolution + "MP");
        System.out.println("Lens Type  : " + this.lensType);
        garis();
    }
}

class Laptop extends Product{
    int ramSize;
    String processorType;

    Laptop(String brand , int seriesNumber , double price , int ramSize , String processorType){
        super(brand,seriesNumber,price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public void displayInfoLaptop(){
        displayInfo();
        System.out.println("Processor Type : " + this.processorType);
        System.out.println("Ram Size       : " + this.ramSize + "GB");
        garis();
    }
}

public class TP5_2_H071231067 {
    static ArrayList<Smartphone> smartphones = new ArrayList<>();
    static ArrayList<Camera> cameras = new ArrayList<>();
    static ArrayList<Laptop> laptops = new ArrayList<>();

    static ArrayList<Object> SemuaList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        while(loop)
            try {
                System.out.println("Menu: ");
                System.out.println("1. Tambah Produk");
                System.out.println("2. Tampilkan Semua Produk");
                System.out.println("3. Beli Produk");
                System.out.println("4. Keluar");
                System.out.print(">>> Pilih Menu (1-4) : ");
                int pilih = input.nextInt();
                input.nextLine();

                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan Nama Produk : ");
                        String brand = input.nextLine();
                        int seriesNumber;
                            while(true){
                                System.out.print("Masukkan Nomor Seri  : ");
                                seriesNumber = input.nextInt();
                                input.nextLine();
                                boolean found = false;
                                for (Object obj : SemuaList) {
                                    if (obj instanceof Smartphone) { 
                                        int nomorSeri = ((Smartphone) obj).getSeriesNumber();
                                        if (nomorSeri == seriesNumber) {
                                            found = true;
                                            break;
                                        }
                                    } else if (obj instanceof Laptop) {
                                        int nomorSeri = ((Laptop) obj).getSeriesNumber();
                                        if (nomorSeri == seriesNumber) {
                                            found = true;
                                            break;
                                        }
                                    } else if (obj instanceof Camera) {
                                        int nomorSeri = ((Camera) obj).getSeriesNumber();
                                        if (nomorSeri == seriesNumber) {
                                            found = true;
                                            break;
                                        }
                                    }
                                }
                                if(found == true){
                                    System.out.println("Maaf Nomor Seri Sudah Digunakan");
                                }else{
                                    break;
                                }
                            }
                        System.out.print("Masukkan Harga       : ");
                        double price = input.nextDouble();
                        input.nextLine();
                        System.out.println("Pilih Tipe Produk : ");
                        System.out.println("1. Smartphone");
                        System.out.println("2. Laptop");
                        System.out.println("3. Camera");

                            boolean loop2 = true;
                            while(loop2){
                                System.out.print("Pilih Tipe Produk (1-3) : ");
                                int tipe = input.nextInt();
                                input.nextLine();
                                switch (tipe) {
                                case 1:
                                    System.out.print("Masukkan Ukuran Layar (inci) : ");
                                    double screenSize = input.nextDouble();
                                    System.out.print("Masukkan Kapasitas Penyimpanan (GB) : ");
                                    int storageCapacity = input.nextInt();
                                    input.nextLine();
                                    garis();

                                    Smartphone smartphone = new Smartphone(brand,seriesNumber,price,screenSize,storageCapacity);
                                    smartphones.add(smartphone);
                                    SemuaList.add(smartphone);
                                    loop2 = false;
                                    break;

                                case 2:
                                    System.out.print("Masukkan Ukuran Ram (GB) : ");
                                    int ramSize = input.nextInt();
                                    input.nextLine();
                                    System.out.print("Masukkan Tipe Processor  : ");
                                    String processorType = input.nextLine();
                                    garis();

                                    Laptop laptop = new Laptop(brand, seriesNumber, price, ramSize, processorType);
                                    laptops.add(laptop);
                                    SemuaList.add(laptop);
                                    loop2 = false;
                                    break;

                                case 3:
                                    System.out.print("Masukkan Resolusi Kamera : ");
                                    int resolution = input.nextInt();
                                    input.nextLine();
                                    System.out.print("Masukkan Tipe Lensa      : ");
                                    String lensType = input.nextLine();
                                    garis();

                                    Camera camera = new Camera(brand, seriesNumber, price, resolution, lensType);
                                    cameras.add(camera);
                                    SemuaList.add(camera);
                                    loop2 = false;
                                    break;

                                default:
                                    System.out.println("Masukkan 1-3");
                                    break;
                                }
                            }
                        break;

                    case 2:
                    garis();
                        if(SemuaList.isEmpty()){
                            System.out.println("Belum ada Produk !");
                            
                        }else{
                            System.out.println("Daftar Produk: ");
                            for(Object obj : SemuaList){
                            if (obj instanceof Smartphone) {
                                ((Smartphone) obj).displayInfoSmartphone();
                            } else if (obj instanceof Laptop) {
                                ((Laptop) obj).displayInfoLaptop();
                            } else if (obj instanceof Camera) {
                                ((Camera) obj).displayInfoCamera();
                            }
                        }}
                        System.out.println();
                        break;

                    case 3:
                        if(SemuaList.isEmpty()){
                            System.out.println("Belum ada Produk,Tidak Dapat Belanja");
                            System.out.println();
                            break;
                        }else{
                            System.out.print("Masukkan Nomor Seri Produk yang ingin dibeli : ");
                            int cariSeri = input.nextInt();
                            boolean dapatSeri = false;
                            Product barangYangDibeli = null;
                                for(Smartphone smartphone : smartphones){
                                    if(smartphone.getSeriesNumber() == cariSeri){
                                        System.out.println("Anda Telah Membeli Produk: ");
                                        smartphone.displayInfoSmartphone();
                                        dapatSeri = true;
                                        barangYangDibeli = smartphone;
                                        smartphones.remove(barangYangDibeli);
                                        break;
                                    }
                                }
                                for(Laptop laptop : laptops){
                                    if(laptop.getSeriesNumber() == cariSeri){
                                        System.out.println("Anda Telah Membeli Produk: ");
                                        laptop.displayInfoLaptop();
                                        dapatSeri = true;
                                        barangYangDibeli = laptop;
                                        laptops.remove(barangYangDibeli);
                                        break;
                                    }
                                }
                                for(Camera camera : cameras){
                                    if(camera.getSeriesNumber() == cariSeri){
                                        System.out.println("Anda Telah Membeli Produk");
                                        camera.displayInfoCamera();
                                        dapatSeri = true;
                                        barangYangDibeli = camera;
                                        cameras.remove(barangYangDibeli);
                                        break;
                                    }
                                }
                                if(dapatSeri){
                                    SemuaList.remove(barangYangDibeli);
                                }else{
                                    System.out.println("Produk dengan Nomor Seri tersebut tidak ditemukan.");
                                }
                            break;
                        }

                    case 4:
                        System.out.println("Terima Kasih Telah Menggunakan Layanan Kami. Sampai Jumpa! ");
                        loop = false;
                        break;

                    default:
                        System.out.println("Tolong pilih Angka 1-4");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Tolong pilih Angka 1-4");
                input.nextLine();
            }
        input.close();
    }

    static void garis(){
        System.out.println("----------------------------------------------");
    }
}
