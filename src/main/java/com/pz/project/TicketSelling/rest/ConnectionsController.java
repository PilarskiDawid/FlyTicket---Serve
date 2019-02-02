package com.pz.project.TicketSelling.rest;

import com.pz.project.TicketSelling.entity.Connections;
import com.pz.project.TicketSelling.services.ConnectionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ConnectionsController {
    private final ConnectionsService connectionsService;

    @Autowired
    public ConnectionsController(ConnectionsService connectionsService) {
        this.connectionsService = connectionsService;
    }

    @GetMapping("/connections")
    public List<Connections> getAllConnections() {
        return connectionsService.getAllConnections();
    }


    @GetMapping("/{departureName}/connections")
    public List<Connections> findByDeparture(@PathVariable String departureName){
        return connectionsService.getByDeparture(departureName);
    }

    @RequestMapping("/connections/{id}")
    public Connections getConnections(@PathVariable int id) {
        return connectionsService.getConnections(id);
    }


    @PostMapping(value = "/connections")
    public void addPlane(@RequestBody Connections connections) {
        connectionsService.addConnections(connections);
    }

    @PutMapping(value = "/connections/{id}")
    public void updateConnections(@RequestBody Connections connections, @PathVariable int id) {
        connectionsService.updateConnections(connections, id);
    }

    @DeleteMapping(value = "/connections/{id}")
    public void deleteConnections(@PathVariable int id) {
        connectionsService.deleteConnections(id);
    }

}
