public class TP3_1_H071231078 {
    public static void main(String[] args) {
        WeaponType weapon_1 = new WeaponType("force");
        WeaponType weapon_2 = new WeaponType("blaster");
        StarWars character_1 = new StarWars("sam", "dark", 2000, "sith", weapon_1);
        StarWars character_2 = new StarWars("jimmy", "light", 40000, "Trooper", weapon_2);

        character_1.checkStatus();
        character_1.learnForce();
        character_2.checkStatus();

        character_1.attack(character_2);

        character_1.checkStatus();
        character_2.checkStatus();
    }
}


class StarWars {
    String name,side;
    int hp;
    String type;
    WeaponType weapon;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    StarWars(String name,String Side,int hp, String Type, WeaponType weapon){
        this.name = name;
        this.side = Side;
        this.hp = hp;
        this.type = Type;
        this.weapon = weapon;
    }

    StarWars(String type){
        this.type = type;
    }

    void checkStatus(){
        System.out.println("-------character status-------");
        System.out.println("Name   : " + name);
        System.out.println("Side   : " + side);
        System.out.println("HP     : " + hp);
        System.out.println("Type   : " + type);
        System.out.println("Weapon : " + weapon.name);
        System.out.println("Power  : " + weapon.power);
    }

    void attack(StarWars character){
        System.out.println("=============================================");
        System.out.println("battle begin between " + this.name+ " and " + character.name);
        int my_power = this.weapon.power;
        int enemy_power = character.weapon.power;
        if (my_power > enemy_power) {
            character.hp -= my_power;
            System.out.println(this.name+" "+this.weapon.name + " win over " + character.name+" "+character.weapon.name);
            System.out.println("dealt " + my_power + " damage to " + character.name );
        } else if(enemy_power > my_power) {
            hp -= enemy_power;
            System.out.println(character.name+" "+character.weapon.name + " win over " + this.name+" "+this.weapon.name);
            System.out.println("dealt " + enemy_power + " damage to " + this.name);
        } else {
            System.out.println("the fight between " + this.weapon.name + " and " + character.weapon.name + " ends in a tie");
        }
        System.out.println("=============================================");
    }

    void learnForce() {
        if (type.equals("sith") || type.equals("jedi")) {
            System.out.println("==================================");
            System.out.println("your force strength increased......");
            weapon.power += 100;
            System.out.println("==================================");
        } else {
            if (hp > 100) {
                System.out.println("==================================================");
                System.out.println("force has been learned, you are now the chosen one");
                hp -= 100;
                if (side.equals("dark")) {
                    setType("sith");
                    weapon = new WeaponType("force");
                    System.out.println("type change to " + getType());
                } else if (side.equals("light")) {
                    setType("jedi");
                    weapon = new WeaponType("force");
                    System.out.println("type change to " + getType());
                    System.out.println("may the force be with you");
                }
                System.out.println("==================================================");
            } else {
                System.out.println("==================================================");
                System.out.println("you can't learn force, comeback several years later");
                System.out.println("==================================================");
            }
        }
    }
    


    
}

class WeaponType {
    String name;
    int power;

    WeaponType(String weapon) {
        this.name = weapon;
        if (weapon.equals("lightsaber")) {
            this.power = 100;
        } else if (weapon.equals("blaster")) {
            this.power = 120;
        } else if (weapon.equals("force")) {
            this.power = 200;
        } else {
            this.power = 5;
        }
    }
}
