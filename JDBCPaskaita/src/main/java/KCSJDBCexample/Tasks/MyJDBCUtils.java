package KCSJDBCexample.Tasks;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyJDBCUtils {
    //grazina connectiona, jei nera klaidu, ji grazina

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/kcs";
    private static final String NAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL, NAME, PASSWORD);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

}
