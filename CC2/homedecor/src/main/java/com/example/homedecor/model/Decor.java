package com.example.homedecor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Renovations")
public class Decor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String emailId;
    String userName;
    String passWord;
    String confirmPass;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getConfirmPass() {
        return confirmPass;
    }
    public void setConfirmPass(String confirmPass) {
        this.confirmPass = confirmPass;
    }
    
    
    
    
}