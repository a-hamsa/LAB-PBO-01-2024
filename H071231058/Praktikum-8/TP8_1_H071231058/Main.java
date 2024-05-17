package TP8_1_H071231058;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    static int jumlahData = 4;
    static UiThread uiThread = new UiThread();
    static volatile int failedLoaded = 0;

    public static synchronized void incrementFailedLoaded() {
        failedLoaded++;
    }

    public static int getFailedLoaded() {
        return failedLoaded;
    }
    
    public static void main(String[] args) {
        uiThread.start(jumlahData);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < jumlahData; i++) {
            executor.submit(new BackgroundThread());
        }
        executor.shutdown();
        
        try {
            int totalTime = 0;
            while (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
                totalTime++;
                uiThread.checkData(totalTime);
            }
            uiThread.taskFinish(totalTime, jumlahData - getFailedLoaded(), getFailedLoaded());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
