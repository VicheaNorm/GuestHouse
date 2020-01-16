 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geust_house.guesthouse;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SIENGHORN
 */
public class DataConnection {
    public static Connection datacon;
    public Connection getConnectio() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        datacon=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/guest_house?useUnicode=true&characterEncoding=utf-8","root","");
        
        return datacon;
    }
    
    
      
      
        
}
