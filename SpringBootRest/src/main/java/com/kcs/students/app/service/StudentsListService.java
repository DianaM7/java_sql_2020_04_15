package com.kcs.students.app.service;
import com.kcs.students.app.dto.Student;
import com.kcs.students.app.repository.StudentsListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentsListService {

    @Autowired
    private StudentsListRepository studentsListRepository;

    public List<Student> getStudentsList() {
        List<Student> students = new ArrayList<>();

        PreparedStatement preparedStatement = studentsListRepository.getPreparedStatement("SELECT * from students");
        if (preparedStatement != null) {
            try {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    students.add(new Student(resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("surname"),
                            resultSet.getString("email"),
                            resultSet.getString("phone")));
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return students;
    }

    public Student createStudent(Student student) {
        PreparedStatement preparedStatement = studentsListRepository.getPreparedStatement("insert into students(name,surname,phone,email) values(?,?,?,?)");

        if (preparedStatement == null) {
            return null;
        }
        try {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setString(3, student.getPhone());
            preparedStatement.setString(4, student.getEmail());

            preparedStatement.execute();

            return getStudentsList().stream()
                    .filter(s -> s.equals(student))
                    .findFirst()
                    .orElse(null);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void addMissingStudents() {
        List<Student> students = getStudentsList();
        if (students.size() == 0) {
            createStudent(new Student(11, "Vardenis", "Pavardenis", "email@asd.com", "222222"));
        }
    }

    public void printStudentsList() {
        addMissingStudents();
        List<Student> students = getStudentsList();
        System.out.println("Duomenu bazeje yra tokie studentai:");
        for (Student student : students) {
            System.out.println(student.getId() + " " + student.getName() + " " + student.getSurname() + " " + student.getEmail() + " " + " " + student.getPhone());
        }
    }
}
