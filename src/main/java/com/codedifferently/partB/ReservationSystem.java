package com.codedifferently.partB;

public class ReservationSystem {
    private static int count = 1;
    private Integer id;
    private String date;
    private Ticket[] seats;

    public ReservationSystem(String date, Integer numberOfSeats){
        id = count++;
        this.date = date;
        this.seats = new Ticket[numberOfSeats];
    }

    public String showSeats(){
        StringBuilder builder = new StringBuilder();
        for(int x =0; x < seats.length; x++){
            int seatNumber = x+1;
            if (seats[x] == null) {
                builder.append(seatNumber + ")Open\n");
            }else{
                builder.append(seatNumber + ")Closed\n");
            }
        }
        return builder.toString();
    }

    public Ticket bookSeat(Integer seatNumber) throws OverlappingReservationException{
        if(seats[seatNumber] != null){
            throw new OverlappingReservationException();
        }
        Ticket ticket = new Ticket(seatNumber);
        seats[seatNumber] = ticket;
        return ticket;
    }
}
