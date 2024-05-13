public class Keluarga extends Kehidupan{

    public void infoKeluarga(int status, int anak, int jumlahKeluarga) {
        setStatus((status == 1) ? true : false);
        setAnak(anak);
        setJumlahKeluarga(jumlahKeluarga);
    }

    @Override
    public void prosesKehidupan() {
        if (isStatus()) {
            System.out.println("Status: menikah");
            System.out.println("Jumlah anak: " + getAnak());
        } else {
            System.out.println("Status: Belum menikah");
            System.out.println("Jumlah anggota keluarga: " + getJumlahKeluarga());
        }
    }
}