package com.pz.project.TicketSelling.dao;

import com.pz.project.TicketSelling.entity.IntersPlaneSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IntersPlaneSeatRepository extends JpaRepository<IntersPlaneSeat, Integer> {
    List<IntersPlaneSeat> findByPlane_PlaneID(int plane_idPlane);
}

