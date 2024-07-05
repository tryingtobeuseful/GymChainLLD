package com.company.example.model;

import com.company.example.model.enums.UserGender;
import com.company.example.model.enums.UserType;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class User {
    private AtomicInteger idGenerator = new AtomicInteger(0);
    Integer id;
    String name;
    String email;
    UserType userType;
    UserGender gender;

    Map<String, Booking> bookings;

    public User(String name, String email, UserType userType, UserGender gender) {
        this.id = idGenerator.getAndIncrement();
        this.name = name;
        this.email = email;
        this.userType = userType;
        this.gender = gender;
        this.bookings = new HashMap<>();
    }

    public UserGender getGender() {
        return gender;
    }

    public void setGender(UserGender gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
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

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
