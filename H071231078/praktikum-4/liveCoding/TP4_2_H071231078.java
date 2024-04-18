public class TP4_2_H071231078 {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.setJudul("sherlockHolmes");
        buku1.setGenre("mistery");
        buku1.setPengarang("Sir Arthur Conan Doyle");
        buku1.setSinopsis("merupakan novel tentang detektif terkenal");
        buku1.setDurasi(120);

        buku1.DisplayInfo();

        Buku buku2 = new Buku("naruto", "masahi kishimoto", "fantasy","manga terkenal", 120);
        System.out.println("======================");
        System.out.println(buku2.getJudul());
        System.out.println(buku2.getGenre());
        System.out.println(buku2.getPengarang());
        System.out.println(buku2.getSinopsis());
        System.out.println(buku2.getDurasi());

        selfUtils.DisplaySelfData();
    }
}


