public class ThreadList implements Runnable{

    @Override
    public void run() {
        try {
            int sleepTime = 1000 * TaskTimeHelper.randomNumber();
            // System.out.println(sleepTime);
            Thread.sleep(sleepTime);
            if (sleepTime > 4000) {
                System.out.println("Request Timeout");
                UIThread.data_yang_blm_selesai++;
                return;
            }
            synchronized (UIThread.class) {
                UIThread.data_yang_sudah_selesai++;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
}
