package TP6_1_H071231078;

public class Pitbull extends Dog implements Moving {

    @Override
    void Describe() {
        System.out.println("Ras              : American Pit Bull Terrier");
        System.out.println("Ciri Fisik       : Kepala Dan Dada Berotot Serta Lebar Dengan Rahang Yang Kuat");
        System.out.println("Sifat            : Setia, Agresif, Dan Protektif");
        System.out.println("Ukuran           : " + averageLength);
        System.out.println("Warna            : Coklat, Hitam, Coklat-Putih");
        System.out.println("Posisi Sekarang  : " + position);
        
    }

    @Override
    public void Move() {
        position += 3;
        System.out.println(this.getClass().getSimpleName()+"Telah berpindah tempat...");
        
    }

    
    
    

}
