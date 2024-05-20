import java.util.Scanner;
import java.util.InputMismatchException;

public class Pengalaman extends Kehidupan{
    int jenisPekerjaan;
    double gaji;
    String organisasi;
    public static Scanner input = new Scanner(System.in);


    @Override
    public void prosesKehidupan() {
        try {
            System.out.println("Pengalaman sebelumnya:\n1. Freelancer\n2. Magang\n3. Pekerja Tetap\n4. Tidak ada");
            System.out.print("Input: ");
            jenisPekerjaan = input.nextInt();
            input.nextLine();
            if (jenisPekerjaan > 4 || jenisPekerjaan < 1){
                System.out.println("Inputan diluar opsi!");
            } else if (jenisPekerjaan != 4){
                System.out.print("Gaji sebelumnya: ");
                gaji = input.nextDouble();
                input.nextLine();
            }
        } catch (InputMismatchException e) {
            System.out.println("Tidak boleh kosong!");
        }
    }

    public void Organisasi(){
        System.out.println("Pengalaman Organisasi sebelumnya (Masukkan 'tidak' jika tidak ada): ");
        organisasi = input.nextLine();
    }

    //setter getter
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public int getInputJenis() {
        return jenisPekerjaan;
    }

    public void setInputJenis(int jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    public String getOrganisasi() {
        return organisasi;
    }
}
