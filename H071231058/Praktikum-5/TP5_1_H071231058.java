import java.util.Scanner;

class Geometri{
    double s, p, l, t, r;
    double phi = Math.PI;
}

class Kubus extends Geometri{
    double luas(){
        return 6 * (s * s);
    }
    double volume(){
        return  s * s * s;
    }
    void show(){
        System.out.println("Luas kubus  : " + this.luas());
        System.out.println("Volume kubus: " + this.volume());
    }
}

class Balok extends Geometri{
    double luas(){
        return 2 * (p*l + p*t + l*t);
    }
    double volume(){
        return p * l * t;
    }
    void show(){
        System.out.println("Luas balok  : " + this.luas());
        System.out.println("Volume balok: " + this.volume());
    }
}

class Bola extends Geometri{
    double luas(){
        return 4 * phi * r * r;
    }
    double volume(){
        return 4/3 * phi * r * r * r;
    }
    void show(){
        System.out.println("Luas bola  : " + this.luas());
        System.out.println("Volume bola: " + this.volume());
    }
}

class Tabung extends Geometri{
    double luas(){
        return (2 * phi * r * t) + (2 * phi * r * r);
    }
    double volume(){
        return (phi * r * r) * t;
    }
    void show(){
        System.out.println("Luas tabung  : " + this.luas());
        System.out.println("Volume tabung: " + this.volume());
    }
}

class Persegi extends Geometri{
    double luas(){
        return s * s;
    }
    double keliling(){
        return 4 * s;
    }
    void show(){
        System.out.println("Luas persegi    : " + this.luas());
        System.out.println("Keliling persegi: " + this.keliling());
    }
}

class PersegiPanjang extends Geometri{
    double luas(){
        return p * l;
    }
    double keliling(){
        return 2 * (p + l);
    }
    void show(){
        System.out.println("Luas persegi panjang    : " + this.luas());
        System.out.println("Keliling persegi panjang: " + this.keliling());
    }
}

class Lingkaran extends Geometri{
    double luas(){
        return phi * r * r;
    }
    double keliling(){
        return 2 * phi * r;
    }
    void show(){
        System.out.println("Luas lingkaran    : " + this.luas());
        System.out.println("Keliling lingkaran: " + this.keliling());
    }
}

class Trapesium extends Geometri{
    double s1, s2, s3, s4;
    double luas(){
        return 0.5 * (s1 + s2) * t;
    }
    double keliling(){
        return s1 + s2 + s3 + s4;
    }
    void show(){
        System.out.println("Luas trapesium    : " + this.luas());
        System.out.println("Keliling trapesium: " + this.keliling());
    }
}


public class TP5_1_H071231058{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        Bola bola = new Bola();
        Tabung tabung = new Tabung();
        Persegi persegi = new Persegi();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Lingkaran lingkaran = new Lingkaran();
        Trapesium trapesium = new Trapesium();
        
        listGeometri();
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("----------------------------------------");
                System.out.print("Masukkan sisi kubus: ");
                kubus.s = input.nextDouble();
                kubus.show();
                System.out.println("----------------------------------------");
                break;
            case 2:
                System.out.println("----------------------------------------");
                System.out.print("Masukkan panjang balok: ");
                balok.p = input.nextDouble();
                System.out.print("Masukkan lebar balok  : ");
                balok.l = input.nextDouble();
                System.out.print("Masukkan tinggi balok : ");
                balok.t = input.nextDouble();
                balok.show();
                System.out.println("----------------------------------------");
                break;
            case 3:
                System.out.println("----------------------------------------");
                System.out.print("Masukkan jari-jari bola: ");
                bola.r = input.nextDouble();
                bola.show();
                System.out.println("----------------------------------------");
                break;
            case 4:
                System.out.println("----------------------------------------");
                System.out.print("Masukkan jari-jari tabung: ");
                tabung.r = input.nextDouble();
                System.out.print("Masukkan tinggi tabung   : ");
                tabung.t = input.nextDouble();
                tabung.show();
                System.out.println("----------------------------------------");
                break;
            case 5:
                System.out.println("----------------------------------------");
                System.out.print("Masukkan sisi persegi: ");
                persegi.s = input.nextDouble();
                persegi.show();
                System.out.println("----------------------------------------");
                break;
            case 6:
                System.out.println("----------------------------------------");
                System.out.print("Masukkan panjang persegi panjang: ");
                persegiPanjang.p = input.nextDouble();
                System.out.print("Masukkan lebar persegi panjang  : ");
                persegiPanjang.l = input.nextDouble();
                persegiPanjang.show();
                System.out.println("----------------------------------------");
                break;
            case 7:
                System.out.println("----------------------------------------");
                System.out.print("Masukkan jari-jari lingkaran: ");
                lingkaran.r = input.nextDouble();
                lingkaran.show();
                System.out.println("----------------------------------------");
                break;
            case 8:
                System.out.println("----------------------------------------");
                System.out.print("Masukkan sisi 1 trapesium: ");
                trapesium.s1 = input.nextDouble();
                System.out.print("Masukkan sisi 2 trapesium: ");
                trapesium.s2 = input.nextDouble();
                System.out.print("Masukkan sisi 3 trapesium: ");
                trapesium.s3 = input.nextDouble();
                System.out.print("Masukkan sisi 4 trapesium: ");
                trapesium.s4 = input.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                trapesium.t = input.nextDouble();
                trapesium.show();
                System.out.println("----------------------------------------");
                break;        
            default:
                break;
        } 
        input.close();
    }
    static void listGeometri(){
        System.out.println("----------------------------------------");
        System.out.println("==== BANGUN RUANG ====");
        System.out.println("1. KUBUS\n2. BALOK\n3. BOLA\n4. TABUNG");
        System.out.println();
        System.out.println("==== BANGUN DATAR ====");
        System.out.println("5. PERSEGI\n6. PERSEGI PANJANG\n7. LINGKARAN\n8. TRAPESIUM");
        System.out.println("----------------------------------------");
    }
}