package TP6_H071231051;
import TP6_H071231051.induk.Move;

abstract public class Dogs implements Move{
     int position;
     int averageLength;

    public Dogs(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public abstract void describe();
}

class Pitbull extends Dogs {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    public void move() {
        position += 3;
        System.out.println("Pitbull berpindah, posisi saat ini: " + position);
    }

    public void describe() {
        System.out.println("Pitbull merupakan anjing petarung yang dikembangkan di Inggris, Skotlandia, dan Irlandia abad ke-19 dari keturunan bulldog dan terrier untuk berburu ");
    }
}

class SiberianHusky extends Dogs {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    public void move() {
        position += 2;
        System.out.println("Siberian Husky berpindah, posisi saat ini: " + position);
    }

    public void describe() {
        System.out.println("Siberian husky adalah anjing yang kuat, berukuran sedang, memiliki bulu tebal untuk menahan suhu dingin yang ekstrem, telinga segitiga yang tegak, dan kaki yang kuat.");
    }
}

class Bulldog extends Dogs {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    public void move() {
        position += 1;
        System.out.println("Bulldog berpindah, posisi saat ini: " + position);
    }

    public void describe() {
        System.out.println("Ras Bulldog memiliki tubuh yang pendek, kokoh dan kulit yang lentur, terutama di bagian kepala, leher dan bahu.");
    }
}

class GermanShepherd extends Dogs {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    public void move() {
        position += 3;
        System.out.println("German Shepherd berpindah, posisi saat ini: " + position);
    }

    public void describe() {
        System.out.println("German Shepherd  salah satu ras murni anjing yang populer. Ukurannya besar, dikenal cerdas namun penurut.");
    }
}

