class Nutrition{
    double kalori;
    double air;
    double protein;
    double karbohidrat;
    double gula;
    double serat;
    double lemak;

    public Nutrition(){}

    // public void setNutrition(String kalori, String air, String protein, String karbohidrat, String gula, String serat, String lemak){
    //     this.kalori = kalori;
    //     this.air = air;
    //     this.protein = protein;
    //     this.karbohidrat = karbohidrat;
    //     this.gula = gula;
    //     this.serat = serat;
    //     this.lemak = lemak;
    // }

    public void displayInfoNutrition(){
        System.out.println("Nutrisi: ");
        System.out.println(" - Kalori      : " + kalori + " gram");
        System.out.println(" - Air         : " + air + " gram");
        System.out.println(" - Protein     : " + protein + " gram");
        System.out.println(" - Karbohidrat : " + karbohidrat + " gram");
        System.out.println(" - Gula        : " + gula + " gram");
        System.out.println(" - Serat       : " + serat + " gram");
        System.out.println(" - Lemak       : " + lemak + " gram");
    }

}

class Fruit{
    String name;
    int amount;
    double price;
    Nutrition nutrisi;

    public Fruit(String name, int amount, double price, Nutrition nutrisi){
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.nutrisi = nutrisi;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getAmount(){
        return amount;
    }

    public double getPrice(){
        return amount * price;
    }

    public void displayInfo(){
        System.out.println("Nama buah : " + name);
        System.out.println("Jumlah    : " + amount + " buah");
        System.out.println("Harga     : Rp." + getPrice());
        
    }
}

class Buah{
    public static void main(String[] args) {

        Nutrition nutrisi = new Nutrition();
        nutrisi.kalori = 94.6;
        nutrisi.air = 156;
        nutrisi.protein = 0.43;
        nutrisi.karbohidrat = 25.1;
        nutrisi.gula = 18.9;
        nutrisi.serat = 4.37;
        nutrisi.lemak = 0.3;


        Fruit fruit = new Fruit("Apel", 5, 5000, nutrisi);

        System.out.println();
        fruit.displayInfo();
        nutrisi.displayInfoNutrition();
        System.out.println();
    }
}
