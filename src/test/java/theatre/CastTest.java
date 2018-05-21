package theatre;

import org.junit.Before;
import org.junit.Test;
import theatre.models.Actor;
import theatre.models.Cast;
import theatre.models.Play;

import static org.junit.Assert.assertEquals;

public class CastTest {

    Cast cast;
    Actor actor;

    @Before
    public void before(){
        actor = new Actor("Emma Thomson", 200.00);
        cast = new Cast();

    }

    @Test
    public void canGetActorName(){
        assertEquals("Emma Thomson", actor.getName());
    }


    @Test
    public void canGetDayRate(){
        assertEquals(200.00, actor.getDayRate(), 0.1);
    }

//    @Test
//    public void castArrayStartsEmpty(){
//        assertEquals(0, cast.countActorsInCast());
//    }
}
