package com.example.homedecor.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.homedecor.model.Decor;
import com.example.homedecor.service.DecorService;

@RestController
public class DecorController {

    @Autowired
    DecorService decorService;

    @PostMapping("/decpost")
    public Decor postMethodName(@RequestBody Decor decor)
    {
        return decorService.addDecor(decor);
    }
    @GetMapping("/decget")
    public List<Decor> getDecors()
    {
        return decorService.getDecors();
        }
        @PutMapping("putdec/{id}")
    public  Decor putdecor(@PathVariable Long id, @RequestBody Decor decor) {
        return decorService.putdecor(id,decor);
    }
    
    @DeleteMapping("/deletedec/{id}")
    public String deletedecor(@PathVariable Long id)
    {
        return decorService.deletedecor(id);
    }
    
}