package TP6_1_H071231078;

public class SiberianHusky extends Dog implements Moving {

    @Override
    void Describe() {
        System.out.println("Ras              : Siberian Husky");
        System.out.println("Ciri Fisik       : Berukuran Sedang, Berbulu Tebal Dengan Bulu Tertentu Yang Panjang Di Daun Telinga");
        System.out.println("Sifat            : Ramah, Enerjik, Suka Bermain, Dan Suka Berinteraksi Dengan Manusia");
        System.out.println("Ukuran           : " + averageLength);
        System.out.println("Warna            : Berbagai Warna Termasuk Abu-Abu, Hitam, Putih, Dan Campuran Keduanya");
        System.out.println("Posisi Sekarang  : " + position);
    }
    

    @Override
    public void Move() {
        position += 2;
        System.out.println(this.getClass().getSimpleName()+"Telah berpindah tempat...");
        
    }
    
}
