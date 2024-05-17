package TP8_1_H071231058;

public class UiThread {
    void start(int jumlahData) {
        System.out.println("Start load " + jumlahData + " Data.");
    }

    void checkData(int detik) {
        System.out.println("Loading...(" + detik + "s)");
    }

    void taskFinish(int detik, int berhasil, int  gagal) {
        if (gagal > 0) {
            System.out.println("\nTask Finish.");
            System.out.println("Time Execution : " + detik + "s");
            System.out.println(berhasil + " Data Successfully Loaded & " + gagal + " Data failed to load.");
        } else {
            System.out.println("\nTask Finish.");
            System.out.println("Time Execution : " + detik + "s");
            System.out.println("All data is successfully loaded");
        }
    }
}
