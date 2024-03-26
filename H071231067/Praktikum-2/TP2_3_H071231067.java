class Cuboid {
    double height;
    double widht;
    double length;
    double getVolume(){
        return height*length*widht;
    }
}
public class TP2_3_H071231067{
    public static void main(String[] args){
        Cuboid cuboid = new Cuboid();
        cuboid.height = 150;
        cuboid.widht = 150;
        cuboid.length = 150;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
