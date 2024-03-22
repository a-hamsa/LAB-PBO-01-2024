import java.util.Scanner;

public class TP1_5_H071231078 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 
        try {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == num) {
                        System.out.println("Found " + num + " at " +"[" + i +"]"  + " " + "["+j+"]");
                        break; 
                    }
                }
            }

            scan.close();
        } catch (Exception e) {
            System.out.println("invalid input");
        }
    }
}
