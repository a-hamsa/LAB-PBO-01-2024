package TP6_1_H071231067.Dog;

import TP6_1_H071231067.Imove;

public class bulldog extends dog implements Imove{
    public bulldog(int position, int averageLength){
        super(position, averageLength);
    }

    public void describe(){
        System.out.println("Ini adalah Anjing Bulldog");
    }

    public void move(){
        position = position + 1;
        System.out.println("Pitbull Berpindah kekanan 3,sekarang berada di posisi "+ position);
    }
}
