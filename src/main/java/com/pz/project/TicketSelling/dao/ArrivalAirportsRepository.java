package com.pz.project.TicketSelling.dao;

import com.pz.project.TicketSelling.entity.ArrivalAirports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArrivalAirportsRepository extends JpaRepository<ArrivalAirports, Integer>{
    List<ArrivalAirports> findByIdArrival(int id);
}
