package com.pz.project.TicketSelling.services;

import com.pz.project.TicketSelling.dao.TicketRepository;
import com.pz.project.TicketSelling.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {
    final
    TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;

    }

    public List<Ticket> getByUser(String user){
        return ticketRepository.findByName(user);
    }


    public Ticket getTicket(int id) {
        return ticketRepository.findById(id).get();
    }

    public void addTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public void updateTicket(Ticket ticket, int id) {
        ticketRepository.save(ticket);
    }

    public void deleteTicket(int id) {
        ticketRepository.deleteById(id);
    }

    public List<Ticket> getAllTicketsByFlight(int id) {
        List<Ticket> tickets = new ArrayList<>();
        ticketRepository.findByFlightFlightID(id).forEach(tickets::add);
        return tickets;
    }
}
