package com.example.homedecor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.homedecor.model.Address;
import com.example.homedecor.repository.AddressRepo;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;

    public Address adduser(Address a)
    {
        return addressRepo.save(a);
    }
    public List<Address> getuser()
    {
        return addressRepo.findAll();
    }

    public List<Address> getPincodeWithSorting(String field)
    {
        Sort sort=Sort.by(Sort.Direction.ASC,field);
        return addressRepo.findAll(sort);
    }
}
