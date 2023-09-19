package com.codedifferently.partB;

public class Plane {
    private static int planeCount = 1;
    private Integer id;
    private String date;
    private String originAndDestination;
    private String departureAndArrival;

    private FlightType flightType;
    private Ticket[] seats;

    public Plane(String date, String originAndDestination, String departureAndArrival, Integer numOfSeats){
        this.date = date;
        id = planeCount++;
        this.originAndDestination = originAndDestination;
        this.departureAndArrival = departureAndArrival;
        this.seats = new Ticket[numOfSeats];
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Plane ").append(id).append("\n").append(date).append(" ").append(originAndDestination).append(" ").append(departureAndArrival);

        return builder.toString();
    }





}

