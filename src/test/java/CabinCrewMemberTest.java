import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CabinCrewMemberTest {

     CabinCrewMember cabinCrewMember;

     @Before

     public void setUp(){
          cabinCrewMember = new CabinCrewMember("Ben", Rank.CAPTAIN);
     }

     @Test
     public void canGetName(){
          assertEquals("Ben", cabinCrewMember.getName());
     }
}
