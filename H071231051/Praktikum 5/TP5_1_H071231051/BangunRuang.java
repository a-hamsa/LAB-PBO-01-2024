package TP5_1_H071231051;

class BangunRuang{
    double sisi, r, p, l, t;
}

class Kubus extends BangunRuang{

    public Kubus(double sisi){
        this.sisi = sisi;
    }

    double hitungLuas(){
        return 6 * sisi * sisi;
    }

    double hitungVolume(){
        return sisi * sisi * sisi;
    }
}

class Bola extends BangunRuang{

    public Bola( double r){
        this.r = r;
    }

    double hitungLuas(){
        return 4 * Math.PI * r * r;
    }

    double hitungVolume(){
        return (4/3) * Math.PI * r * r * r;
    }
}

class Balok extends BangunRuang{

    public Balok(double p, double l, double t){
        this.p = p;
        this.l = l;
        this.t = t;
    }

    double hitungLuas(){
        return 2 * ((p*l)+(p*t)+(l*t));
    }

    double hitungVolume(){
        return p * l * t ;
    }
}

class Tabung extends BangunRuang{

    public Tabung(double r, double t){
        this.r = r;
        this.t = t;
    }

    double hitungLuas(){
        return 2 * Math.PI * r * t + 2 * Math.PI * r * r;
    }

    double hitungVolume(){
        return Math.PI * r * r * t;
    }
}

