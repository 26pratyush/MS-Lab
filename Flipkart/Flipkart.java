package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table
public class Flipkart {
    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private int price;

    public Flipkart(){}

    public Flipkart(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
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
