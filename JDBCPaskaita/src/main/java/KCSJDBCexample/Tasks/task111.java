package KCSJDBCexample.Tasks;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class task111 {
    public static void main(String[] args) {
        try {
            Connection connection = MyJDBCUtils.getConnection();
            if(connection == null){
                return;
            }
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * from students");
            while(resultSet.next()){
                System.out.print(resultSet.getInt("id") + " ");
                System.out.print(resultSet.getString("name") + " ");
                System.out.print(resultSet.getString("surname") + " ");
                System.out.print(resultSet.getString("phone") + " ");
                System.out.print(resultSet.getString("email") + " \n");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }



}
