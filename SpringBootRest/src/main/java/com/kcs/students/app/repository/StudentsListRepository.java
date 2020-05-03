package com.kcs.students.app.repository;
import org.springframework.stereotype.Repository;
import java.sql.*;

@Repository
public class StudentsListRepository {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/kcs";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public PreparedStatement getPreparedStatement(String sql) {
        try {
            Connection connection = getConnection();
            return connection.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
