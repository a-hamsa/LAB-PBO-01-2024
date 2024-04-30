package TP6_1_H071231058;

public class Pitbull extends Dog {

    public Pitbull(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(int position){
        position += 3;
        System.out.println("Posisi anjing: " + position);
    }

    public void describe(String description){
        System.out.println("Deskrips Pitbull:\n" + description);
    }

}
