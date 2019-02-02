package com.pz.project.TicketSelling.services;

import com.pz.project.TicketSelling.dao.DepartureAirportsRepository;
import com.pz.project.TicketSelling.entity.DepartureAirports;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartureAirportsService {

    private final DepartureAirportsRepository departureAirportsRepository;

    @Autowired
    public DepartureAirportsService(DepartureAirportsRepository departureAirportsRepository) {
        this.departureAirportsRepository = departureAirportsRepository;
    }


    public List<DepartureAirports> findAll(){
        return departureAirportsRepository.findAll();
    }
}
