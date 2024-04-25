package TP5_1_H071231006;

public class Kubus extends BangunRuang {

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    double hitungVolume() {
        return sisi * sisi * sisi;
    }

    double hitungLuas() {
        return 6 * sisi * sisi;
    }
}
