import java.util.InputMismatchException;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int bulat = 0;
            int desimal = 0;

            String cekinput1 = scan.nextLine();
            if(cekinput1.contains(" ")){
                System.out.println("Input tidak valid, tolong jangan masukkan spasi");
                scan.close();
                return;
            }

            int input1 = Integer.parseInt(cekinput1);
            String input2 = scan.nextLine();

            String[] hilangspasi = input2.split(" ");
            if(hilangspasi.length < input1){
                System.out.println("Input Kurang dari panjang bilangan");
                scan.close();
                return;
            }

            Number[] listangka = new Number[input1];

            for(int i = 0; i < hilangspasi.length; i++) {
                try {
                    listangka[i] = Integer.parseInt(hilangspasi[i]);
                } catch (NumberFormatException e) {
                    listangka[i] = Float.parseFloat(hilangspasi[i]);
                }
            }
            for(int i = 0; i < listangka.length; i++) {
                if(listangka[i] instanceof Integer){
                    bulat++;
                }else{
                    desimal++;
                }
            }
            System.out.println(bulat + " Bilangan Bulat");
            System.out.println(desimal + " Bilangan Desimal");
            
        } catch (InputMismatchException a) {
            System.out.println("Input tidak valid");
        } catch (IndexOutOfBoundsException b){
            System.out.println("Input melebihi panjang bilangan");
        } catch (NumberFormatException c) {
            System.out.println("Input tidak valid, Tolong masukkan bilangan bulat");
        } finally {
            scan.close();
        }
    }
}