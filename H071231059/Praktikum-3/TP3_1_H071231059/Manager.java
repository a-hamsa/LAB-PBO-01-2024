public class Manager {
    String name;
    int gems;

    public Manager(){
    }

    public Manager(String name, int gems) {
        this.name = name;
        this.gems = gems;
    }

    public void getManagerInfo() {
        System.out.println("==========  Manager Info ==========");
        System.out.println("Name : " + getManager());
        System.out.println("Gems : " + getGems());
    }

    public String getManager() {
        return name;
    }
    public void setManager(String name) {
        this.name = name;
    }

    public int getGems() {
        return gems;
    }
    public void setGems(int gems) {
        this.gems = gems;
    }
}
