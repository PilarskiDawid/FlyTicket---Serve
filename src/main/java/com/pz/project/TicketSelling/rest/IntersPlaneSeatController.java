package com.pz.project.TicketSelling.rest;

import com.pz.project.TicketSelling.entity.IntersPlaneSeat;
import com.pz.project.TicketSelling.services.IntersPlaneSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@CrossOrigin
@RestController
public class IntersPlaneSeatController {

    private IntersPlaneSeatService intersPlaneSeatService;

    @Autowired
    public IntersPlaneSeatController(IntersPlaneSeatService intersPlaneSeatService) {
        this.intersPlaneSeatService = intersPlaneSeatService;
    }


    @GetMapping("/plane/{id}")
    public List<IntersPlaneSeat> getIdSeat(@PathVariable int id){
        return intersPlaneSeatService.getIdSeat(id);
    }




}
