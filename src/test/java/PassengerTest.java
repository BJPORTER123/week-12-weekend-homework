import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class PassengerTest {

    Passenger passenger;

    @Before

    public void setUp(){
        passenger = new Passenger("Ben", 1);
    }

    @Test
    public void canGetName(){
        assertEquals(1, passenger.getNumberOfBags());
    }
}