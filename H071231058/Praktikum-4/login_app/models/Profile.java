package login_app.models;

public class Profile {
    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
    String fullname, hobby, nickname;
    int age;

    public Profile(){}

    public void setFullname(String fullname){
        this.fullname = fullname;
    }

    public String getFullname(){
        return fullname;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setHobby(String hobby){
        this.hobby = hobby;
    }

    public String getHobby(){
        return hobby;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String gwtNickname(){
        return nickname;
    }
}
