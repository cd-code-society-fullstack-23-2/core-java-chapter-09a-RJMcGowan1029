package com.codedifferently.partB;

public class Reservation {
    private static int idCount = 1;
    private Integer id;
    private Plane plane;
    private Integer seatNumber;
    private Double funds;


    public Reservation (Integer seatNumber, Double funds) {
        this.id = idCount++;
        this.seatNumber = seatNumber;
        this.funds = funds;
    }


    public String toString(){
        return "Seat number: " + (seatNumber +1);
    }

    public Double amountPaid(Double amount) throws PaymentFailureException{
        if(funds < amount){
            throw new PaymentFailureException();
        }
        return amount;
    }

}
