import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzPlusTest {
    @Test
    public void testFizzBuzzPlus() {
        assertEquals("0", FizzBuzzPlus.fizzBuzzPlus(0));
        assertEquals("1", FizzBuzzPlus.fizzBuzzPlus(1));
        assertEquals("...Fizz...", FizzBuzzPlus.fizzBuzzPlus(3));
        assertEquals("...Fizz...", FizzBuzzPlus.fizzBuzzPlus(13));
        assertEquals("...Fizz...", FizzBuzzPlus.fizzBuzzPlus(31));
        assertEquals("...Buzz...", FizzBuzzPlus.fizzBuzzPlus(5));
        assertEquals("...Buzz...", FizzBuzzPlus.fizzBuzzPlus(10));
        assertEquals("...Buzz...", FizzBuzzPlus.fizzBuzzPlus(52));
        assertEquals("...FizzBuzz...", FizzBuzzPlus.fizzBuzzPlus(15));
        assertEquals("...FizzBuzz...", FizzBuzzPlus.fizzBuzzPlus(30));
    }

    @Test
    public void testException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzzPlus.fizzBuzzPlus(-1);
        });
        assertEquals("Number must be positive", exception.getMessage());
    }
}
