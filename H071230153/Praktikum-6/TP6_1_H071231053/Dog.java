package TP6_1_H071231053;


abstract class Dog{
   int position;
   int averageLength;

   abstract void move();
   abstract void describe();
}

class Pitbull extends Dog {
    
    @Override
    public void move() {
        this.position += 3; 
        System.out.println("Pitbull bergerak 3 langkah ke kiri.");
    }

    @Override
    public void describe() {
        System.out.println("Agresif, Menyeramkan, Pemarah, gigi tajam, Kekar.");
    }
}

class SiberianHusky extends Dog {

    @Override
    public void move() {
        this.position += 2; 
        System.out.println("Siberian Husky bergerak 2 langkah ke kiri.");
    }

    @Override
    public void describe() {
        System.out.println("Serigala berkedok Anjing, Energik, Egois Berdasarkan Mood, Pemalas, Playful.");
    }
}

class Bulldog extends Dog {

    @Override
    public void move() {
        this.position += 1; 
        System.out.println("Bulldog bergerak 1 langkah ke kiri.");
    }

    @Override
    public void describe() {
        System.out.println("Pendek, wajahnya berkeriput, berliur, gemesin.");
    }
}

class GermanShepherd extends Dog {

    @Override
    public void move() {
        this.position += 3; 
        System.out.println("German Shepherd bergerak 3 langkah ke kiri.");
    }

    @Override
    public void describe() {
        System.out.println("Pelacak yang baik, teman polisi, Gagah, berwibawa, sangat pintar, loyal, agresif situasional.");
    }
}
