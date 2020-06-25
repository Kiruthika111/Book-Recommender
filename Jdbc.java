/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Kiruthika
 */
public class Jdbc {

    
    //public static void main(String[] args) {
        public static Connection ConnecrDb(){
            try{
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","java","pass");
                return con;
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            return null;
        }

    
    
}
