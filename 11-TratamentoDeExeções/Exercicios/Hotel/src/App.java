import java.util.Scanner;

import Model.Entities.Reservation;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);

       Reservation re = new Reservation();

       System.out.println( "Room number: ");
       int num = sc.nextInt();

       System.out.println( "Check-in date (dd/MM/yyyy): ");
       Date checkIn = sc.nextInt();

       System.out.println( "Check-out date (dd/MM/yyyy): ");
       Date checkOut = sc.nextInt();

       

    }
}
