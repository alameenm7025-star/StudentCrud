package com.SpringBootcrud.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootcrud.StudentModel.Student;
import com.SpringBootcrud.StudentRepository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    // Add Student
    public Student addStudent(Student s) {
        return repo.save(s);
    }

    // Update Student
    public Student updateStudent(Student s) {
        return repo.save(s);
    }

     //Delete Student
    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }

    // View Studen by ID
    public Student viewStudent(Long id) {
        return repo.findById(id).orElse(null);
    }

    // View All Students
    public List<Student> viewAllStudent() {
        return repo.findAll();
    }

}