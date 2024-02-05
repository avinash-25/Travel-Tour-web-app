/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

//import java.sql.*;  
//
//public class Conn{
//    Connection c;
//    Statement s;
//    public Conn(){  
//        try{  
//            Class.forName("com.mysql.jdbc.Driver");  
//            c =DriverManager.getConnection("jdbc:mysql:///travelApp","root","admin"); 
//            
//            s =c.createStatement();  
//            
//           s
//        }catch(Exception e){ 
//            System.out.println(e);
//        }  
//    }  
//}  
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///travelapp", "root", "admin");
            s = c.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
