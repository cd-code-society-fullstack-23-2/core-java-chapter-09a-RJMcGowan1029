package com.codedifferently.partB;

import java.util.Scanner;

public class Main {

    public void displaySeats(ReservationSystem reservationSystem){
        String seats = reservationSystem.showSeats();
        System.out.println(seats);
    }
    public void displayPlane(Plane plane){
        String seats = plane.toString();
        System.out.println(seats);
    }

    public void run(){
        Reservation reservation = new Reservation(1, 0.00);
        ReservationSystem reservationSystem = new ReservationSystem("Monday", 5);
        Plane plane = new Plane("Monday", "PHI to CHI", "5:00 am - 7:23 am",5 );
        Scanner scanner = new Scanner(System.in);
        Boolean currentlyRunning = true;

        while (currentlyRunning){
            System.out.println("Baron Air Departments \nPlease select an option");
            System.out.println("1.) Display Planes");
            System.out.println("2.) Display Seating");
            System.out.println("3.) Book Ticket");
            System.out.println("0.) Exit");

            int userOption = scanner.nextInt();
            scanner.nextLine();

            switch (userOption){
                case 0:
                    currentlyRunning = false;
                    break;
                case 1:
                    displayPlane(plane);
                    break;
                case 2:
                    displaySeats(reservationSystem);
                    break;
                case 3:
                    System.out.println("Please select an available seat");
                    int option = scanner.nextInt();
                    try {
                        reservationSystem.bookSeat(option);
                    }
                    catch (OverlappingReservationException e){
                        System.out.println("Im pretty sure i said available🤨");
                    }
                    try {
                        reservation.amountPaid(50.0);
                        System.out.println("Payment Successful");
                    }
                    catch (PaymentFailureException e){
                        System.out.println("Broke Ahh");
                        System.exit(1);
                    }
                    break;


                default:
                    System.out.println("Not a good pick fam");
                    break;
            }
            System.out.println("Have a nice day");
        }



//        try{
//            reservation.amountPaid(50.00);
//            System.out.println("Payment was successful \nEnjoy ur flight :)");
//        }
//        catch (PaymentFailureException e){
//            System.out.println("Get ya money up broke boy");
//        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
