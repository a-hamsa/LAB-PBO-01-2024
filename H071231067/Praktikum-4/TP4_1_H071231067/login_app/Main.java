package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

import java.util.InputMismatchException;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        loopLogin:
        while (true) {
            try {
                System.out.println("-------------------------");
                System.out.println("Aplikasi Login Sederhana");
                System.out.println("-------------------------");
                System.out.println("1. Login");
                System.out.println("2. Register");
                System.out.println("3. Keluar");
                System.out.print("> ");

                // Menginput pilihan menu
                int selectMenu = sc.nextInt();
                sc.nextLine();
                switch (selectMenu) {
                    case 1:
                        showLoginMenu();
                        break;
                    case 2:
                        showRegisterMenu();
                    case 3:
                        break loopLogin;
                    default:
                        System.out.println("Tolong Pilih angka 1,2 atau 3");
                }
            }catch (InputMismatchException i) {
                System.out.println("Tolong Pilih angka 1,2 atau 3");
                sc.nextLine();
            }
        }
    }
    

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.print("> ");


            String username = sc.nextLine();
            // Membuat variabel userIndex yang mana nanti akan menampung index dari user
            int userIndex = -1;
            for (int i = 0; i < listUser.size(); i++) {
                //1
                if(listUser.get(i).getUserName().equals(username)) {
                    userIndex = i;
                    break;
                }
            }
            if (userIndex != -1) {
                System.out.println("Password");
                System.out.print("> ");
                String password = sc.next();
                //2
                boolean isPasswordMatch = false;
                for(User user : listUser){
                    if(user.getUserName().equals(username)){
                        if(user.getPassword().equals(password)){
                            isPasswordMatch = true;
                            break;
                        }
                    }
                }
                if (isPasswordMatch == true) {
                    System.out.println("Berhasil Login");
                    //3
                    showDetailUser(userIndex);
                    // System.exit(0);
                } else {
                    // saat password salah akan menampikan password salah
                    System.out.println("Password Salah");
                }
            }else{
                System.out.println("Usename Tidak ditemukan");
            }
        }
    

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        // Menginput username dan password
        String username = "null";
        while(true){
            boolean userNameTerpakai = false;
            System.out.println("Username");
            System.out.print("> ");
            username = sc.nextLine();
            for(User user : listUser){
                if(username.equals(user.getUserName())){
                    System.out.println("Maaf Username sudah digunakan");
                    userNameTerpakai = true;
                    break;
                }
            }
            if(!userNameTerpakai){
                break;
            }
        }

        String password;
        while(true){
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            if(password.length() < 8 || password.contains(" ")){
                System.out.println("Password tidak boleh kurang dari 8 karakter dan tidak boleh memiliki spasi");
            }else{
                break;
            }
        }
        //4
        User user = new User(username, password);

        //5
        Profile profile = new Profile();

        // Menginput Data Profile
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();

        int age;
        while(true){
            try {
                System.out.println("Umur");
                System.out.print("> ");
                age = sc.nextInt();
                sc.nextLine();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Tolong Masukkan Umur Yang Benar(Int)");
                sc.nextLine();
            }
        }

        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();
        //6
        profile.setNamaLengkap(fullName);
        profile.setUmur(age);
        profile.setHobby(hobby);

        //7
        profile.setNickName(StringUtils.Nick(fullName));

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(int index) {
        //8
        System.out.println("--------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("--------------------------");
        System.out.println("Nama Lengkap     : " + listUserProfile.get(index).getNamaLengkap());
        System.out.println("Nama Panggilan   : " + listUserProfile.get(index).getNickName());
        System.out.println("Umur             : " + listUserProfile.get(index).getUmur());
        System.out.println("Hobby            : " + listUserProfile.get(index).getHobby());
    }
}
