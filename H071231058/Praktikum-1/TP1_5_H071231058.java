import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner input = new Scanner(System.in);
        
        try {
            int number = input.nextInt();
            for(int i = 0; i < nums.length; i++){
                for(int j = 0; j < nums[i].length; j++){
                    if (number == nums[i][j]) {
                    System.out.println("Found " + number + " at [" + i + "][" + j + "]" );
                    }
                }
            } 
        } catch (Exception e) {
            System.out.println("Input invalid");
        }
    }
}
