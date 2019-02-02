package com.pz.project.TicketSelling.dao;

import com.pz.project.TicketSelling.entity.Seats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatsRepository extends JpaRepository<Seats, Integer> {

}
