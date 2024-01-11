package GatewayTest.SteamTrip_GWT_2.Part_B.Gold;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Challenge
{
    // do not modify the steamTrips attribute
    private static ArrayList<SteamTrip> steamTrips = new ArrayList();

    public static void createSteamTrips()
    {
        // implement your code here for gold

        try {
            BufferedReader file = new BufferedReader(new FileReader("/myfiles/japi-io/SteamTrips.txt"));

            String line;

            while ((line = file.readLine()) != null) {

                String[] store = line.split(",");
                SteamTrip s=new SteamTrip(store[0],store[1],store[2]);
                steamTrips.add(s);
            }

            file.close();

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
    // do not modify the steamTrips getter
    public static ArrayList<SteamTrip> getSteamTrips()
    {
        return steamTrips;
    }

}