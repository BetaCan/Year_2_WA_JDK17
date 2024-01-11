package GatewayTest.SteamTrip_GWT_2.Part_A;

public class Main{
// This class is for testing your code before submitting
    // There is some test code for the provided SteamTrip class
// You can modify this class

    public static void main(String[] args)
    {
        // Test SteamTrip default constructor
        SteamTrip st0 = new SteamTrip();
        System.out.println(st0);
        // Test SteamTrip Parameterised constructor
        SteamTrip st1 = new SteamTrip("Surbiton Flyer", 75);
        System.out.println(st1);
        // Test seatsAvailable
        System.out.println("Seats Available:" + st1.seatsAvailable());
        // Test book Seat
        System.out.println("Book Seat:" +  st1.bookSeat());
        System.out.println("Seats Available:" + st1.seatsAvailable());
        System.out.println("Seats Booked:" + st1.getSeatsBooked());
        // Test setSeatsBooked over seats
        st1.setSeatsBooked(st1.getSeats() + 1);
        System.out.println("Seats Booked:" + st1.getSeatsBooked());
        System.out.println("Seats Available:" + st1.seatsAvailable());
        // Test setSeatsBooked to seats
        st1.setSeatsBooked(st1.getSeats());
        System.out.println("Book Seat:" +  st1.bookSeat());
        System.out.println("Seats Booked:" + st1.getSeatsBooked());
        System.out.println("Seats Available:" + st1.seatsAvailable());
        System.out.println(st1);

    }
}


