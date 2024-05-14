public class Main_1 {
    public static void main(String[] args) {
        Thread uiThread = new Thread(new UIThread());
        uiThread.start();
    }
}
