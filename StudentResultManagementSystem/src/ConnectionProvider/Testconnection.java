/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Rhythin
 */
public class Testconnection {
    
    public static boolean test(String server, String port, String user, String password){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            String url="jdbc:mysql://"+server+":"+port+"/"+connectionDetails.getDatabase();
            Connection con=DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
        return true;
    }
    
}
