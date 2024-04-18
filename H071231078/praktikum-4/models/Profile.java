package models;

public class Profile {
    private String namaLengkap,namaPanggilan,hobi;
    private int umur;


    
    public String getNamaLengkap() {
        return namaLengkap;
    }
    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }
    public String getNamaPanggilan() {
        return namaPanggilan;
    }
    public void setNamaPanggilan(String namaPanggilan) {
        this.namaPanggilan = namaPanggilan;
    }
    public String getHobi() {
        return hobi;
    }
    public void setHobi(String hobi) {
        this.hobi = hobi;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }

    
    // public Profile(String namaLengkap, String hobi, int umur) {
    //     this.namaLengkap = namaLengkap;
    //     this.hobi = hobi;
    //     this.umur = umur;
    // }




    
}