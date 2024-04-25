package LC;
class Person{
   String name;
   int age;
   boolean isMale;
   
   void setName (String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setAge(int age){
        this.age = age;
    }

    int getAge(){
        return age;
    }

    void setGender(boolean isMale){
        this.isMale = isMale;
    }

    String getGender(){
        if(isMale == true){
            return "Laki-laki";
        } else {
            return "Perempuan";
        }
    }

}



public class TP2_LiveCoding01_H071231006 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Riri");
        person.setAge(18);
        person.setGender(false);

        System.out.println("Name :" + person.getName());
        System.out.println("Age :" + person.getAge());
        System.out.println("Gender :" + person.getGender());
    }
}
