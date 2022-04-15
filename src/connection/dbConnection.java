/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * class used to enstablish and close the connection to the db
 * @author Natalia
 */
public class dbConnection {
    
    //associato alla classe e non all'istanza
    public static Connection enstablishConnection(){
        
        String url = "jdbc:postgresql://localhost:5432/Test";
        Properties props = new Properties();
        props.setProperty("user","postgres");
        props.setProperty("password","natalia.25"); 
            
        try {
            return DriverManager.getConnection(url, props);
        } catch (Exception e) {
            e.printStackTrace();
        }   
        
        return null;
        
    }
    
}
