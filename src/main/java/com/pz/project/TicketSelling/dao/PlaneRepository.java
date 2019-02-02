package com.pz.project.TicketSelling.dao;

import com.pz.project.TicketSelling.entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Integer> {


}
