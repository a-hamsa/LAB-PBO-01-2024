package TP6_2_H071231058;

import TP6_1_H071231058.Smartphone;
import TP6_1_H071231058.Car;
import TP6_1_H071231058.SiberianHusky;

public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung", 4000000);
        phone.move(5);
        
        Car car = new Car(8, "Silver", 190);
        car.move(100);

        System.out.println();
        SiberianHusky husky = new SiberianHusky(2,100);
        husky.move(2);
        husky.describe("Tubuh    : Berukuran sedang dengan postur yang proporsional dan kuat.\nBulu     : Bulu tebal dan halus dengan lapisan ganda yang tahan cuaca. Biasanya berwarna hitam dan putih, sering dengan pola wajah yang mencolok.\nKepala   : Kepala proporsional dengan telinga tegak dan mata yang sedikit miring.\nMata     : Mata berbentuk almond dan biasanya biru atau coklat.\nCiri Khas: Mata biru yang mencolok, ekor berbulu tebal, dan postur yang anggun.");
    }
}
