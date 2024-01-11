package GatewayTest.SteamTrip_GWT_2.Part_A;

import java.util.ArrayList;

public class Locomotive {
/**
 * You will need to modify this class to answer the questions in this Gateway Test
 * @author
 */


    private String locoName;
    private String locoClass;
    private String locoNumber;
    private ArrayList<SteamTrip> steamTrips = new ArrayList<SteamTrip>();



    public Locomotive(){

        this.locoName= "tbc";
        this.locoClass="tbc";
        this.locoNumber= "tbc";
        steamTrips= new ArrayList<SteamTrip>();
    }


    public String getLocoName() {
        return locoName;
    }

    public void setLocoName(String locoName) {
        this.locoName = locoName;
    }

    public String getLocoClass() {
        return locoClass;
    }

    public void setLocoClass(String locoClass) {
        this.locoClass = locoClass;
    }

    public String getLocoNumber() {
        return locoNumber;
    }

    public void setLocoNumber(String locoNumber) {
        this.locoNumber = locoNumber;
    }

    public ArrayList<SteamTrip> getSteamTrips() {
        return this.steamTrips;
    }

    public void setSteamTrips(ArrayList<SteamTrip> steamTrips) {
        this.steamTrips=steamTrips;
    }



    public int howManyTrips (){
        return steamTrips.size();
    }

}

