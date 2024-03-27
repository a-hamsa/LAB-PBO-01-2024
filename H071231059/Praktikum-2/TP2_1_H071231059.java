class Person {
    String name; 
    int age;
    boolean isMale;

    void setName(String name) { 
        this.name = name; 
    } 
    String getName() {
        return name; 
    }

    void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return age;
    }

    void setGender(boolean isMale){
        this.isMale = isMale;
    }    
    String getGender() { 
        return isMale ? "Male" : "Female"; 
    }
}

class TP2_1_H071231059 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Marine");
        person.setAge(17);
        person.setGender(false);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: "+ person.getAge());
        System.out.println("Gender: " + person.getGender());
    }  
}