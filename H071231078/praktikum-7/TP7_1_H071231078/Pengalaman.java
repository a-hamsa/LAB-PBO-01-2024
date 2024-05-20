package TP7_1_H071231078;

public class Pengalaman extends Kehidupan{

    String pengalamanOrganisasi,pengalamanKerja,statusPernikahan,levelPendidikan;
    int projekIT,gajiSebelum;

    

    @Override
    void prosesKehidupan() {
        // TODO Auto-generated method stub
        
    }


    
    String pekerjaan(int pilihan){
        if (pilihan == 1) {
            return "freelancer";
        } else if (pilihan == 2){
            return "magang";
        } else if(pilihan == 3){
            return "pekerja tetap";
        } else {
            return "tidak ada";
        }
    }



    String Organisasi(String pilihan) {
        try {
            if (pilihan.isEmpty()) {
                throw new Exception("Input kosong");
            }

            switch (pilihan) {
                case "y":
                    return "ya";
                case "t":
                    return "tidak";
                default:
                    throw new Exception("Input tidak valid");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "kosong";
        }
    }



    

    public String getPengalamanOrganisasi() {
        return pengalamanOrganisasi;
    }

    public void setPengalamanOrganisasi(String pengalamanOrganisasi) {
        this.pengalamanOrganisasi = pengalamanOrganisasi;
    }

    public String getPengalamanKerja() {
        return pengalamanKerja;
    }

    public void setPengalamanKerja(String pengalamanKerja) {
        this.pengalamanKerja = pengalamanKerja;
    }

    public String getStatusPernikahan() {
        return statusPernikahan;
    }

    public void setStatusPernikahan(String statusPernikahan) {
        this.statusPernikahan = statusPernikahan;
    }

    public String getLevelPendidikan() {
        return levelPendidikan;
    }

    public void setLevelPendidikan(String levelPendidikan) {
        this.levelPendidikan = levelPendidikan;
    }

    public int getProjekIT() {
        return projekIT;
    }

    public void setProjekIT(int projekIT) {
        this.projekIT = projekIT;
    }

    public int getGajiSebelum() {
        return gajiSebelum;
    }

    public void setGajiSebelum(int gajiSebelum) {
        this.gajiSebelum = gajiSebelum;
    }

}
