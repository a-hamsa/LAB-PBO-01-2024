import java.util.Scanner;

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

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }
    
    public String getGender() {
        return isMale ? "Male" : "Female";
    }
}

public class TP2_1_H071231051 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person orang = new Person();

        System.out.print("Nama               : ");
        String name = scan.nextLine();
        orang.setName(name);

        System.out.print("Umur               : ");
        int age = scan.nextInt();
        orang.setAge(age);

        while (true) {
            System.out.print("Jenis Kelamin(L/P) : ");
            char genderInput = scan.next().toUpperCase().charAt(0);

            if (genderInput == 'L') {
                orang.setGender(true);
                break;
            } else if (genderInput == 'P') {
                orang.setGender(false);
                break;
            } else {
                System.out.println("Inputan jenis kelamin tidak valid, silahkan masukkan L/P");
            }
        }
        
        System.out.println("\nName    : " + orang.getName());
        System.out.println("Age     : " + orang.getAge());
        System.out.println("Gender  : " + orang.getGender());

        scan.close();
    }
}
