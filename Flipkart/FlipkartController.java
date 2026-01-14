package com.example.demo.controller;

import com.example.demo.model.Flipkart;
import com.example.demo.service.FlipkartService;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
public class FlipkartController {
    private final FlipkartService fs;
    public FlipkartController(FlipkartService fs){
        this.fs=fs;
    }

    @PostMapping("/create")
    public Flipkart create(@RequestBody Flipkart flipkart){
        return fs.create(flipkart);
    }

    @GetMapping("/get/{id}")
    public Flipkart findById(@PathVariable int id){
        return fs.findById(id);
    }

    @GetMapping("/getAllProducts")
    public List<Flipkart> findAll(){
        return fs.findAll();
    }

    @DeleteMapping("/deleteAllProducts")
    public void deleteById(){
        fs.deleteAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id){
        fs.deleteById(id);
    }

    @PutMapping("/updateProduct/{id}")
    public Flipkart update(@PathVariable int id, @RequestBody Flipkart flipkart){
        return fs.update(id, flipkart);
    }
}
