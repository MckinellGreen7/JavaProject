/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollegeManagementSystem;


import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class databaseconnection 
{
    //C:\Program Files (x86)\MySQL\Connector J 8.0
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:8080/phpmyadmin/index.php?route=/sql&pos=0&db=student&table=student";
    

    final static String USER = "root";
    final static String PASS = "";
    
    public static Connection connection()
    {
        try
        {
            Connection conn;
            Class.forName(JDBC_DRIVER);
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/student?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            return conn;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
