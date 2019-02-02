package com.pz.project.TicketSelling.services;

import com.pz.project.TicketSelling.dao.FlightRepository;
import com.pz.project.TicketSelling.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FlightService {
    final
    FlightRepository flightRepository;

    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public List<Flight> getFlightsByIdConnections(int idConnections){
        return flightRepository.findByConnectionConnectionID(idConnections);
    }

    public List<Flight> getById(int id){
        return flightRepository.findByFlightID(id);
    }

    public List<Flight> getFlightByArrivalCity(String city){
        return  flightRepository.findByConnection_DepartureAirports_City(city );
    }

    public List<Flight> getByDateAndCity(String whichDate, String city, String city2){
        return flightRepository.findByDepartureDateAndConnection_DepartureAirports_CityAndConnection_ArrivalAirports_City(whichDate, city, city2);
    }


    public void addFlight(Flight flight) {
        flightRepository.save(flight);
    }

}
