package main.web.dao;

public interface UserDao {
    // ตรวสสอบชื่อผู้ใช้และรหัสผ่าน
    public boolean checkLogin(String user_id, String password);
    
}
