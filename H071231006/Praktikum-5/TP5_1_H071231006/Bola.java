package TP5_1_H071231006;

public class Bola extends BangunRuang {

    Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * (jariJari * jariJari *jariJari);
    }

    double hitungLuas() {
        return 4 * Math.PI * (jariJari * jariJari);
    }
}
