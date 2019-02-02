package com.pz.project.TicketSelling.entity;


import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private int ticketID;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "ticket_cost")
    private double ticketCost;

    @Column(name = "seat")
    private int seat;

    @Column(name = "fromGo")
    private String fromGo;

    @Column(name = "toGo")
    private String toGo;

    @Column(name = "timeDep")
    private String timeDep;


    @Column(name = "timeArr")
    private String timeArr;

    @Column(name = "whenGo")
    private String whenGo;


    @Column(name = "whenBack")

    private String whenBack;


    public String getFromGo() {
        return fromGo;
    }

    public void setFromGo(String from) {
        this.fromGo = from;
    }

    public String getToGo() {
        return toGo;
    }

    public void setToGo(String to) {
        this.toGo = to;
    }

    public String getTimeDep() {
        return timeDep;
    }

    public void setTimeDep(String timeDep) {
        this.timeDep = timeDep;
    }

    public String getTimeArr() {
        return timeArr;
    }

    public void setTimeArr(String timeArr) {
        this.timeArr = timeArr;
    }
    public String getWhenGo() {
        return whenGo;
    }

    public void setWhenGo(String whenGo) {
        this.whenGo = whenGo;
    }

    public String getWhenBack() {

        return whenBack;
    }

    public void setWhenBack(String whenBack) {
        this.whenBack = whenBack;
    }




    public void setSeat(int seat) {
        this.seat = seat;
    }

    @ManyToOne

    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="flight_id")
    private Flight flight;


    public Ticket() {
    }

    public Ticket(String name, String surname, double ticketCost, int seat, String from, String to, String timeDep, String timeArr, String whenGo, String whenBack) {
        this.name = name;
        this.surname = surname;
        this.ticketCost = ticketCost;
        this.seat = seat;
        this.fromGo = from;
        this.toGo = to;
        this.timeDep = timeDep;
        this.timeArr = timeArr;
        this.whenGo = whenGo;
        this.whenBack = whenBack;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getSeat() {
        return seat;
    }
}
