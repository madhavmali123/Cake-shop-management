package com.bookStore.service;

import java.util.List;

import com.bookStore.entity.MyBakeryList;
import com.bookStore.repository.MyBakeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyBakeryListService {

    @Autowired
    private MyBakeryRepository mybakery;

    public void saveMyBakery(MyBakeryList mb) {
        mybakery.save(mb);
    }

    public List<MyBakeryList> getAllMyBakery(){
        return mybakery.findAll();
    }

    public void deleteById(int id) {
        mybakery.deleteById(id);
    }
}
