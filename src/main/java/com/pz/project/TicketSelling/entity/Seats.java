package com.pz.project.TicketSelling.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "seats")
public class Seats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private int seatID;


    @Column(name = "is_free")
    private boolean isFree;


    @OneToMany(mappedBy = "seat", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<IntersPlaneSeat> inters;

    public Seats() {

    }

    public Seats(boolean isFree) {
        this.isFree = isFree;
    }

    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

}
