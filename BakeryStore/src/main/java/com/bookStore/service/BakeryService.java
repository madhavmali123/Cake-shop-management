package com.bookStore.service;

import java.util.List;

import com.bookStore.entity.Bakery;
import com.bookStore.repository.BakeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BakeryService {

    @Autowired
    private BakeryRepository bRepo;

    public void save(Bakery b) {
        bRepo.save(b);
    }

    public List<Bakery> getAllBakery(){
        return bRepo.findAll();
    }

    public Bakery getBakeryById(int id) {
        return bRepo.findById(id).get();
    }
    public void deleteById(int id) {
        bRepo.deleteById(id);
    }
}
