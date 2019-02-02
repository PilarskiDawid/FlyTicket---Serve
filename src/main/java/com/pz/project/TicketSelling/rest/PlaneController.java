package com.pz.project.TicketSelling.rest;
import com.pz.project.TicketSelling.entity.Plane;
import com.pz.project.TicketSelling.services.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PlaneController {

    private final PlaneService planeService;

    @Autowired
    public PlaneController(PlaneService planeService) {
        this.planeService = planeService;
    }


    @GetMapping("/plane")
    public List<Plane> findAll(){
        return planeService.getAllPlanes();
    }

}
