import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void setUp() {
        flight = new Flight("ABC123", "New York", "London", "2023-03-01 09:00", 5000, 2);
        passenger1 = new Passenger("James", 1);
        passenger2 = new Passenger("Nicola", 1);
        passenger3 = new Passenger("Angus", 1);
    }

    @Test
    public void canAddPassenger() {
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getSizeOfPassengerList());
    }

    @Test
    public void canBookPassengerOnFlight() {
        assertEquals(true, flight.canBookPassenger());
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getSizeOfPassengerList());
        assertEquals(true, flight.canBookPassenger());
        flight.addPassenger(passenger2);
        assertEquals(2, flight.getSizeOfPassengerList());
        assertEquals(false, flight.canBookPassenger());
    }

    @Test
    public void canNotBookPassengerOnFlight() {
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(false, flight.canBookPassenger());
        assertEquals(2, flight.getSizeOfPassengerList());
    }

    @Test
    public void numberOfAvailablePassengerSeats() {
        assertEquals(2, flight.numberOfAvailablePassengerSeats());
        flight.addPassenger(passenger1);
        assertEquals(1, flight.numberOfAvailablePassengerSeats());
        flight.addPassenger(passenger2);
        assertEquals(0, flight.numberOfAvailablePassengerSeats());
    }
}
