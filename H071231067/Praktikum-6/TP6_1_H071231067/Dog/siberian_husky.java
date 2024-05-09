package TP6_1_H071231067.Dog;

import TP6_1_H071231067.Imove;

public class siberian_husky extends dog implements Imove{
    public siberian_husky(int position, int averageLength){
        super(position, averageLength);
    }

    public void describe(){
        System.out.println("Ini adalah Anjing Siberian Husky");
    }

    public void move(){
        position = position + 2;
        System.out.println("Pitbull Berpindah kekanan 3,sekarang berada di posisi "+ position);
    }
}
