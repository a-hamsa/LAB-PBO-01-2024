package TP5_2_H071231078;

public class camera extends product {
    int resolution;
    String lensType;

    void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("Resolution           : " + resolution);
        System.out.println("Lens Type            : " + lensType);
    }
}
