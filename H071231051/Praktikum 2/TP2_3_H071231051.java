class Cuboid{
    double height;
    double widht;
    double lenght;
    
    double getVolume() {
        return height * widht * lenght;
    }
}
public class TP2_3_H071231051{
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        
        cuboid.height = 30 ;
        cuboid.widht = 30 ;
        cuboid.lenght = 5 ;
    
        System.out.printf("Volume = %.2f\n", cuboid.getVolume());

    }
}