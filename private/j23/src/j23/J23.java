/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author erickhajik
 */
public class J23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = null;

            conn = DriverManager.getConnection("jdbc:mysql://database-2.cloobyfzab6r.us-east-2.rds.amazonaws.com:3306/test", "root", "password");
            System.out.print("Database is connected !");
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from User");
            while(rs.next())
            {
//                Show.setText();
                
                    System.out.println(rs.getInt(1));  
               
                    
            }
            
//             Show.setText(a[m].toString());
//                     jTextField1.setText(String.valueOf(a[0]));

            conn.close();
           
        } catch (Exception e) {
            System.out.print("Do not connect to DB - Error:" + e);

        }
                 // TODO code application logic here
    }
    
}
