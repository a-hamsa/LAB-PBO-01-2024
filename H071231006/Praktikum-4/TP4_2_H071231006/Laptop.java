package TP4_2_H071231006;

public class Laptop {
    String merk;
    int model;
    int harga;
    int tahunProduksi;
    String deskripsi;


public void setMerk (String merk){
    this.merk = merk;
}

public String getMerk(){
    return merk;
}

public void setModel (int model){
    this.model = model;
}

public int getModel(){
    return merk;
}

public void setHarga (int harga){
    this.harga = harga;
}

public int getHarga(){
    return harga;
}

public void setTahunProduksi (int tahunProduksi){
    this.tahunProduksi = tahunProduksi;
}

public int getTahunProduksi(){
    return tahunProduksi;
}

public void setDeskripsi (String deskripsi){
    this.deskripsi = deskripsi;
}

public String getDeskripsi(){
    return deskripsi;
}

public Laptop (String merk, int model, int harga, int tahunProduksi, String deskripsi){
    this.merk = merk;
    this.model = model;
    this.harga = harga;
    this.tahunProduksi = tahunProduksi;
    this.deskripsi = deskripsi;
}

public Laptop(){
    this.merk = "Asus";
    this.model = 20;
    this.harga = 500000;
    this.tahunProduksi = 2015;
    this.deskripsi = "Laptop ini berwarna hitam";
}

public void displayInfo(){
    System.out.println("Merk :\t" + merk);
    System.out.println("Harga :\t" + harga);
    System.out.println("Model :\t" + model);
    System.out.println("Tahun Produksi :" + tahunProduksi);
    System.out.println("Deskripsi :" + deskripsi);
    // this.merk = "Merk :" + merk;
    // this.model =  model;
    // this.harga = harga;
    // this.tahunProduksi = tahunProduksi;
    // this.deskripsi = "Deskripsi : " + deskripsi;
}

}