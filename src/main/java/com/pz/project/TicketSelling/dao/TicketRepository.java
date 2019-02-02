package com.pz.project.TicketSelling.dao;


import com.pz.project.TicketSelling.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    List<Ticket> findByFlightFlightID(int id);
    List<Ticket> findByName(String name);
}
