public class VProject {
    String talent, group, cardrarity;
    Manager manager = new Manager(); 

    public VProject(){ 
    }

    public VProject(String talent, String group, String cardrarity) {
        this.talent = talent;
        this.group = group;
        this.cardrarity = cardrarity;
    }

    public void getProfile() {
        System.out.println("=========== Talent Profile ==========");
        System.out.println("Talent's Name : " + getTalent());
        System.out.println("Group         : " + getGroup());
        System.out.println("Card Rarity   : " + getCardRarity());
    }

    public void PurchaseGems(int money) { 
        if (money >= 300) {
            manager.setGems(manager.getGems() + 30);
            money -= 300;
            System.out.printf("Purchase successful. You have %d gems and $%d left", manager.getGems(), money);
        } else if (money >= 200 && money < 300) {
            manager.setGems(manager.getGems() + 20);
            money -= 200;
            System.out.printf("Purchase successful. You have %d gems and $%d left", manager.getGems(), money);
        } else if (money >= 100 && money < 200) {
            manager.setGems(manager.getGems() + 10);
            money -= 100;
            System.out.printf("Purchase successful. You have %d gems and $%d left", manager.getGems(), money);
        } else if (money >= 50 && money < 100) {
            manager.setGems(manager.getGems() + 5);
            money -= 50;
            System.out.printf("Purchase successful. You have %d gems and $%d left", manager.getGems(), money);
        } else {
            System.out.println("Sorry! You don't have enough money to purchase gems.");
        }
    }

    public void UpgradeCard() {
        if (getCardRarity().equals("N") && manager.getGems() >= 5) {
            setCardRarity("R"); 
            manager.setGems(manager.getGems() - 5);
            System.out.printf("Upgrade successful. %s current card rarity is %s. You have %d gems left\n", getTalent(), getCardRarity(), manager.getGems());
        } else if (getCardRarity().equals("R") && manager.getGems() >= 10) {
            setCardRarity("SR");
            manager.setGems(manager.getGems() - 10);
            System.out.printf("Upgrade successful. %s current card rarity is %s. You have %d gems left\n", getTalent(), getCardRarity(), manager.getGems());
        } else if (getCardRarity().equals("SR") && manager.getGems() >= 15) {
            setCardRarity("SSR");
            manager.setGems(manager.getGems() - 15);
            System.out.printf("Upgrade successful. %s current card rarity is %s. You have %d gems left\n", getTalent(), getCardRarity(), manager.getGems());
        } else if (getCardRarity().equals("SSR")) {
            System.out.printf("%s current card rarity is SSR. Cannot upgrade because the current card rarity is the highest\n", getTalent());
        }else {
            System.out.println("You don't have enough gems, please purchase gems.");
        }
    }

    public void StartAudition(VProject rival) { 
        String talentRarity = this.getCardRarity();
        String rivalRarity = rival.getCardRarity();
    
        if (talentRarity.equals(rivalRarity)) {
            System.out.println("Your talent's score is draw, we need to do a reaudition.\n");
        } else if (talentRarity.equals("SSR") || (talentRarity.equals("SR") && !rivalRarity.equals("SSR")) || (talentRarity.equals("R") && rivalRarity.equals("N"))) {
            System.out.println("Congratulation! Your talent passes the audition.\n");
            manager.setGems(manager.getGems() + 15);
        } else {
            System.out.println("Your talent didn't pass the audition.\n");
            manager.setGems(manager.getGems() - 10);
        }
    }    

    public String getTalent() {
        return talent;
    }
    public void setTalent(String talent) {
        this.talent = talent;
    }

    public String getCardRarity() {
        return cardrarity;
    }
    public void setCardRarity(String cardrarity) {
        this.cardrarity = cardrarity;
    }

    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
}