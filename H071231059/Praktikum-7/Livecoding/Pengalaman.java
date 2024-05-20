package livecoding;

public class Pengalaman extends Kehidupan{
    void jenisPekerjaan(int pekerjaan) {
        if (pekerjaan == 1) {
            setPekerjaan("Freelancer");
        } else if (pekerjaan == 2) {
            setPekerjaan("Magang");
        } else if (pekerjaan == 3) {
            setPekerjaan("Pekerja Tetap");
        } else if (pekerjaan == 4 ) {
            setPekerjaan("Tidak ada");
        }
    }

    @Override
    void prosesKehidupan() {
        if (!getPekerjaan().equals("Tidak ada")) {
            System.out.println("Pekerjaan Sebelumnya: " + getPekerjaan());
        }
    }
}
