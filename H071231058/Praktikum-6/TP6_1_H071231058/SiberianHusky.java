package TP6_1_H071231058;

public class SiberianHusky extends Dog {

    public SiberianHusky(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(int position){
        position += 2;
        System.out.println("Posisi anjing: " + position);
    }

    public void describe(String description){
        System.out.println("Deskripsi Siberian Husky:\n" + description);
    }

}
