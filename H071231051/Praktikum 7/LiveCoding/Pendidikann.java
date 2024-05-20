package LiveCoding;

import java.util.Scanner;

public class Pendidikann {
    String inputPendidikann;

    public void prosesPendidikan(Scanner scan){
        System.out.print("Pendidikan Terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
        inputPendidikann = scan.nextLine().toUpperCase();
    }

    public String getInputPendidikann() {
        return inputPendidikann;
    }

    public void setInputPendidikann(String inputPendidikann) {
        this.inputPendidikann = inputPendidikann;
    }

}
