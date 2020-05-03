package com.kcs.students.app.controller;
import com.kcs.students.app.dto.Student;
import com.kcs.students.app.service.StudentsListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/studentsList")
public class StudentsListController {

    @Autowired
    private StudentsListService studentsListService;

    @GetMapping
    public List<Student> getStudentsList(){
        List<Student> students = studentsListService.getStudentsList();
        studentsListService.printStudentsList();
        return students;
    }

    @PostMapping("/addNew")
    public Student createStudent(@RequestBody Student student){
        return studentsListService.createStudent(student);
    }
}
