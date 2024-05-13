package livecoding;

public abstract class Kehidupan {
    String pendidikanTerakhir, pekerjaan;
    int banyakProjek;

    abstract void prosesKehidupan();
    
    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }
    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }
    public String getPekerjaan() {
        return pekerjaan;
    }
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    public int getBanyakProjek() {
        return banyakProjek;
    }
    public void setBanyakProjek(int banyakProjek) {
        this.banyakProjek = banyakProjek;
    }
    
}
