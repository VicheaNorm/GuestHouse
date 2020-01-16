
import databaseofproduct.DataConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SIENGHORN
 */
public class Test {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     */
   public static void main(String[] args) throws ClassNotFoundException, InstantiationException {
       try {
           DataConnection data=new DataConnection();
           Statement stm=data.getConnectio().createStatement();
           ResultSet res;
           res=stm.executeQuery("select * from User;");
           while(res.next()){
               System.out.println(res.getInt(1)+""+res.getInt(2)+""+res.getString(3)+""+res.getString(4)+""+res.getInt(5));
           }
           res.close();
           data.getConnectio().close();
           /*PreparedStatement pst=null;
           String sql="insert into role(role_id,Role) values(2,'user'); ";
           pst=data.getConnectio().prepareStatement(sql);
           pst.execute();
            pst.close();*/
           data.getConnectio().close();
           res=stm.executeQuery("select * from role;");
           while(res.next()){
               System.out.println(res.getInt(1)+" "+res.getString(2));
           }
           res.close();
           data.getConnectio().close();
          
           
       } catch (SQLException ex) {
           Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
       }
        
       
    }
    
}
