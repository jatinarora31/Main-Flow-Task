package com.mainflow.studentsystem.controller;

import java.util.*;
import com.mainflow.studentsystem.model.Student;
import com.mainflow.studentsystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New student is added";
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
