package com.example.student.Repository;

import com.example.student.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository      //remember to annotate
public interface StudentRepository extends JpaRepository<Student,String>
{

}
