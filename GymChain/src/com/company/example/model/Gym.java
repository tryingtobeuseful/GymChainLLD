package com.company.example.model;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Gym {

    private AtomicInteger idGenerator = new AtomicInteger(0);
    private Integer id;

    private Location location;

    private int capacity;

    private Map<Integer, GymClass> classes;

    public Gym(Location location, int capacity){
        this.id = idGenerator.getAndIncrement();
        this.location = location;
        this.capacity = capacity;
        this.classes = new HashMap<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public Location getLocation() {
        return location;
    }

    public Integer getId() {
        return id;
    }

    public GymClass getClassById(String classId){
        return classes.getOrDefault(classId, null);
    }

    public void addClass(GymClass gymClass){
        classes.put(gymClass.id, gymClass);
    }
}
