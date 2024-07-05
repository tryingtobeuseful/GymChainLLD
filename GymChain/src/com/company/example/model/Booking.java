package com.company.example.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Booking {

    private AtomicInteger idGenerator = new AtomicInteger(0);
    Integer id;
    String classId;
    String userId;

    public Booking(String classId, String userId) {
        this.id = idGenerator.getAndIncrement();
        this.classId = classId;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
