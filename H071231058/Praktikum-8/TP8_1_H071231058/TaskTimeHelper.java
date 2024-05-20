package TP8_1_H071231058;

import java.util.Random;

public class TaskTimeHelper {

    private static final Random RANDOM = new Random();

    public static int getAngkaRandom() {
        return RANDOM.nextInt(10) + 1;
    }
}
