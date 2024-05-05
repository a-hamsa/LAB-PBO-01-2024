package TP6_1_H071231058;

public abstract class Dog implements IMove {
    public int position;
    public int averageLength;

    public Dog(int position, int averageLength){
        this.position = position;
        this.averageLength = averageLength;
    }

    public abstract void describe(String description);

}