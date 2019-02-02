package com.pz.project.TicketSelling.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "connections")
public class Connections {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "connection_id")
    private int connectionID;

    @JsonIgnore
    @OneToMany(mappedBy = "connection")
    private List<Flight> flights;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinColumn(name = "id_departure_airport")
    private DepartureAirports departureAirports;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinColumn(name = "id_arrival_airport")
    private ArrivalAirports arrivalAirports;




    public Connections() {

    }

    public Connections(List<Flight> flights, DepartureAirports departureAirports, ArrivalAirports arrivalAirports) {
        this.flights = flights;
        this.departureAirports = departureAirports;
        this.arrivalAirports = arrivalAirports;
    }

    public int getConnectionID() {
        return connectionID;
    }

    public void setConnectionID(int connectionID) {
        this.connectionID = connectionID;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public DepartureAirports getDepartureAirports() {
        return departureAirports;
    }

    public void setDepartureAirports(DepartureAirports departureAirports) {
        this.departureAirports = departureAirports;
    }

    public ArrivalAirports getArrivalAirports() {
        return arrivalAirports;
    }

    public void setArrivalAirports(ArrivalAirports arrivalAirports) {
        this.arrivalAirports = arrivalAirports;
    }

    @Override
    public String toString() {
        return "Connections{" +
                "connectionID=" + connectionID +
                ", flights=" + flights +
                ", departureAirports=" + departureAirports +
                ", arrivalAirports=" + arrivalAirports +
                '}';
    }
}
