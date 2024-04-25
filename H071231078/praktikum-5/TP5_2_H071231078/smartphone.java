package TP5_2_H071231078;

public class smartphone extends product {
    double screenSize;
    int storageCapacity;

    void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("Screen Size          : " + screenSize);
        System.out.println("storage Capacity     : " + storageCapacity);
    }
}
