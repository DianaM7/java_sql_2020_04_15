package KCSJDBCexample.Tasks;

import java.sql.*;

public class Task112 {
    public static void main(String[] args) {
        Connection connection = MyJDBCUtils.getConnection();
        if(connection == null){
            return;
        }

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE students SET name=?, surname=?, email=?, phone=? where id=?");
            preparedStatement.setString(1, "newName");
            preparedStatement.setString(2, "newSurname");
            preparedStatement.setString(3, "newEmail@kcs.com");
            preparedStatement.setString(4, "+3745363674");
            preparedStatement.setInt(5, 1);

            preparedStatement.execute();

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }





    }


}
