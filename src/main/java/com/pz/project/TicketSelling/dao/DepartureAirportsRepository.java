package com.pz.project.TicketSelling.dao;

import com.pz.project.TicketSelling.entity.DepartureAirports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartureAirportsRepository  extends JpaRepository<DepartureAirports, Integer> {

}
