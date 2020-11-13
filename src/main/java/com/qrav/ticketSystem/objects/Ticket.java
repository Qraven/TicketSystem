package com.qrav.ticketSystem.objects;


import javax.persistence.*;
import java.sql.Date;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passenger_id", referencedColumnName = "ID")
    private Passenger passenger;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "plane_id", referencedColumnName = "ID")
    private Plane plane;

    private Date departure;

    private Date arrival;


    public Integer getID() {
        return ID;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Plane getPlane() {
        return plane;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }
}
