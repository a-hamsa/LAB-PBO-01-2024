import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return  wordsToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    private String[] wordsToTypeList = {
        "Menuju tak terbatas dan melampauinya", 
        "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadika setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang", 
        "Cinta sejati adalah ketika ddua jiwa saling melengkapi, memberi  dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik", 
        "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
        "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas", 
        "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna", 
        "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka", 
        "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri", 
        "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain", 
        "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa  yang kita miliki adalah kunci kepuasan yang tak ternilai"
    };

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    // TODO 4
    public synchronized void addResult(Result result) {
        raceStanding.add(result);
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen akhir Type Racer");
        System.out.println("========================");

        // TODO 5 
        Collections.sort(raceStanding, Comparator.comparingDouble(Result::getFinishTime));
        for (int i = 0; i < raceStanding.size(); i++) {
            Result result = raceStanding.get(i);
            System.out.printf("%d. %s   = %.2f detik\n", i + 1, result.getName(), result.getFinishTime());
        }
    }

    public void startRace() {
        for (Typer typer : raceContestant) {
            typer.start();
        }

        // TODO 7
        boolean raceFinished = false;
        while (!raceFinished) {
            raceFinished = true;
            System.out.println("\nTyping Progress ...");
            System.out.println("=======================");

            for (Typer typer : raceContestant) {
                System.out.printf("- %s => %s\n", typer.getBotName(), typer.getWordsTyped());
                if (typer.isAlive()) {
                    raceFinished = false;
                }
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // TODO 8
        printRaceStanding();
    }
}
