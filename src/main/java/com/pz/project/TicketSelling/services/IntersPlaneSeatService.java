package com.pz.project.TicketSelling.services;

import com.pz.project.TicketSelling.dao.IntersPlaneSeatRepository;
import com.pz.project.TicketSelling.entity.IntersPlaneSeat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IntersPlaneSeatService {
    private final IntersPlaneSeatRepository intersPlaneSeatRepository;

    @Autowired
    public IntersPlaneSeatService(IntersPlaneSeatRepository intersPlaneSeatRepository) {
        this.intersPlaneSeatRepository = intersPlaneSeatRepository;
    }


    public List<IntersPlaneSeat> getIdSeat(int id){
        return intersPlaneSeatRepository.findByPlane_PlaneID(id);
    }


}
