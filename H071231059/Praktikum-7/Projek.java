public class Projek extends Kehidupan{
    
    public void brpbanyakProjek(int banyakProjek) {
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

    @Override
    public void prosesKehidupan() {
        if (getBanyakProjek() == 15) {
            System.out.println("Projek yang telah dilakukan adalah lebih dari " + getBanyakProjek() + " projek");
        } else {
            System.out.println("Projek yang telah dilakukan adalah sebanyak " + getBanyakProjek() + " projek");
        }
    }
}
