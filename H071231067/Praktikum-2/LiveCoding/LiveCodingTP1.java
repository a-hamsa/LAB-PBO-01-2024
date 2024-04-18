class Orang{
    String name;
    int age;
    boolean isMale;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setGender(boolean isMale){
        this.isMale = isMale;
    }
    public String getGender(){
        return isMale ? "Male":"Female";
    }
}
public class LiveCodingTP1 {
    public static void main(String[]args){
        Orang Orang1 = new Orang();
        Orang1.setName("Jevon");
        Orang1.setAge(18);
        Orang1.setGender(true);

        System.out.println(Orang1.getName());
        System.out.println(Orang1.getAge());
        System.out.println(Orang1.getGender());
    }
}
