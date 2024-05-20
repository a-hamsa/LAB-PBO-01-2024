package livecoding;

public class Pendidikan extends Kehidupan{
  void lulusan(String pendidikanTerakhir)  {
    if (pendidikanTerakhir.equals("SD")) {
        SD();
    } else if (pendidikanTerakhir.equals("SMP")) {
        SMP();
    } else if (pendidikanTerakhir.equals("SMA")) {
        SMA();
    } else if (pendidikanTerakhir.equals("S1")) {
        S1();
    } else if (pendidikanTerakhir.equals("S2")) {
        S2();
    } else if (pendidikanTerakhir.equals("S3")) {
        S3();
    }
  }
    @Override
    void prosesKehidupan() {
        System.out.println("Pendidikan Terakhir: " + getPendidikanTerakhir());
    }

    void SD(){
        setPendidikanTerakhir("SD");
      }
    void SMP(){
        setPendidikanTerakhir("SMP");
    }
    void SMA(){
        setPendidikanTerakhir(" SMA");
    }
    void S1(){
        setPendidikanTerakhir("S1");
    }
      void S2(){
        setPendidikanTerakhir("S2");
      }
    void S3(){
        setPendidikanTerakhir("S3");
    }
}


  