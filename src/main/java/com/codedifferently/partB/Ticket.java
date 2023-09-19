package com.codedifferently.partB;

public class Ticket {
    private static int idCount = 1;
    private Integer id;
    private Plane plane;
    private Integer seatNumber;
    private Double funds = 0.0;


    public Ticket (Integer seatNumber) {
        this.id = idCount++;
        this.seatNumber = seatNumber;
    }



    public String toString(){
        return "Seat number: " + (seatNumber +1);
    }

}
