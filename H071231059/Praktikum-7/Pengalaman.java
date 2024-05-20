public class Pengalaman extends Kehidupan{
    
    public void jenisPekerjaan(int pekerjaan) {
        switch (pekerjaan) {
            case 1:
                setPekerjaan("Freelancer");
                break;
            case 2:
                setPekerjaan("Magang");
                break;
            case 3:
                setPekerjaan("Pekerja Tetap");
                break;
            default:
                break;
        }
    }

    public void organisasi(int banyakOrganisasi) {
        setBanyakOrganisasi(banyakOrganisasi);;
    }
    
    @Override
    public void prosesKehidupan() {
        System.out.println("Jumlah Organisasi yang pernah diikuti: " + getBanyakOrganisasi());

        if (!pekerjaan.isEmpty()) {
            System.out.println("Jenis pekerjaan sebelumnya: " + getPekerjaan());
        }
    }
}


