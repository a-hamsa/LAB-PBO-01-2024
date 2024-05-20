import java.util.Scanner;

public class Pendidikan {
    String jenjangPendidikan;
    private static Scanner input = new Scanner(System.in);

    void prosesPendidikan(){
        while(true){
            System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
            jenjangPendidikan = input.nextLine().toUpperCase();
            if (jenjangPendidikan.equals("SD") || jenjangPendidikan.equals("SMP") || jenjangPendidikan.equals("SMA") || jenjangPendidikan.equals("SMK") || jenjangPendidikan.equals("S1") || jenjangPendidikan.equals("S2") || jenjangPendidikan.equals("S3")){
                break;
            } else {
                System.out.println("Tingkat pendidikan yang dimasukkan tidak valid. Silahkan coba lagi!");
            }

        }
    }

    //Setter dan getter
    public String getJenjangPendidikan() {
        return jenjangPendidikan;
    }

    public void setJenjangPendidikan(String jenjangPendidikan) {
        this.jenjangPendidikan = jenjangPendidikan;
    }
}
