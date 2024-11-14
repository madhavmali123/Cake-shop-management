package com.bookStore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bakery {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String btype;
    private String price;
    public Bakery(int id, String name, String btype, String price) {
        super();
        this.id = id;
        this.name = name;
        this.btype = btype;
        this.price = price;
    }
    public Bakery() {
        super();
        // TODO Auto-generated constructor stub
    }
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
    public String getBtype() {
        return btype;
    }
    public void setBtype(String btype) {
        this.btype = btype;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

}
