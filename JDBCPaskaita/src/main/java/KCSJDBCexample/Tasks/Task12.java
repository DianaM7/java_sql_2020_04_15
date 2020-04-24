package KCSJDBCexample.Tasks;

import java.sql.*;

public class Task12 {

    public static void main(String[] args) {

        Connection connection = MyJDBCUtils.getConnection();
        if(connection == null){
            return;
        }

        if(QueryUtils.isTableExist(connection, "students")){
            System.out.println("Lentele egzistuoja");
        }else{
            System.out.println("Tokios lenteles nera");
        }

    }

}
