package com.pz.project.TicketSelling.rest;

import com.pz.project.TicketSelling.entity.Flight;
import com.pz.project.TicketSelling.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FlightController {

    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/flight")
    public List<Flight> findAll(){
        return flightService.getAllFlights();
    }

    @GetMapping("/connections/{id}/flights")
    public List<Flight> findByIdConnections(@PathVariable  int id){
        return flightService.getFlightsByIdConnections(id);
    }

    @GetMapping("/connections/flights/{city}")
    public List<Flight> findByArrivalCity(@PathVariable String city){
        return  flightService.getFlightByArrivalCity(city);
    }

    @GetMapping("/flight/{id}")
    public List<Flight> findById(@PathVariable int id){
        return flightService.getById(id);
    }


    @GetMapping("/connections/flights/{city}/{city2}/{whichDate}")
    public List<Flight> findByDateAndCity(@PathVariable String whichDate, @PathVariable String city, @PathVariable String city2){
        return flightService.getByDateAndCity(whichDate, city, city2);
    }

    @PostMapping("/flight/new")
    public void addFlight(@RequestBody Flight flight) {
        flightService.addFlight(flight);
    }

}
