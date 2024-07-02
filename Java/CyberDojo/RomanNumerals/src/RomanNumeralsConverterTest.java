import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsConverterTest {
    @Test
    public void testZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeralConverter.toRoman(0);
        });
        assertEquals("Roman numerals do not have a representation for zero", exception.getMessage());
    }

}
