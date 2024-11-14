package com.bookStore.controller;

import com.bookStore.entity.Bakery;
import com.bookStore.entity.MyBakeryList;
import com.bookStore.service.BakeryService;
import com.bookStore.service.MyBakeryListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.bookStore.entity.Bakery;
import com.bookStore.entity.MyBakeryList;
import com.bookStore.service.BakeryService;
import com.bookStore.service.MyBakeryListService;

import java.util.*;

@Controller
public class BakeryController {

    @Autowired
    private BakeryService service;

    @Autowired
    private MyBakeryListService myBakeryService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/bakery_register")
    public String bakeryRegister() {
        return "bakeryRegister";
    }

    @GetMapping("/available_bakery")
    public ModelAndView getAllBakery() {
        List<Bakery> list=service.getAllBakery();
        return new ModelAndView("bakeryList","bakery",list);
    }

    @PostMapping("/save")
    public String addBakery(@ModelAttribute Bakery b) {
        service.save(b);
        return "redirect:/available_bakery";
    }
    @GetMapping("/my_bakery")
    public String getMyBakery(Model model)
    {
        List<MyBakeryList>list=myBakeryService.getAllMyBakery();
        model.addAttribute("bakery",list);
        return "myBakery";
    }
    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id) {
        Bakery b=service.getBakeryById(id);
        MyBakeryList mb1=new MyBakeryList(b.getId(),b.getName(),b.getBtype(),b.getPrice());
        myBakeryService.saveMyBakery(mb1);
        return "redirect:/my_bakery";
    }

    @RequestMapping("/editBakery/{id}")
    public String editBakery(@PathVariable("id") int id,Model model) {
        Bakery b=service.getBakeryById(id);
        model.addAttribute("bakery",b);
        return "bakeryEdit";
    }
    @RequestMapping("/deleteBakery/{id}")
    public String deleteBakery(@PathVariable("id")int id) {
        service.deleteById(id);
        return "redirect:/available_bakery";
    }

}
