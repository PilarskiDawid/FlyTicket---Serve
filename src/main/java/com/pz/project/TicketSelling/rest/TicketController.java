package com.pz.project.TicketSelling.rest;

import com.pz.project.TicketSelling.email.EmailService;
import com.pz.project.TicketSelling.email.Mail;
import com.pz.project.TicketSelling.entity.Ticket;
import com.pz.project.TicketSelling.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TicketController {

    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    @Autowired
    private EmailService emailService;

    @PostMapping(value = "/tickets")
    public void addTicket(@RequestBody Ticket ticket) throws MessagingException {

        ticketService.addTicket(ticket);
        String email = ticket.getUser().getEmail();
        String fromGo = ticket.getFromGo();
        String whereGo = ticket.getToGo();
        String whenGo = ticket.getWhenGo();
        String whenBack = ticket.getWhenBack();
        double cost = ticket.getTicketCost();
        String name = ticket.getName();
        String text = "Witaj "+name+"! \n" + "Kupiłeś bilet lotniczy. Miejsce wylotu: "+fromGo+
                    "\n Miejsce przylotu: "+ whereGo+
                    "\n Data wylotu: "+whenGo+
                    "\n Data powrotu: "+whenBack+
                    "\n Bilet kosztuje: "+String.valueOf(cost)+
                    "\n Życzymy miłej podróży! ";
        Mail mail = new Mail("projekt.pz.ticket@gmail.com", email, "Kupiłeś bilet", text);

        emailService.sendSimpleMessage(mail);
    }

    @GetMapping("/tickets/{userman}")
    public List<Ticket> getTicket(@PathVariable String userman){
        return ticketService.getByUser(userman);
    }

}
