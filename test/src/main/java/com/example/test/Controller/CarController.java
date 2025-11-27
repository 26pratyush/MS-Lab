package com.example.test.Controller;
import com.example.test.Model.Car;
import com.example.test.Service.CarService;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {
    private final CarService cs;

    public CarController(CarService cs){
        this.cs=cs;
    }

    //These return names must be mapped to / the same as those in Service -> CarService
    //POST Request - Create Operation
    @PostMapping("/createCar")
    public Car createcar(@RequestBody Car c) {
        return cs.create(c);
    }

    //GET Request - Read Operation
    @GetMapping("/getAllCars")
    public List<Car> getAllCars(){
        return cs.getAllCars();
    }

    //GET Request - Read Operation
    @GetMapping("/get{Cid}")
    public Car getCarById(@PathVariable int Cid){
        return cs.getCar(Cid);
    }

    //PUT Request - Update Operation
    @PutMapping("/updatecar/{Cid}")
    public Car updatecar(@RequestBody Car c, @PathVariable int Cid) { // This order of parameters doesn't matter
        return cs.updateCar(Cid, c); // How you pass matters. This should match with CarServices.java
    }

    //DELETE Request - Delete Operation
    @DeleteMapping("/deleteAll")
    public String deletecars() {
        cs.deleteAll();
        return "All Cars data deleted";
    }

    //DELETE Request - Delete Operation
    @DeleteMapping("/deleteCar/{Cid}")
    public String deletecar(@PathVariable int Cid) {
        cs.deleteCar(Cid);
        return "Employee Deleted";
    }
}
