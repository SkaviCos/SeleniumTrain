import org.junit.Test;
import ru.trainjava.sandbox.Fibonacci;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FibonacciTest {

    @Test
    public void okTest(){
        Fibonacci.fib(3);
        assertEquals(2,2);
    }
    @Test
    public void nokTest(){
        Fibonacci.fib(3);
        assertNotEquals(3,2);
    }
}
