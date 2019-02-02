package com.pz.project.TicketSelling.dao;


import com.pz.project.TicketSelling.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

    List<Flight> findByFlightID(int flightID);
    List<Flight> findByPlanePlaneID(int id);
    List<Flight> findByConnectionConnectionID(int id);
    List<Flight> findByConnection_ConnectionID(int connection_connectionID);
    List<Flight> findByConnection_DepartureAirports_City(String connection_departureAirports_city);
    List<Flight> findByDepartureDateAndConnection_DepartureAirports_CityAndConnection_ArrivalAirports_City(String departureDate, String connection_departureAirports_city, String connection_arrivalAirports_city);

}
