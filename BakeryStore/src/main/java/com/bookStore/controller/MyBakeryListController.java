package com.bookStore.controller;

import com.bookStore.service.MyBakeryListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyBakeryListController {

    @Autowired
    private MyBakeryListService service;

    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") int id) {
        service.deleteById(id);
        return "redirect:/my_bakery";
    }

}
