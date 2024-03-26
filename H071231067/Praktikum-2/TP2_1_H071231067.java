class Person{
    String name;
    int age;
    boolean isMale;
    
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(boolean isMale){
        this.isMale = isMale;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return isMale? "Male" : "Female";
    }
}
public class TP2_1_H071231067 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Jevon");
        person1.setAge(18);
        person1.setGender(true);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());
    }
}