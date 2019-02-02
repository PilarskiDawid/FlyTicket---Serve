package com.pz.project.TicketSelling.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="departureairports")
public class DepartureAirports {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_departure_airport")
    private int idDeparture;

    @Column(name = "city")
    private String city;


    @OneToMany(mappedBy = "departureAirports", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @Column(nullable = true)
    //  @JsonManagedReference
    @JsonIgnore
    private List<Connections> connectionsList;

    public DepartureAirports() {
    }

    public DepartureAirports(String city, List<Connections> connectionsList) {
        this.city = city;
        this.connectionsList = connectionsList;
    }

    public int getIdDeparture() {
        return idDeparture;
    }

    public void setIdDeparture(int idDeparture) {
        this.idDeparture = idDeparture;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Connections> getConnectionsList() {
        return connectionsList;
    }

    public void setConnectionsList(List<Connections> connectionsList) {
        this.connectionsList = connectionsList;
    }


    @Override
    public String toString() {
        return "DepartureAirports{" +
                "idDeparture=" + idDeparture +
                ", city='" + city + '\'' +
                ", connectionsList=" + connectionsList +
                '}';
    }
}