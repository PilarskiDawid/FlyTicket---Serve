package com.pz.project.TicketSelling.dao;

import com.pz.project.TicketSelling.entity.Connections;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConnectionsRepository extends JpaRepository<Connections, Integer> {

    List<Connections> findByDepartureAirports_City(String departureAirports_city);
}
