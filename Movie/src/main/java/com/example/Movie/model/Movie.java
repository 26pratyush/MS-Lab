package com.example.Movie.model;

import jakarta.persistence.*;

@Entity
@Table
public class Movie{
    @Id
    private int id;

    @Column
    private String title;

    @Column
    private int price;

    public Movie() {}

    public Movie(int d1,String d2, int d3){
        this.id=d1;
        this.title=d2;
        this.price=d3;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
}
