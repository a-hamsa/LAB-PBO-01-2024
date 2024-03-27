package TP2;

class Person {
    String name;
    int age;
    boolean isMale;

    public Person(String name, int age, boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    
    public void setGender(boolean gender){
        this.isMale = gender;
    }

    public String getGender(){
        return isMale? "Laki-laki" : "Perempuan";
    }

    public static void main(String[] args) {
        Person person = new Person("Destin Kendenan", 19, false);

        System.out.println("Nama          : " + person.getName());
        System.out.println("Usia          : " + person.getAge());
        System.out.println("Jenis kelamin : " + person.getGender());
    }

}


