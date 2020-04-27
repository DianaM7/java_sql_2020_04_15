package com.kcs.students.app.controller;

import com.kcs.students.app.dto.Student;
import com.kcs.students.app.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StundentsController {

    @Autowired
    private StudentsService studentsService;

    @GetMapping
    public List<Student> getStudents(){
        return studentsService.getStudents();
    }
}
