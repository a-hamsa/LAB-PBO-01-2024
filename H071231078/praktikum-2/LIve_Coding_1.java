package TP_2;

public class LIve_Coding_1 {
    public static void main(String[] args) {
        Person Person_1 = new Person();
        Person_1.setName("muhammad raihan");
        Person_1.setAge(19);
        Person_1.setGender(true);

        System.out.println(Person_1.getName());
        System.out.println(Person_1.getAge());
        System.out.println(Person_1.getGender());
    }
}


class Person {
    String name;
    int age;
    boolean isMale;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //isMale set and get
    public boolean getGender() {
        return isMale;
    }
    public void setGender(boolean gender) {
        this.isMale = gender;
    }

    
    
}