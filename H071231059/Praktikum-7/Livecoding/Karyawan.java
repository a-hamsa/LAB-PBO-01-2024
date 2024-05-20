package livecoding;

public class Karyawan {
    String nama, jabatan;
    int umur, gaji;

    void displayInfo() {
        System.out.println("nama: " + nama);
        System.out.println("umur: " + umur);
        System.out.println("Gaji: $" + gaji);
        System.out.println("Jabatan: " + jabatan);
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
