package com.pz.project.TicketSelling.entity;

import javax.persistence.*;

@Entity
@Table(name="inters_plane_seat")
public class IntersPlaneSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinColumn(name = "id_plane")
    private Plane plane;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinColumn(name = "id_seat")
    private Seats seat;

    public IntersPlaneSeat(){}

    public IntersPlaneSeat(Plane plane, Seats seat) {
        this.plane = plane;
        this.seat = seat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Seats getSeat() {
        return seat;
    }

    public void setSeat(Seats seat) {
        this.seat = seat;
    }


    @Override
    public String toString() {
        return "IntersPlaneSeat{" +
                "id=" + id +
                ", plane=" + plane +
                ", seat=" + seat +
                '}';
    }
}
