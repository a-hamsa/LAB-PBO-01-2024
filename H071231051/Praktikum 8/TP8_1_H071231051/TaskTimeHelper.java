package TP8_1_H071231051;

import java.util.Random;

public class TaskTimeHelper {
    public static int getRandomTime() {
        return new Random().nextInt(6) + 1;
    }
}
