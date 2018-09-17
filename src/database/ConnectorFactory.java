package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorFactory {
    
    public static final String URL = "jdbc:mysql://www.db4free.net:3306/tcptrabfinal";
    public static final String USER = "tcpufrgs";
    public static final String PASS = "tcpufrgs";
    
    public static Connection getConnection(){
        Connection c = null;
        try{
            c = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conectouuu");
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return c;
    }
}
