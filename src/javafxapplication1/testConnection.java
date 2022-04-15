/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Natalia
 */
public class testConnection {

    public void testConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/Test";
        Properties props = new Properties();
        props.setProperty("user","postgres");
        props.setProperty("password","natalia.25");
        Connection conn = DriverManager.getConnection(url, props);
        System.out.println("Test di connessione avvenuto con successo");
        conn.close();
    }
    
}
