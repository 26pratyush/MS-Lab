package com.example.demo.service;

import com.example.demo.model.Flipkart;
import com.example.demo.repository.FlipkartRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FlipkartService {
    private final FlipkartRepository fr;
    public FlipkartService(FlipkartRepository fr){
        this.fr=fr;
    }

    public Flipkart create(Flipkart flipkart){
        return fr.save(flipkart);
    }

    public Flipkart findById(int id){
        return fr.findById(id).orElse(null);
    }

    public List<Flipkart> findAll() {
        return fr.findAll();
    }

    public String deleteById(int id){
        fr.deleteById(id);
        return "Deleted product successfully!";
    }

    public String deleteAll(){
        fr.deleteAll();
        return "All products deleted successfully!";
    }

    public Flipkart update(int id, Flipkart newdata){
        Flipkart flipkart=fr.findById(id).get();
        flipkart.setName(newdata.getName());
        flipkart.setPrice(newdata.getPrice());
        return fr.save(flipkart);
    }
}
