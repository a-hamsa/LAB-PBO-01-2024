public class Main {

    public static void main(String[] args) {
        Series series1 = new Series();
        series1.setJudul("Weathering with you");
        series1.setGenre("comedy, drama, action");
        series1.setSutradara("Makoto shinkai");
        series1.setJumlahEpisode(1);
        series1.setSinopsis("ada gadis hujan dan dia spesial akan bisa counter hujan dengan cuaca cerah");

        Series series2 = new Series("John wick","action, drama, thriller","WarnerBros","sebuah pensiunan pembunuh bayaran yang diusik kembali dan dia menjadi pembunuh bayaran lagi",1);
        series1.displayInfo();
        System.out.println();
        series2.displayInfo();
        System.out.println();
        SelfUtils.displaySelfUtils();



    }
}