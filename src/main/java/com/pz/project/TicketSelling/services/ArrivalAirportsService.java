package com.pz.project.TicketSelling.services;

import com.pz.project.TicketSelling.dao.ArrivalAirportsRepository;
import com.pz.project.TicketSelling.entity.ArrivalAirports;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArrivalAirportsService{

    private final ArrivalAirportsRepository arrivalAirportsRepository;

    @Autowired
    public ArrivalAirportsService(ArrivalAirportsRepository arrivalAirportsRepository) {
        this.arrivalAirportsRepository = arrivalAirportsRepository;
    }


    public List<ArrivalAirports> findAll(){
        return arrivalAirportsRepository.findAll();
    }

    public List<ArrivalAirports> getById(int id){
        return arrivalAirportsRepository.findByIdArrival(id);
    }
}
