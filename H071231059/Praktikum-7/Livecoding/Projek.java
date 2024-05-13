package livecoding;

public class Projek extends Kehidupan{
    void pilBanyakProjek(int banyakProjek) {
        if (banyakProjek == 1) {
            setBanyakProjek(4);
        } else if (banyakProjek == 2) {
            setBanyakProjek(8);
        } else if (banyakProjek == 3) {
            setBanyakProjek(12);
        } else if (banyakProjek == 4) {
            setBanyakProjek(15);
        }
    }

    void prosesKehidupan() {
        if (getBanyakProjek() == 15) {
            System.out.println("Jumlah projek lebih dari 15 ");
        } else {
            System.out.println("jumlah projek sebanyak " + getBanyakProjek());
        }
    }
}
