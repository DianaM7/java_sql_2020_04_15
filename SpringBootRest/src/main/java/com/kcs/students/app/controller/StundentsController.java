package com.kcs.students.app.controller;

import com.kcs.students.app.dto.Student;
import com.kcs.students.app.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /* todo
    1. sukurti controllerio metoda getsStudents, kuris grazins Student objekta pagal
    2. sukurti metodeli studentService getStudent(int id) turi grazinti studenta is db pagal duota id
    */
    @GetMapping("/{id}/student")
    public Student getStudent(@PathVariable("id") int id){
        return studentsService.getStudent(id);
    }

    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student){
        return studentsService.createStudent(student);
    }
    /*TODO
     * 1. sukurti metoda controlleryje void deleteStudent(@PathVariable("id") int id).naudoti @DeleteMapping
     * ("/{id}/student/delete)
     * 2. sukurti metoda student service void deleteStudent(int id)
     * istrinti studenta
     */
    @DeleteMapping("/{id}/student/delete")
    public void deleteStudent(@PathVariable("id") int id){
        studentsService.deleteStudent(id);
    }

    /*
    *Todo
    * 1. sukurti metoda updateStudent(@RequestBody Student student) naudoti @PutMapping("/{id}/student/update)
    * 2. sukurti metoda studentService.updateStudent(Student student) turi grazinti atnaujinta studenta
    * */
    @PutMapping("/{id}/student/update")
    public Student updateStudent(@PathVariable("id") int id, @RequestBody Student student){
        student.setId(id);
        return  studentsService.updateStudent(student);
    }









}
