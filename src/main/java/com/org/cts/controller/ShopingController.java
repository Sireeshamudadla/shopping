package com.org.cts.controller;

import com.org.cts.model.Shoping;
import com.org.cts.service.Shopingservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShopingController {
    @Autowired
    Shopingservice shopingservice;


    @PostMapping("/create")
    public void createShoping(@RequestBody Shoping shoping){
        shopingservice.createShoping(shoping);

    }
    @GetMapping("/getAll")
    public List<Shoping> getAll(){
        List<Shoping> men =shopingservice.getAll();
        return men;
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        String ss= shopingservice.deleteById(id);
        return ss;
    }
    @DeleteMapping("/deleteByName/{name}")
    public String deleteByName(@PathVariable String name){
        String sap=shopingservice.deleteByName(name);
        return sap;
    }
    @PutMapping("/update")
    public void updateShoping(@RequestBody Shoping shoping){
        shopingservice.updateShoping(shoping);

    }
}
