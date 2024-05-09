package TP7_1_H071231078;

public class Karyawan extends Pengalaman implements Pendidikan,Projek,Keluarga {
    String nama,jabatan;
    int umur,gaji;
    
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
    



    @Override
    public String levelPendidikan(String pilihan) {
        switch (pilihan) {
            case "SD":
                return "Pendidikan Dasar";
            case "SMP":
                return "Pendidikan Menengah Pertama";
            case "SMA":
                return "Pendidikan Menengah Atas";
            case "D3":
                return "Diploma 3";
            case "S1":
                return "Sarjana";
            case "S2":
                return "Magister";
            case "S3":
                return "Doktor";
            default:
                return "Tidak Valid";
        }
    }
    @Override
    public int pengalamanProjek(int pilihan) {
        if (pilihan == 4) {
            return 15;
        } else if (pilihan == 3){
            return 12;
        } else if(pilihan == 2){
            return 8;
        } else if(pilihan == 1){
            return 4;
        } else {
            return 0;
        }
    }
    @Override
    public String statusPernikahan(String pilihan) {
        switch (pilihan) {
            case "sudah":
                return "sudah";
            case "belum" : 
                return "belum";
            default:
                return "data kosong";
        }
    }


    

    

    
    

    
}


