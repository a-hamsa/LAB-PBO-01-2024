package TP8_2_H071231053;

public class Result {
    

    private String name;
    private int finishTime;
    
    public Result(int finishTime) {
        this.finishTime = finishTime;
    }

    public Result(String name, int finishTime) {
        this.name = name;
        this.finishTime = finishTime;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String racerName) {
        this.name = racerName;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }
}
