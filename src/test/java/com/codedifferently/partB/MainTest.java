package com.codedifferently.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {
    private ReservationSystem reservationSystem;

    @BeforeEach
    public void setUp(){
        reservationSystem = new ReservationSystem("Monday 6am", 5);
    }

    @Test
    public void showAvailableSeatsTest01(){
        String expected ="1)Open\n2)Open\n3)Open\n4)Open\n5)Open\n";
        String actual = reservationSystem.showSeats();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bookSeatTest01() throws OverlappingReservationException{
        Ticket ticket = reservationSystem.bookSeat(1);
        String expected = "Seat number: 2";
        String actual = ticket.toString();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bookSeatTest02(){
        Assertions.assertThrows(OverlappingReservationException.class, ()->{
            reservationSystem.bookSeat(1);
            reservationSystem.bookSeat(1);
        });
    }

}
