package login_app.models;

public class User {
    //1
    private String username;
    private String password;

    public User(String username ,String password){
        this.username = username;
        this.password = password;
    }

    public String getUserName(){
        return username;
    }
    public String getPassword(){
        return password;
    }
}
