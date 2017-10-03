package main.web.dao;

import main.web.database.Database;


import java.sql.*;




public class UserDaoImpl extends Database implements UserDao {

    @Override
    public boolean checkLogin(String user_id, String password) {
        boolean result = false;
        String sql = "SELECT * FROM users WHERE user_id ='"+user_id+"' AND passwd='"+password+"'";

        try {

            Statement ps = connect.createStatement();

            ResultSet rs = ps.executeQuery(sql);
            rs.next();
                if(rs.getString("user_id")!=null) {
                    result = true;
                } else {
                    result = false;
                }

            connect.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
        return result;
    }




    }
