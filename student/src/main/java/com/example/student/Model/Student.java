package com.example.student.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Student{

    @Id
    private String usn;

    @Column
    private String name;

    @Column
    private String dept;

    public Student(){}

    public Student(String d1, String d2, String d3){
        this.usn=d1;
        this.name=d2;
        this.dept=d3;
    }

    public String getUsn(){
        return usn;
    }
    public void setUsn(String usn){
        this.usn=usn;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getDept(){
        return dept;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
}
