package com.company.example.repo;

import com.company.example.model.Gym;

import java.util.HashMap;
import java.util.Map;

public class GymRepo {
    private Map<Integer, Gym> gyms;

    private static GymRepo gymRepo = null;

    private GymRepo(){
        this.gyms = new HashMap<>();
    }

    public static GymRepo getInstance(){
        if(gymRepo == null){
            gymRepo = new GymRepo();
        }
        return gymRepo;
    }

    public void addGym(Gym gym){
        gyms.put(gym.getId(), gym);
    }

    public Gym getGym(Integer id){
        return gyms.get(id);
    }
}
