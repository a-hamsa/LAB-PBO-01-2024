import java.util.Scanner;
import java.util.ArrayList;

public class TP1_1_H071231058{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> bulat = new ArrayList<>();
        ArrayList<Double> desimal = new ArrayList<>();

        try {
           int  n = input.nextInt();
            for (int i = 0; i < n; i++){
                double number = input.nextDouble();
                if (number == (int) number) {
                    int num = (int)number;
                    bulat.add(num);
                } else {
                    desimal.add(number);
                }
            }
            System.out.println();
            System.out.println(bulat.size() + " Bilangan Bulat");
            System.out.println(desimal.size() + " Bilangan Desimal");
        } catch (Exception e) {
            System.out.println("Input invalid");
        }       
        input.close();
    }
}