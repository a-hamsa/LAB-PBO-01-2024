package live_coding;

class Main2{
    public static void main(String[] args) {
        AcaraOlahraga obj = new AcaraOlahraga();
        obj.setNama("George");
        obj.setPenyiar("john");
        obj.setJenisOlahraga("Badminton");
        obj.setDeskripsi("....");
        obj.setDurasi(20);
        
        obj.displayInfo();

        System.out.println();
        AcaraOlahraga obj2 = new AcaraOlahraga("Destin", "Kesii", "Tenis meja", "....", 30);

        obj2.displayInfo();

        System.out.println();
        SelfUtils.displaySelfData();
    }
}