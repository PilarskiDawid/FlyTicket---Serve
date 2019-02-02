package com.pz.project.TicketSelling.services;

import com.pz.project.TicketSelling.dao.SeatsRepository;
import com.pz.project.TicketSelling.entity.Seats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeatsService {

    private final
    SeatsRepository seatsRepository;

    @Autowired
    public SeatsService(SeatsRepository seatsRepository) {
        this.seatsRepository = seatsRepository;
    }

    public List<Seats> getAllSeats() {
        return seatsRepository.findAll();
    }


    public void updateSeat(Seats seat, int id){
        seatsRepository.save(seat);
    }



}
