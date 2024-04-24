package TP5_2_H071231078;

public class laptop extends product {
    int ramSize;
    String processorType;

    void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("Ram Size             : " + ramSize);
        System.out.println("Processor Type       : " + processorType);
    }
}
