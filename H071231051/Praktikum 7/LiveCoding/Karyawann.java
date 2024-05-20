package LiveCoding;

public class Karyawann {
    String nama, jabatan;
    int umur;
    double gaji;
    String pendidikanTerakhir;
    

    public Karyawann(String nama, int umur, double gaji, String pendidikannTerakhir){
        this.nama = nama;
        this.umur = umur;
        this.jabatan = "Karyawan";
        this.gaji = gaji;
        this.pendidikanTerakhir = pendidikannTerakhir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }


    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public void tampilanDetail(){
        System.out.println("Nama               : " + nama);
        System.out.println("Umur               : " + umur);
        System.out.println("Jabatan            : " + jabatan);
        System.out.println("Gaji               : " + gaji);
        System.out.println("Pendidikan Terakhir: " + pendidikanTerakhir);
    }
}

