package TP6_1_H071231058;

public class Bulldog extends Dog  {

    public Bulldog(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(int position){
        position += 1;
        System.out.println("Posisi anjing: " + position);
    }

    public void describe(String description){
        System.out.println("Deskrips Bulldog:\n" + description);
    }

}
