public class Karyawan {
    String nama, jabatan;
    int umur, gaji;

    public void displayinfo() {
        System.out.println("Detail Karyawan: ");
        System.out.println("Nama: " + nama);
        System.out.println("umur: " + umur);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: $" + gaji);
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

    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }    
}