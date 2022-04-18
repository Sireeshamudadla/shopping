package com.org.cts.service;

import com.org.cts.model.Shoping;
import com.org.cts.repository.ShopingRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopingServiceImpl implements Shopingservice {
     @Autowired
    ShopingRepo shopingRepo;

     @Override
    public void createShoping(Shoping shoping) {
         shopingRepo.save(shoping);

    }

    @Override
    public List<Shoping> getAll() {
        List<Shoping> lis  = shopingRepo.findAll();
        return lis;
    }

    @Override
    public String deleteById(Integer id) {
          shopingRepo.deleteById(id);
        return "success" ;

    }

    @Override
    public String deleteByName(String name) {
        shopingRepo.deleteByName(name);
        return "manju";
    }

    @Override
    public void updateShoping(Shoping shoping) {
        shopingRepo.save(shoping);
    }


}
