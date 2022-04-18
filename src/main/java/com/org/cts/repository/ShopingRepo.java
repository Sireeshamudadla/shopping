package com.org.cts.repository;

import com.org.cts.model.Shoping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;

@Repository
public interface ShopingRepo extends JpaRepository<Shoping,Integer> {

@Transactional
     String deleteByName(String name);


}
