package com.example.test.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Car{

    @Id
    private int Cid;

    @Column
    private String Cname;

    @Column
    private String Cmodel;

    @Column
    private int Cyear;

    public Car(){
    }

    public Car(int d1, String d2, String d3, int d4){
        Cid = d1;
        Cname=d2;
        Cmodel=d3;
        Cyear=d4;
    }

    //Getter and Setter methods:
    public int getCid(){
        return Cid;
    }
    public void setCid(int Cid){
        this.Cid=Cid;
    }

    public String getCname(){
        return Cname;
    }
    public void setCname(String Cname){
        this.Cname=Cname;
    }

    public String getCmodel(){
        return Cmodel;
    }
    public void setCmodel(String Cmodel){
        this.Cmodel=Cmodel;
    }

    public int getCyear(){
        return Cyear;
    }
    public void setCyear(int Cyear){
        this.Cyear=Cyear;
    }
}

