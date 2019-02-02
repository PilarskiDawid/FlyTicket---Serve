package com.pz.project.TicketSelling.services;


import com.pz.project.TicketSelling.dao.PlaneRepository;
import com.pz.project.TicketSelling.entity.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaneService {

    private final
    PlaneRepository planeRepository;

    @Autowired
    public PlaneService(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }

    public List<Plane> getAllPlanes() {
        return planeRepository.findAll();
    }


    public Plane getPlane(int id) {
        return planeRepository.findById(id).get();
    }

    public void addPlane(Plane plane) {
        planeRepository.save(plane);
    }

    public void updatePlane(Plane plane, int id) {
        planeRepository.save(plane);
    }

    public void deletePlane(int id) {
        planeRepository.deleteById(id);
    }


}
