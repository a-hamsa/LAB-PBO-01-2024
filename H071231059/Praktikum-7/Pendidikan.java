public class Pendidikan extends Kehidupan{

    public void lulusan(String pendTerakhir) {
        if (pendTerakhir != null) {
            if (pendTerakhir.equals("SD")) {
                SD();
            } else if (pendTerakhir.equals("SMP")) {
                SMP();
            } else if (pendTerakhir.equals("SMA")) {
                SMA();
            } else if (pendTerakhir.equals("SMK")) {
                SMK();
            } else if (pendTerakhir.equals("S1")) {
                S1();
            } else if (pendTerakhir.equals("S2")) {
                S2();
            } else if (pendTerakhir.equals("S3")) {
                S3();
            }
        }
    }
    

    public void SD() {
        setPendidikanTerakhir("SD");
    }

    public void SMP() {
        setPendidikanTerakhir("SMP");
    }

    public void SMA() {
        setPendidikanTerakhir("SMA");
    }

    public void SMK() {
        setPendidikanTerakhir("SMK");
    }

    public void S1() {
        setPendidikanTerakhir("S1");
    }

    public void S2() {
        setPendidikanTerakhir("S2");
    }

    public void S3() {
        setPendidikanTerakhir("S3");
    }

    @Override
    public void prosesKehidupan() {
        System.out.println("Pendidikan terakhir: " + getPendidikanTerakhir());
    }
}
