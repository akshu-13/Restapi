package com.example.homedecor.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Table(name ="Booking")
@Transactional
public class Address {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    Long appointmentId;
    String name;
    String email;
    String address;
    String pincode;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")

    Customer customer;


    public Long getAppointmentId() {
        return appointmentId;
    }


    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getPincode() {
        return pincode;
    }


    public void setPincode(String pincode) {
        this.pincode = pincode;
    }


    public Customer getCustomer() {
        return customer;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


}