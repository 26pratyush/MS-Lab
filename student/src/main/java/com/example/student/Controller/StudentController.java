package com.example.student.Controller;

import com.example.student.Model.Student;
import com.example.student.Repository.StudentRepository;
import com.example.student.Service.StudentService;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    private final StudentService ss;
    public StudentController (StudentService ss) {
        this.ss = ss;
    }

    //POST Request - Create Operation
    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student s) {
        return ss.create(s);
    }

    //GET Request - Read All
    @GetMapping("/getAllStudents")
    public List<Student> findAll(){
        return ss.FindAll();
    }

    //GET Request - Read One
    @GetMapping("/get/{usn}")
    public Student findById(@PathVariable String usn){
        return ss.getStudent(usn);
    }

    //PUT Request - Update
    @PutMapping("/updateStudent/{usn}")
    public Student updateStudent(@RequestBody Student s,@PathVariable String usn){
        return ss.updateStudent(usn,s);
    }

    //DELETE Request - Delete All
    @DeleteMapping("/deleteAll")
    public String deleteStudents() {
        ss.deleteAll();
        return "All Student data deleted";
    }

    //DELETE Request - Delete One
    @DeleteMapping("/deleteStudent/{usn}")
    public String deleteById(@PathVariable String usn) {
        ss.deleteStudent(usn);
        return "Student Deleted";
    }
}
