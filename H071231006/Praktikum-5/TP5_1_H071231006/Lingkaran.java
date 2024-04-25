package TP5_1_H071231006;

public class Lingkaran extends BangunDatar {

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}
