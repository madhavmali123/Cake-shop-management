package com.bookStore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyBakery")
public class MyBakeryList {

    @Id
    private int id;
    private String name;
    private String btype;
    private String price;
    public MyBakeryList() {
        super();

    }
    public MyBakeryList(int id, String name, String btype, String price) {
        super();
        this.id = id;
        this.name = name;
        this.btype = btype;
        this.price = price;
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
