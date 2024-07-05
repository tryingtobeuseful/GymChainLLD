package com.company.example.model;

import com.company.example.model.enums.ClassType;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class GymClass {
    private AtomicInteger idGenerator = new AtomicInteger(0);
    Integer id;
    ClassType classType;
    String gymId;
    int maxCapacity;
    LocalDateTime startTime;
    LocalDateTime endTime;

    Map<String, Booking> bookings;

    public GymClass(ClassType classType, String gymId, int maxCapacity, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = idGenerator.getAndIncrement();
        this.classType = classType;
        this.gymId = gymId;
        this.maxCapacity = maxCapacity;
        this.startTime = startTime;
        this.endTime = endTime;
        this.bookings = new HashMap<>();
    }

    public Integer getId() {
        return id;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public String getGymId() {
        return gymId;
    }

    public void setGymId(String gymId) {
        this.gymId = gymId;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
