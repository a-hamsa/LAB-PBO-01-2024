package TP_2;

public class LIve_Coding_2 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        
        cuboid.height = 2.5;
        cuboid.widht = 2.7;
        cuboid.length = 5.6;

        
        System.out.printf("volume = %.2f", cuboid.getVolume());
    }
}

/**
 *  Cuboid
 */
class Cuboid {
    double height;
    double widht;
    double length;

    public double getVolume(){
        return height * widht * length;
    }
    
}
