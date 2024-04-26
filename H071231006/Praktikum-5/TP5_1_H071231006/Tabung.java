package TP5_1_H071231006;

public class Tabung extends BangunRuang {
    
    Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    double hitungLuas() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
}