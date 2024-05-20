public abstract class Kehidupan {
    int banyakOrganisasi, anak, jumlahKeluarga, banyakProjek;;
    String pekerjaan, pendidikanTerakhir;
    boolean status;

    public abstract void prosesKehidupan();

    public int getBanyakOrganisasi() {
        return banyakOrganisasi;
    }
    public void setBanyakOrganisasi(int banyakOrganisasi) {
        this.banyakOrganisasi = banyakOrganisasi;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAnak() {
        return anak;
    }
    public void setAnak(int anak) {
        this.anak = anak;
    }

    public int getJumlahKeluarga() {
        return jumlahKeluarga;
    }
    public void setJumlahKeluarga(int jumlahKeluarga) {
        this.jumlahKeluarga = jumlahKeluarga;
    }

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }
    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public int getBanyakProjek() {
        return banyakProjek;
    }
    public void setBanyakProjek(int banyakProjek) {
        this.banyakProjek = banyakProjek;
    }    
}

