package GatewayTest.SteamTrip_GWT_2.Part_B.Gold;

import java.util.ArrayList;
public class Main
{

    public static void main(String[] args)
    {
        // Gold
        Challenge.createSteamTrips();
        System.out.println(Challenge.getSteamTrips());
        // expected console output for gold
        // [SteamTrip{tripName=Surbiton Flyer, seats=75, seatsBooked=42}, SteamTrip{tripName=York Express, seats=100, seatsBooked=85}, SteamTrip{tripName=Waterloo Sunset, seats=80, seatsBooked=36}, SteamTrip{tripName=Night RAT, seats=64, seatsBooked=64}]

    }
}