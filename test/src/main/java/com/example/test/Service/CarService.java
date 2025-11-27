package com.example.test.Service;

import com.example.test.Model.Car;
import com.example.test.Repository.CarRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service  //remember to annotate
public class CarService {

    //Repository Object
    private final CarRepository Crep;

    //Initialise Object / Constructor
    public CarService(CarRepository Crep){
        this.Crep=Crep;
    }

    //Create Operation
    public Car create(Car car){
        return Crep.save(car);
    }

    //Read(All) Operation
    public List<Car> getAllCars(){
        return Crep.findAll();
    }

    //Read(One) Operation
    public Car getCar(int Cid){
        return Crep.findById(Cid).orElse(null);
    }

    //Update Operation
    public Car updateCar(int Cid, Car newdata){
        Car oldcar=Crep.findById(Cid).get();

        oldcar.setCname(newdata.getCname());
        oldcar.setCmodel(newdata.getCmodel());
        oldcar.setCyear(newdata.getCyear());

        Crep.save(oldcar);
        return oldcar;
    }

    //Delete(All) Operation
    public void deleteAll(){
        Crep.deleteAll();
    }

    //Delete(One) Operation
    public void deleteCar(int Cid){
        Crep.deleteById(Cid);
    }
}
