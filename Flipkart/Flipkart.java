package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table
public class Flipkart {
    @Id
    private int id;

    @Column
    private String name;

    @Column
    private int price;

    public Flipkart(){}

    public Flipkart(int d1, String d2, int d3){
        this.id = d1;
        this.name = d2;
        this.price = d3;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
}
