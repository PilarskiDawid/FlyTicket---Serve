package com.pz.project.TicketSelling.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="arrivalairports")
public class ArrivalAirports {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "id_arrival_airport")
    private int idArrival;

    @Column(name = "city")
    private String city;


    @OneToMany(mappedBy = "arrivalAirports", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @Column(nullable = true)
    //  @JsonManagedReference
    @JsonIgnore
    private List<Connections> connectionsList;


    public ArrivalAirports(){}

    public int getIdArrival() {
        return idArrival;
    }

    public void setIdArrival(int idArrival) {
        this.idArrival = idArrival;
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

    public ArrivalAirports(String city, List<Connections> connectionsList) {
        this.city = city;
        this.connectionsList = connectionsList;
    }

    @Override
    public String toString() {
        return "ArrivalAirports{" +
                "idArrival=" + idArrival +
                ", city='" + city + '\'' +
                ", connectionsList=" + connectionsList +
                '}';
    }
}
