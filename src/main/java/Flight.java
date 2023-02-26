import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CrewMember> crewMembers;
    private  ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private int totalWeightAllowance;
    private int totalSeatsAvailable;

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime, int totalWeightAllowance, int totalSeatsAvailable) {
        this.pilots = new ArrayList<>();
        this.crewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.totalWeightAllowance = totalWeightAllowance;
        this.totalSeatsAvailable = totalSeatsAvailable;

    }
    public int getSizeOfPassengerList(){
        return passengers.size();
    }
    public void addPassenger(Passenger passenger){
        if (canBookPassenger()) {
            this.passengers.add(passenger);
            removeAvailableSeat();
        }
    }

    public int numberOfAvailablePassengerSeats(){
        return totalSeatsAvailable;
    }

    public void removeAvailableSeat(){
        totalSeatsAvailable--;
    }

    public boolean canBookPassenger(){
        return totalSeatsAvailable > 0;
    }

}
