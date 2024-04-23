class Flavor{
    private String flavor;

    public Flavor(String flavor) {
        this.flavor = flavor; 
    }

    public void setFlavor(String flavor){
        this.flavor = flavor;
    }

    public String getFlavor(){
        return flavor;
    }

}


class IceCream {
    // Atribut
    private Flavor flavor;
    private int scoops;
    private boolean isCone;

    // Constructor pertama
    public IceCream(Flavor flavor, int scoops) {
        this.flavor = flavor;
        this.scoops = scoops;
        this.isCone = false;
    }

    // Constructor kedua
    public IceCream(Flavor flavor, int scoops, boolean isCone) {
        this.flavor = flavor;
        this.scoops = scoops;
        this.isCone = isCone;
    }

    // Behaviour 1: Menambahkan scoop es krim
    public void addScoop() {
        scoops++;
        if (isCone) {
            System.out.println("Menambahkan " + flavor.getFlavor() + " ice cream pada cone. Total scoops: " + scoops);
        } else {
            System.out.println("Menambahkan " + flavor.getFlavor() + " ice cream. Total scoops: " + scoops);
        }
    }

    // Behaviour 2: Menampilkan detail es krim
    public void displayDetails() {
    String coneStatus;
    if (isCone) {
        coneStatus = "pakai cone";
    } else {
        coneStatus = "tidak memakai cone";
    }
        System.out.println("Rasa: " + flavor.getFlavor() + ", Scoops: " + scoops + ", " + coneStatus);
    }

    // Setter untuk atribut flavor
    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    // Getter untuk atribut flavor
    public Flavor getFlavor() {
        return flavor;
    }

    
}

public class no_01 {
    public static void main(String[] args) {
        Flavor vanillaFlavor = new Flavor("vanilla");
        Flavor chocomintFlavor = new Flavor("chocomint");

        IceCream iceCream1 = new IceCream(vanillaFlavor, 2, false);
        iceCream1.addScoop();
        iceCream1.displayDetails();

        System.out.println();

        IceCream iceCream2 = new IceCream(chocomintFlavor, 3, true);
        iceCream2.addScoop();
        iceCream2.displayDetails();
    }
}
