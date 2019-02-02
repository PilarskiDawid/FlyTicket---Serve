package com.pz.project.TicketSelling.rest;

import com.pz.project.TicketSelling.entity.ArrivalAirports;
import com.pz.project.TicketSelling.services.ArrivalAirportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class ArrivalAiportsController {

    private final ArrivalAirportsService arrivalAirportsService;

    @Autowired
    public ArrivalAiportsController(ArrivalAirportsService arrivalAirportsService) {
        this.arrivalAirportsService = arrivalAirportsService;
    }

    @GetMapping("/arrivalAirports")
    public List<ArrivalAirports> findAll(){
        return arrivalAirportsService.findAll();
    }

    @GetMapping("/{id}/arrivalAirports")
    public List<ArrivalAirports> findById(@PathVariable int id){
        return arrivalAirportsService.getById( id);
    }
}
