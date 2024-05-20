package TP8_1_H071231051;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TP8_1_H071231051 {
    private static int failedLoads = 0;

    public static void incrementFailedLoad() {
        failedLoads++;
    }

    public static void main(String[] args) {
        int data = 4;
        UiThread uiThread = new UiThread();
        uiThread.startLoading(data);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < data; i++) {
            executor.submit(new BackgroundThread());
        }
        executor.shutdown();

        try {
            int totalTime = 0;
            while (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
                totalTime++;
                uiThread.updateLoading(totalTime);
            }
            uiThread.taskFinish(totalTime, data - failedLoads, failedLoads);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
