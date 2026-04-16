package com.SpringBootcrud.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootcrud.StudentModel.Student;
import com.SpringBootcrud.StudentService.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

    @Autowired
    StudentService service;

    // Add Student
    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student s) {
        return service.addStudent(s);
    }
    
 // View one student
    @GetMapping("/viewstudent/{id}")
    public Student viewStudent(@PathVariable Long id) {
        return service.viewStudent(id);
    }

    // View all students
    @GetMapping("/viewallstudents")
    public List<Student> viewAllStudents() {
        return service.viewAllStudent();
    }

    // Update student
    @PutMapping("/updatestudent")
    public Student updateStudent(@RequestBody Student s) {
        return service.updateStudent(s);
    }

   // Delete student
    @DeleteMapping("/deletestudent/{id}")
    public String deleteStudent(@PathVariable Long id) {
       service.deleteStudent(id);
     return "Student deleted successfully";
    }
     
    
}