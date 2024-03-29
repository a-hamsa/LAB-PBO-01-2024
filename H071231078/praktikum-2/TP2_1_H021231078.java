package TP_2;

public class TP2_1_H021231078 {
    public static void main(String[] args) {
        Person man = new Person();
        man.setName("Raihan");
        man.setAge(19);
        man.setGender(true);
        
        System.out.println("Name   : "+man.getName());
        System.out.println("Age    : "+man.getAge());
        System.out.println("isMale : "+man.getGender());
    }
     

}

class Person{
    //atribut
    String name;
    int age;
    boolean isMale;

    //setter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(boolean gender){
        this.isMale = gender;
    }

    //getter
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean getGender(){
        return isMale;
    }


    
} 

