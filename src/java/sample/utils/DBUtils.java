/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 84348
 */
public class DBUtils {
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection con =null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName = demo9";
        con =DriverManager.getConnection(url, "sa", "123");
        return con;
        
    }
    
}