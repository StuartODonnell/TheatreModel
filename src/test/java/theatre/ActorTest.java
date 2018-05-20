package theatre;

import org.junit.Before;
import org.junit.Test;
import theatre.models.Actor;

import static org.junit.Assert.assertEquals;

public class ActorTest {

    Actor actor;


    @Before
    public void before(){
        actor = new Actor("Emma Thomson", 200.00);
    }

    @Test
    public void canGetActorName(){
        assertEquals("Emma Thomson", actor.getName());
    }


    @Test
    public void canGetDayRate(){
        assertEquals(200.00, actor.getDayRate(), 0.1);
    }

}
