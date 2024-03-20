import java.util.Scanner;

public class TP1_1_H071231078 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int num1 = scan.nextInt();
            scan.nextLine();

            int bil_bulat = 0;
            int bil_Desimal = 0;
        
            String num2 = scan.nextLine();
            String[] temp_nums = num2.split("\\s+");
        
            double[] nums = new double[num1]; 

            for (int i = 0; i < num1; i++) {
                nums[i] = Double.parseDouble(temp_nums[i]); 
            }

            for (double i : nums) {
                if (i % 1 == 0) { 
                    bil_bulat += 1;
                } else {
                    bil_Desimal += 1;
                }
            }

            System.out.println(bil_bulat + " Bilangan Bulat");
            System.out.println(bil_Desimal + " Bilangan Desimal");
            scan.close();

    } catch (Exception e){
         System.out.println("Input bukan merupakan Bilangan");
    } finally {
        System.out.println("Program Complete...!!");
    };
       
        
        
  
}
}
