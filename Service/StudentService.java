package com.mainflow.studentsystem.Service;
import java.util.List;
import com.mainflow.studentsystem.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
