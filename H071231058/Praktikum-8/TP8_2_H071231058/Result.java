public class Result {
    private String name;
    private double finishTime;

    public Result(String name, double finishTime) {
        this.name = name;
        this.finishTime = finishTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String racerName) {
        this.name = racerName;
    }

    public double getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(double racerTime) {
        this.finishTime = racerTime;
    }
}
