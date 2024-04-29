package TP5_1_H071231051;

class BangunDatar{
    double sisi, p, l, r, a, b, c, d, t;
}
class Persegi extends BangunDatar{

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    double hitungKeliling(){
        return 4 * sisi;
    }

    double hitungLuas(){
        return sisi * sisi;
    }
}

class PersegiPanjang extends BangunDatar{
    
    public PersegiPanjang(double p, double l){
        this.p = p;
        this.l = l;
    }
    double hitungKeliling(){
        return 2 * (p * l);
    }
    double hitungLuas(){
        return p * l;
    }
}

class Lingkaran extends BangunDatar{

    public Lingkaran(double r){
        this.r = r;
    }

    double hitungKeliling(){
        return 2 * Math.PI * r;
    }

    double hitungLuas(){
        return Math.PI * r * r;
    }
}

class Trapesium extends BangunDatar{
    public Trapesium(double a, double b, double c, double d, double t){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.t = t;
    }

    double hitungKeliling(){
        return a + b + c + d;
    }

    double hitungLuas(){
        return ((a + b)/2) * t;
    }
}
