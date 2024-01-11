package GatewayTest.SteamTrip_GWT_2.Part_A;

/**
 *
 * @author dlivi
 */
public class SteamTrip
{

    private String tripName;

    private int seats;

    private int seatsBooked;

    public SteamTrip()
    {
        this.tripName = "Unknown";
        this.seats = 0;
        this.seatsBooked = 0;
    }

    public SteamTrip(String tripName, int seats)
    {
        this.tripName = tripName;
        this.seats = seats;
        this.seatsBooked = 0;
    }

    public boolean bookSeat()
    {
        if (seatsAvailable())
        {
            seatsBooked++;
            return true;
        }
        return false;
    }

    public boolean seatsAvailable()
    {
        return (seats>seatsBooked);
    }
    /**
     * Get the value of seatsBooked
     *
     * @return the value of seatsBooked
     */
    public int getSeatsBooked()
    {
        return seatsBooked;
    }

    /**
     * Set the value of seatsBooked
     *
     * @param seatsBooked new value of seatsBooked
     */
    public void setSeatsBooked(int seatsBooked)
    {
        if (seatsBooked <= seats)
        {
            this.seatsBooked = seatsBooked;
        }

    }

    /**
     * Get the value of seats
     *
     * @return the value of seats
     */
    public int getSeats()
    {
        return seats;
    }

    /**
     * Set the value of seats
     *
     * @param seats new value of seats
     */
    public void setSeats(int seats)
    {
        this.seats = seats;
    }

    /**
     * Get the value of tripName
     *
     * @return the value of tripName
     */
    public String getTripName()
    {
        return tripName;
    }

    /**
     * Set the value of tripName
     *
     * @param tripName new value of tripName
     */

    public void setTripName(String tripName)
    {
        this.tripName = tripName;
    }
    /**
     * Return a String representation of a Steam Trip in comma delimited forrmat
     *
     * @return a comma-delimited format of a SteamTrip
     */
    public String toString()
    {
        return this.tripName + "," + this.seats + "," + this.seatsBooked;
    }
}

