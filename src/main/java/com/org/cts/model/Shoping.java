package com.org.cts.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Shoping {
    @Id

    private int id;
    private String name;
    private String shopingAddress;
    private double cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopingAddress() {
        return shopingAddress;
    }

    public void setShopingAddress(String shopingAddress) {
        this.shopingAddress = shopingAddress;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
