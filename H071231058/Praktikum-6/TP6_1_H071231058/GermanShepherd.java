package TP6_1_H071231058;

public class GermanShepherd  extends Dog {

    public GermanShepherd(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(int position){
        position += 3;
        System.out.println("Posisi anjing: " + position);
    }

    public void describe(String description){
        System.out.println("Deskripsi German Sepherd:\n" + description);
    }

}
