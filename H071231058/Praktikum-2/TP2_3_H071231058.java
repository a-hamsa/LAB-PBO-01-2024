package TP2;

class Cuboid {
    double height;
    double width;
    double length;

    double getVolume(){
        return height * width * length;
    }
}

class Main{
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 10;
        cuboid.width = 18;
        cuboid.length = 25;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
