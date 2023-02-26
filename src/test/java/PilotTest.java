import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class PilotTest {

    Pilot pilot;
    Pilot pilot2;

    @Before

    public void setUp(){
        pilot = new Pilot("Ben", Rank.FIRST_OFFICER, "Trainee");
        pilot = new Pilot("james", Rank.CAPTAIN, "12346");
    }

    @Test
    public void canfly(){
        assertEquals("Plane is flying", pilot.flyPlane());
    }
}
