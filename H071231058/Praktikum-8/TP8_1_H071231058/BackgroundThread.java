package TP8_1_H071231058;

public class BackgroundThread implements Runnable {

    @Override
    public void run() {
        int time = TaskTimeHelper.getAngkaRandom();
        try {
            Thread.sleep(time * 1000);
            if (time > 4) {
                System.out.println("Request Timeout");
                Main.incrementFailedLoaded();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}