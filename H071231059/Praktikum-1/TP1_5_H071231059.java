import java.util.Scanner;

public class TP1_5_H071231059 {
    public static void main(String[] args) {
        int[][] nums = {{22,3,18},{8,1,12},{20,6,5}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bilangan: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int found = 0;
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i][j] == n) {
                    found++;
                    x = i;
                    y = j;
                    break;
                } 
            }
        } 
        if (found == 1) {
            System.out.println("found " + n + " at [" + x + "][" + y + "]");
        } else {
            System.out.println("Bilangan yang anda masukkan tidak terdapat dalam array.");
        }
        scanner.close();
    }
}
