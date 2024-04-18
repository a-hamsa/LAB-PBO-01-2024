package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile; 
import login_app.models.User;
import login_app.Utils.StringUtils; 

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>(); 
    private static ArrayList<Profile> listUserProfile = new ArrayList<>(); 
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) { 
        runApp();
    }

    private static void runApp() {
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("> ");

        int selectMenu = sc.nextInt();
        sc.nextLine(); 
        switch (selectMenu) {
            case 1:
                showLoginMenu();
                break;
            case 2:
                showRegisterMenu();
                break;
            default:
            runApp();
        }
    }

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.println("> ");

        String username = sc.next();

        int userindex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            // TODO 
            if (username.equals(listUser.get(i).getUsername())){ 
                userindex = i;
                break;
            } 
        } 
        
        if(userindex != -1) {
            System.out.println("Password");
            System.out.println("> ");
            String password = sc.next();
            
            // TODO
            boolean isPasswordMatch = password.equals(listUser.get(userindex).getPassword()); 

            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfile.get(userindex)); 
                System.exit(0); 
            } else {
                System.out.println("Password Salah. Silahkan coba lagi");
                showLoginMenu(); 
            }
        } else {
            System.out.println("Username salah. Silahkan coba lagi.");
            System.out.println("1. Isi username");
            System.out.println("2. Cancel");
            System.out.println("> ");

            int selectmenu2 = sc.nextInt();
            sc.nextLine();

            switch (selectmenu2) {
                case 1:
                    showLoginMenu();
                    break;
                case 2:
                    runApp();
                    break;
                default:
                    showLoginMenu();
            }
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        //TODO 
        User user = new User();
        user.setUsername(inputUsername());
        user.setPassword(inputPassword());

        //TODO 
         Profile profile = new Profile();

         //TODO 
         profile.setFullname(inputFullname());
         profile.setAge(inputAge());
         profile.setHobby(inputHobby());

         //TODO 
         String nickname = StringUtils.userNickname(profile); 
         profile.setNickname(nickname);

         listUser.add(user);
         listUserProfile.add(profile);
         System.out.println("-------------------------");
         System.out.println("Berhasil Membuat User Baru!");
         runApp();
    }

    private static void showDetailUser(Profile profil) { 
        //TODO
        System.out.println("-------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("-------------------------");
        System.out.println("Nama Lengkap   : " + profil.getFullname());
        System.out.println("Nama Panggilan : " + profil.getNickname());
        System.out.println("Umur           : " + profil.getAge());
        System.out.println("Hobby          : " + profil.getHobby());
    }

    private static String inputUsername() {
        System.out.println("Username");
        System.out.println("> ");
        String username = sc.nextLine();
    
        boolean ada = false;
        for (int i = 0; i < listUser.size(); i++) {
            if (username.equals(listUser.get(i).getUsername())){
                ada = true;
                break;
            }
        }
    
        if (ada) {
            System.out.println("Username sudah digunakan. Silahkan coba lagi.");
            return inputUsername();
        } else if (username.isEmpty()) { 
            System.out.println("Username kosong. Silahkan coba lagi");
            return inputUsername();
        } else {
            return username;
        }
    }

    private static String inputPassword() {
        System.out.println("Password");
        System.out.println("> ");
        String password = sc.nextLine();

        if (password.length() >= 8) {
            return password;
        } else {
            System.out.println("Panjang karakter harus melebihi 8. Silahkan coba lagi");
            return inputPassword();
        }
    }

    private static String inputFullname() {
        System.out.println("Nama Lengkap");
        System.out.println("> ");
        String input = sc.nextLine().toLowerCase();

        if (input.isEmpty()) {
            System.out.println("Nama lengkap masih kosong. Silahkan coba lagi.");
            return inputFullname();
        } else {
            String[] pisah = input.split("\\s+");
            String fullname = "";

            for (int i = 0; i < pisah.length; i++) {
                String huruf = pisah[i].substring(0,1).toUpperCase();
                fullname += huruf + pisah[i].substring(1) + " ";
            }
            return fullname;
        }
    }

    private static int inputAge() {
        try {
            System.out.println("Umur");
            System.out.println("> ");
            int age = sc.nextInt();
            sc.nextLine(); 
            return age;
        } catch (Exception e) {
            System.out.println("Inputan harus bersifat angka. Silahkan coba lagi.");
            sc.nextLine();
            return inputAge();
        }
    }

    private static String inputHobby() {
        System.out.println("Hobby");
        System.out.println("> ");
        String hobby = sc.nextLine();

        if (hobby.isEmpty()) {
            System.out.println("Hobby masih kosong. Silahkan coba lagi.");
            return inputHobby();
        } else {
            return hobby;
        }
    }
}