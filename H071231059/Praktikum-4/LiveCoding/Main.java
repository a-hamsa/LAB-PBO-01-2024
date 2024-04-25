package LiveCoding;

public class Main {
    public static void main(String[] args) {
        AcaraOlahraga peserta1 = new AcaraOlahraga();
        peserta1.setNama("Andi");
        peserta1.setDeskripsi("rambut hitam, mata hitam");
        peserta1.setJenisOlahraga("Lari estafet");
        peserta1.setDurasi(3);
        peserta1.setPenyiar("RRI");

        AcaraOlahraga peserta2 = new AcaraOlahraga("Budi", "RRI", "Bola Voli", "Rambut coklat", 15);
        peserta1.displayInfo();
        System.out.println();
        peserta2.displayInfo();
        System.out.println();
        SelfUtils.displaySelfData();
    }
}
