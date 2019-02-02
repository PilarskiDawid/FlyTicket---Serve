package com.pz.project.TicketSelling.rest;

import com.pz.project.TicketSelling.entity.Seats;
import com.pz.project.TicketSelling.services.SeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SeatsController {

    private final SeatsService seatsService;

    @Autowired
    public SeatsController(SeatsService seatsService) {
        this.seatsService = seatsService;
    }


    @PutMapping(value = "/seat/{id}")
    public void updateSeat(@RequestBody Seats seat, @PathVariable int id){
        seatsService.updateSeat(seat, id);
    }

}
