package TP5_1_H071231059;
class Bangun {
    double sisi, panjang, lebar, tinggi, jariJari;
}

class Persegi extends Bangun{
    public Persegi(double sisi) {
        super.sisi = sisi;
    }

    double hitungLuas() {
        return super.sisi * super.sisi;
    }

    double hitungKeliling() {
        return super.sisi* 4;
    }
}

class PersegiPanjang extends Bangun {
    public PersegiPanjang(double panjang, double lebar) {
        super.panjang = panjang;
        super.lebar = lebar;
    }

    double hitungLuas() {
        return super.panjang * super.lebar;
    }

    double hitungKeliling() {
        return 2 * (super.panjang + super.lebar);
    }
}

class Lingkaran extends Bangun {
    public Lingkaran(double jariJari) {
        super.jariJari = jariJari;
    }

    double hitungLuas() {
        return Math.PI * super.jariJari * super.jariJari;
    }

    double hitungKeliling() {
        return Math.PI * super.jariJari * 2;
    }
}

class Trapesium extends Bangun {
    double sisi1, sisi2, sisi3, sisi4;

    public Trapesium(double sisi1, double sisi2, double sisi3, double sisi4, double tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.sisi4 = sisi4;
        super.tinggi = tinggi;
    }

    double hitungLuas() {
        return (sisi1 + sisi2) * tinggi / 2;
    }

    double hitungKeliling() {
        return sisi1 + sisi2 + sisi3 + sisi4;
    }
}

class Kubus extends Bangun {
    public Kubus(double sisi) {
        super.sisi = sisi;
    }

    double hitungLuasPermukaan() {
        return 6 * super.sisi * super.sisi;
    }

    double hitungVolume() {
        return super.sisi * super.sisi * super.sisi;
    }
}

class Balok extends Bangun{
    public Balok(double panjang, double lebar, double tinggi) {
        super.panjang = panjang;
        super.lebar = lebar;
        super.tinggi = tinggi;
    }

    double hitungLuasPermukaan() {
        return 2 * (super.panjang * super.lebar + super.panjang * super.tinggi + super.lebar * super.tinggi);
    }

    double hitungVolume() {
        return super.panjang * super.lebar * super.tinggi;
    }
}

class Bola extends Bangun {
    public Bola(double jariJari) {
        super.jariJari = jariJari;
    }

    double hitungLuasPermukaan() {
        return 4 * Math.PI * super.jariJari * super.jariJari;
    }

    double hitungVolume() {
        return (4.0/3.0) * Math.PI * super.jariJari * super.jariJari * super.jariJari;
    }
}

class Tabung extends Bangun {
    public Tabung(double jariJari, double tinggi) {
        super.jariJari = jariJari;
        super.tinggi = tinggi;
    }

    double hitungLuasPermukaan() {
        return 2 * Math.PI * super.jariJari * (super.jariJari + super.tinggi);
    }

    double hitungVolume() {
        return Math.PI * super.jariJari * super.jariJari * super.tinggi;
    }
}
