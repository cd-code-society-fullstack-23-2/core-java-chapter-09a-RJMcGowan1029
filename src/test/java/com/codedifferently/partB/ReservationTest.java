package com.codedifferently.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ReservationTest {

    private Reservation reservation;
    @BeforeEach
    public void startUp(){
        reservation = new Reservation(1, 100.00);
    }
    @Test
    public void paymentTest01() throws PaymentFailureException {
        Double expected = 50.00;
        Double actual = reservation.amountPaid(50.00);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void paymentTest02() {
        Assertions.assertThrows(PaymentFailureException.class, () -> {
            reservation.amountPaid(150.00);
        });
    }
}
