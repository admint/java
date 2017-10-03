package main.web.entity;

public class User {

    private String user_id;
    private String password;

    public User() {
    }

    public User(String user_id, String password) {
        this.user_id = user_id;
        this.password = password;
    }

    public String getUsername() {
        return user_id;
    }

    public void setUsername(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "user_id=" + user_id + ", password=" + password + '}';
    }
    
}
