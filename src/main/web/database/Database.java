package main.web.database;

import java.sql.*;
import java.sql.DriverManager;

import static java.lang.System.out;

public class Database {
    public Connection connect;
    // เชื่อมต่อฐานข้อมูล

    public Database() {
        try {
            Class.forName(DatabaseInfo.Driver);
            connect = DriverManager.getConnection(DatabaseInfo.URI,DatabaseInfo.USERNAME, DatabaseInfo.PASSWORD);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
    // ปิดการเชื่อมต่อฐานข้อมูล
    public void close() {
        try {
            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
