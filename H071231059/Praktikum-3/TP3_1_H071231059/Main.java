public class Main {
    public static void main(String[] args) {
        VProject vproject1 = new VProject("Minato Aqua", "StartEnd", "SR");
        Manager manager2 = new Manager("M-san", 10);
        vproject1.manager = manager2; 

        VProject vproject2 = new VProject();
        vproject2.setTalent("Usada Pekora"); 
        vproject2.setGroup("Holo Fantasy");
        vproject2.setCardRarity("SR");

        System.out.println();
        manager2.getManagerInfo();
        vproject1.getProfile();
        vproject2.getProfile();

        printBarriers();
        vproject1.StartAudition(vproject2); 
        printBarriers();

        vproject1.PurchaseGems(75);
        System.out.println();
        vproject1.UpgradeCard();

        vproject1.getProfile();
        vproject2.getProfile();
        printBarriers();
        vproject1.StartAudition(vproject2);
        manager2.getManagerInfo();
    }

    public static void printBarriers() { 
        System.out.println("=====================================");
    }
}