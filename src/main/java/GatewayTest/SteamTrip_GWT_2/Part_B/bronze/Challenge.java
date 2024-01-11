package GatewayTest.SteamTrip_GWT_2.Part_B.bronze;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Challenge
{


   public static void  printSteamTripFile() {

       // reading all the lines in a text
        try {
            BufferedReader file = new BufferedReader(new FileReader("/myfiles/japi-io/SteamTrips.txt"));

            String line;

            while ((line = file.readLine()) != null) {

                System.out.println(line);
            }

            file.close();

        } catch (
                IOException e) {
            e.printStackTrace();
        }



    }
}
