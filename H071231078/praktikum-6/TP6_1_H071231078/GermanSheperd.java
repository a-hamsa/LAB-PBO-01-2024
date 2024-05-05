package TP6_1_H071231078;

public class GermanSheperd extends Dog implements Moving{

    @Override
    void Describe() {
        System.out.println("Ras              : German Shepherd");
        System.out.println("Ciri Fisik       : Tubuh Sedang-Kuat Dengan Dada Dalam Dan Punggung Lurus, Telinga Berdiri");
        System.out.println("Sifat            : Cerdas, Berani, Setia, Dan Rajin");
        System.out.println("Ukuran           : " + averageLength);
        System.out.println("Warna            : Hitam Dan Tan, Hitam, Abu-Abu, Atau Campuran Keduanya");
        System.out.println("Posisi Sekarang  : " + position);
    }
    

    @Override
    public void Move() {
        position += 3;
        System.out.println(this.getClass().getSimpleName()+"Telah berpindah tempat...");
        
    }
    
    

}
