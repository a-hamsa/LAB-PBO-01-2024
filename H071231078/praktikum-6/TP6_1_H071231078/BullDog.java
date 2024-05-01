package TP6_1_H071231078;

public class BullDog extends Dog implements Moving {

    @Override
    void Describe() {
        System.out.println("Ras              : Bulldog");
        System.out.println("Ciri Fisik       : Tubuh Pendek, Kepala Besar Dengan Hidung Pendek Dan Rahang Yang Kuat");
        System.out.println("Sifat            : Santai, Setia, Berani, Dan Cenderung Tenang");
        System.out.println("Ukuran           : " + averageLength);
        System.out.println("Warna            : Putih, Kemerahan, Brindle, Atau Campuran Keduanya");
        System.out.println("Posisi Sekarang  : " + position);
    }
    

    @Override
    public void Move() {
        position += 1;
        System.out.println(this.getClass().getSimpleName()+"Telah berpindah tempat...");
        
    }
    
    

}
