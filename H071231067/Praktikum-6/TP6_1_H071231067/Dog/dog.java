package TP6_1_H071231067.Dog;

public abstract class dog {
    int position;
    int averageLength;

    public dog(int position, int averageLength){
        this.position = position;
        this.averageLength = averageLength;
    }

    public abstract void describe();
}
