import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        assertEquals("0", FizzBuzz.fizzBuzz(0));
        assertEquals("1", FizzBuzz.fizzBuzz(1));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumbers() {
        FizzBuzz.fizzBuzz(-1);
    }

}
