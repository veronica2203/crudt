
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3308/registro","root","");
        } catch (Exception e) {
            System.err.println("Error:"+e);
        }        
    }
    public Connection getConnection(){
        return con;
    }
  }
