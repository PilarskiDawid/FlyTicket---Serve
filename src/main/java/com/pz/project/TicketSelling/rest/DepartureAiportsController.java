package com.pz.project.TicketSelling.rest;

import com.pz.project.TicketSelling.entity.DepartureAirports;
import com.pz.project.TicketSelling.services.DepartureAirportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class DepartureAiportsController {

    private final DepartureAirportsService departureAirportsService;

    @Autowired
    public DepartureAiportsController(DepartureAirportsService departureAirportsService) {
        this.departureAirportsService = departureAirportsService;
    }

    @GetMapping("/departureAirports")
    public List<DepartureAirports> findAll(){
        return departureAirportsService.findAll();
    }

}
