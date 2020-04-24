package KCSJDBCexample;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) throws SQLException {
        //1. step create connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kcs", "root", "");
        //2. step create statement
        Statement statement = connection.createStatement();
        //3. step execute statement
        ResultSet resultSet = statement.executeQuery("SELECT * from students");

        while(resultSet.next()){
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getString("surname"));
            System.out.println(resultSet.getString("phone"));
            System.out.println(resultSet.getString("email"));
        }

    }

}
