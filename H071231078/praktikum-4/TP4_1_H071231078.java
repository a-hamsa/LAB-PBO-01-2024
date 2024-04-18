import java.util.ArrayList;
import java.util.Scanner;
import models.Profile;
import models.User;
import utils.StringUtils;

public class TP4_1_H071231078 {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }


    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        int selectMenu = sc.nextInt();
        sc.nextLine();
        StringUtils.notEmpty(selectMenu);
        switch (selectMenu) {
            case 1:
                // Membuka Halaman Login
                if (listUser.isEmpty()) {
                    System.out.println("belum ada user....!!!");
                    showRegisterMenu();
                }
                showLoginMenu();
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
            default:
                // Mengulang Pemanggilan Menu Utama
                runApp();
        }
    }


    
    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");
        String username = sc.nextLine();
        StringUtils.usernameTest(username);//mengecek username



        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        //perulangan untuk mencari username pada listuser
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (username.equals(listUser.get(i).getUsername())) {
                userIndex = i;
                break; // Menghentikan perulangan jika user ditemukan
            }
        }

        // Setelah loop selesai, cek apakah userIndex telah ditemukan atau masih -1
        if (userIndex == -1) {
            System.out.println("User dengan nama " + username + " tidak ditemukan....");
            showLoginMenu();
        }




        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.nextLine();
            while (password.isEmpty() || password.length() < 8) {
                if (password.isEmpty()) {
                    System.out.println("Error: password tidak boleh kosong");
                } else {
                   System.out.println("Error: password harus memiliki minimal 8 karakter");
                }
                System.out.println("Masukkan password");
                System.out.print("> ");
                password = sc.nextLine();
            }



            /*
             * TODO : Done
             * Mengecek apakah password dari User yang login berdasarkan username
             * sama dengan password yang diinput sebelumnya, kemudian simpan
             * hasilnya di variabel isPasswordMatch
             */
            boolean isPasswordMatch = password.equals(listUser.get(userIndex).getPassword());



            // Jika passwordnya sama maka berhasil login
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                /*
                 * TODO : Done
                 * panggil method showDetailUser dan kirimkan data Profile User yang login
                 * 
                 */
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                // saat password salah akan menampikan password salah
                System.out.println("Password Salah");
            }
        }
    }



    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");
        // Menginput username dan password
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        StringUtils.usernameTest(username);//mengecek username

        //perulangan untuk mengecek apakah username sudah ada
        int i = 0;
        while (i < listUser.size()) {
            User user = listUser.get(i);
            if (user.getUsername().equals(username)) {
                System.out.println("username sudah ada....silahkan input ulang");
                System.out.print("> ");
                username = sc.nextLine();
                i = 0; 
            } else {
                i++;
            }
        }


        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
        StringUtils.passwordTest(password);//mengecek password



        /*
         * TODO : Done
         * Buatlah atau Instance objek User baru, dan tambahkan
         * username dan password yang diinput sebelumnya secara langsung
         * saat instance User
         */
        User user = new User(username, password);



        /*
         * TODO : Done
         * Buatlah atau Instance objek Profile baru
         */
        Profile profile = new Profile();



        // Menginput Data Profile
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        StringUtils.notEmpty(fullName);
        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();
        StringUtils.notEmpty(age);
        sc.nextLine();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();
        StringUtils.notEmpty(hobby);



        /*
         * TODO : Done
         * Berikan nilai fullName, age, dan hobby ke objek profile yang telah
         * di Instance sebelumnya. Nilai ini diperoleh dari data profile yang
         * diinput sebelumnya
         */
        profile.setNamaLengkap(fullName);
        profile.setUmur(age);
        profile.setHobi(hobby);


        /*
         * TODO : Done
         * Berikan nilai nickName ke objek profile,
         * Nilai ini diperoleh menggunakan static method yang dibuat di class
         * StringUtils, dengan mengirimkan fullName yang diinput sebelumnya
         */

        profile.setNamaPanggilan(StringUtils.namaPanggilan(fullName));



        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);


        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("-------------------------");
        System.out.println("SELAMAT DATANG  !!");
        System.out.println("-------------------------");
        System.out.println("Nama Lengkap     : " + profile.getNamaLengkap());
        System.out.println("Nama Panggilan   : " + profile.getNamaPanggilan());
        System.out.println("Nama Lengkap     : " + profile.getUmur());
        System.out.println("Nama Lengkap     : " + profile.getHobi());
    }
}