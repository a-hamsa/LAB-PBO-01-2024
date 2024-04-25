class Cuboid{
    double height;
    double width;
    double length;
    
    double getVolume(){

        return length*width*height;
    }
}

public class TP2_3_H071231053 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.length = 11.0;
        cuboid.width = 11.0;
        cuboid.height = 11.0; 
        System.out.printf("Volume = %.2f%n", cuboid.getVolume());
    }
        


    }

