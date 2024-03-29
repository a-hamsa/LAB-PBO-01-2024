class Person{
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
        Person person1 = new Person();
        person1.setName("Jevon");
        person1.setAge(18);
        person1.setGender(true);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());
    }
}
