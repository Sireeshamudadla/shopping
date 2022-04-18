package com.org.cts.service;

import com.org.cts.model.Shoping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface Shopingservice {
    public void createShoping(Shoping shoping);

    public List<Shoping> getAll();

    public String deleteById(Integer id);

    public String deleteByName(String name);
    public void updateShoping(Shoping shoping);

}