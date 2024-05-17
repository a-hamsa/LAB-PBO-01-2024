
public class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setWpm(int wpm) {
        this.wpm = wpm;
    }

    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public String getBotName() {
        return botName;
    }

    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        // TODO 1
        long howLongToType = (long) (60000 / wpm * wordsToType.length);

        // TODO (2)
        for (String word : wordsToType) {
            try {
                Thread.sleep(howLongToType / wordsToType.length);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            addWordTyped(word);
        }

        this.addWordTyped("(selesai)");
        // TODO (3)
        int finishTime = (int) howLongToType / 1000;
        Result result = new Result(botName, finishTime);
        typeRacer.addResult(result);

    }
}