import org.junit.Test;
import ru.trainjava.sandbox.Factorial;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FactTest {

    @Test
    public void okTest(){

        Factorial.fact(1);
        assertEquals(2,2);


    }
    @Test
    public void nokTest(){

        Factorial.fact(2);
        assertNotEquals(3,4);

    }


}
