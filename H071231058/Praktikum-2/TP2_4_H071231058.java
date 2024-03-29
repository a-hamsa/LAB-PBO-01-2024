package TP2;

class Alamat{
    String jalan, kota;

    public Alamat(String jalan, String kota){
        this.jalan = jalan;
        this.kota = kota;
    }

    public Alamat() {}
}

class Mahasiswa {
    Alamat alamat;
    String nama, nim;

    public Mahasiswa(Alamat alamat, String nama, String nim){
        this.alamat = alamat;
        this.nama = nama;
        this.nim = nim;
    }

    public Mahasiswa() {}

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setAlamat(Alamat alamat){
        this.alamat = alamat;
    }

    public String getAlamat(){
        return alamat.jalan + ", " + alamat.kota;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }
}

class Main{
    public static void main(String[] args) {
       Alamat alamat  = new Alamat();
       alamat.jalan = "Tamalanrea Indah";
       alamat.kota = "Makassar";
       
       Mahasiswa mahasiswa = new Mahasiswa();
       mahasiswa.alamat = alamat;
       mahasiswa.nama = "Destin";
       mahasiswa.nim = "H071231025";

       System.out.println("Nama: "+ mahasiswa.getNama());
       System.out.println("Nim: "+ mahasiswa.getNim());
       System.out.println("Alamat: "+ mahasiswa.getAlamat());
    }
}
