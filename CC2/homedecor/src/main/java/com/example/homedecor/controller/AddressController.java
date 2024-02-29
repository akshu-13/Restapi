package com.example.homedecor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.homedecor.model.Address;
import com.example.homedecor.service.AddressService;

@RestController
public class AddressController {

    @Autowired
    AddressService aService;

    @PostMapping("/hompost")
    public Address addinfo(@RequestBody Address a) {

        return aService.adduser(a);
    }

    @GetMapping("/homget")
    public List<Address> getinfo() {
        return aService.getuser();
    }


    @GetMapping("/Address/SortBy/{pincode}")
    public List<Address> getRestaurantWithSorting(@PathVariable String pincode)
    {
        return aService.getPincodeWithSorting(pincode);
    }

}
