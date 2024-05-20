package TP8_1_H071231051;

public class BackgroundThread implements Runnable {
    public void run() {
        int waktuEksekusi = TaskTimeHelper.getRandomTime();
        try {
            Thread.sleep(waktuEksekusi * 1000);
            if (waktuEksekusi > 4) {
                System.out.println("Request Timeout");
                TP8_1_H071231051.incrementFailedLoad();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
