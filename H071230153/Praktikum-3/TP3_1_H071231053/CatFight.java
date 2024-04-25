package TP3_1_H071231053;

public class CatFight {
    private String name;
    private String warnaBulu;
    private int power;
    private double speed;
    private int HP;
    
    public CatFight(String name, String warnaBulu, int power, double speed, int HP) {
        this.name = name;
        this.warnaBulu = warnaBulu;
        this.power = power;
        this.speed = speed;
        this.HP = HP;
    }
    
    public CatFight(String name, String warnaBulu) {
        this.name = name;
        this.warnaBulu = warnaBulu;
        this.power = 10; 
        this.speed = 1.0; 
        this.HP = 100; 
    }
    
    public String getName() {
        return name;
    }
    
    public String getWarnaBulu() {
        return warnaBulu;
    }
    
    public int getPower() {
        return power;
    }

    public double getSpeed() {
        return speed;
    }
    
    public int getHP() {
        return HP;
    }
    
    public void setHP(int HP) {
        this.HP = HP;
    }
    
    public void meow() {
        System.out.println(name + " mengeong!");
    }
 
    public void attack(CatFight opponent) {
        System.out.println(name + " menyerang " + opponent.getName() + "!");
        opponent.receiveDamage(power);
    }
        
    private void receiveDamage(int damage) {
        HP -= damage;
        if (HP <= 0) {
            System.out.println(name + " tewas mengenaskan!");
        }
    }
    
    public void displayCatInfo() {
        System.out.println("Nama: " + getName());
        System.out.println("Warna bulu: " + getWarnaBulu());
        System.out.println("Power: " + getPower());
        System.out.println("Speed: " + getSpeed());
        System.out.println("HP: " + getHP());
    }

    public static void printBarriers() {
        System.out.println("================================");
    }
     
    public static void main(String[] args) {
        CatFight cat1 = new CatFight("ireng", "hitam", 15, 1.5, 120);
        CatFight cat2 = new CatFight("putih", "oren");

        printBarriers();
        cat1.displayCatInfo();
        cat1.meow();
        printBarriers();
        cat2.displayCatInfo();
        cat2.meow();
        printBarriers();

        cat1.attack(cat2);
        System.out.println(cat2.getName() + "'s HP: " + cat2.getHP());


        printBarriers();
        System.out.println("Status Si Putih abis diserang:");
        cat2.displayCatInfo();


    }
}