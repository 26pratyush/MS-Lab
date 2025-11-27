package com.example.student.Service;

import com.example.student.Model.Student;
import com.example.student.Repository.StudentRepository;
import com.example.student.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service     //Remember to annotate
public class StudentService {
    private final StudentRepository Srep;

    public StudentService(StudentRepository Srep){
        this.Srep=Srep;
    }

    //Create
    public Student create(Student s){
        return Srep.save(s);
    }

    //Read (all)
    public List<Student> FindAll(){
        return Srep.findAll();
    }
    //Read (one)
    public Student getStudent(String usn){
        return Srep.findById(usn).orElse(null);
    }

    //Update
    public Student updateStudent(String usn, Student newdata){
        Student s=Srep.findById(usn).get();
        s.setName(newdata.getName());
        s.setDept(newdata.getDept());
        return Srep.save(s);
    }

    //Delete (all)
    public void deleteAll(){
        Srep.deleteAll();;
    }
    //Delete (one)
    public void deleteStudent(String usn){
        Srep.deleteById(usn);
    }
}
