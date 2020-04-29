package com.kcs.students.app.controller;

import com.kcs.students.app.dto.Student;
import com.kcs.students.app.dto.StudentAddress;
import com.kcs.students.app.service.StudentAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students/addresses")
public class StudentAddressController {
    @Autowired
    private StudentAddressService studentAddressService;

    @GetMapping
    public List<StudentAddress> getStudentAddress(){
        return studentAddressService.getStudentAddress();
    }
    /*
    * TODO
    *  1. sukurti metoda kuris grazintu 1 studento addressus. @GetMApping("/{id}/student)
    *  2. servise sukurti metoda getStudentAddresses(int studentId)
    * */

    @GetMapping("/{studentId}/student")
    public List<StudentAddress> getStudentAddresses(@PathVariable("studentId") int studentId){
        return studentAddressService.getStudentAddresses(studentId);
    }

    /*
    * TODO
    *  1. sukurti metoda kuris sukurtu nauja studento adresa ir garzint visus studento adresus.@PosttMapping("/{id}/student/save)
    *  2. student adresss service sukurti metoda createStudentAddress (StudentAddress)
    * */

    @PostMapping("/{studentId}/student/save")
    public List<StudentAddress> createStudentAddress(@RequestBody StudentAddress studentAddress, @PathVariable("studentId") int studentId){
        studentAddress.setStudentId(studentId);
        return studentAddressService.createStudentAddress(studentAddress);
    }
    /*
     * TODO
     *  1. sukurti metoda kuris istrintu studento adresa @DeleteMapping("/{studentId}/student/{addressId}/delete)
     *  2. student adresss service sukurti metoda deleteStudentAddress (int studentId, int addressId)
     * */

    @DeleteMapping("/{studentId}/student/{addressId}/delete")
    public void deleteStudentAddress(@PathVariable("studentId") int studentId, @PathVariable("addressId") int addressId){
        studentAddressService.deleteStudentAddress(studentId, addressId);
    }


}
