/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author asus
 */
public class mainClass {
     public static Connection sambungkeDB () {
        try {
            MysqlDataSource resource = new MysqlDataSource();
            resource.setUser("root");
            resource.setPassword("");
            resource.setDatabaseName("sembako");
            resource.setPortNumber(3306);
            resource.setServerName("localhost");
            resource.setServerTimezone("Asia/Jakarta");
            Connection con = resource.getConnection();
            return con;
        } catch (SQLException e) {
            System.err.println( e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        
    }
}
