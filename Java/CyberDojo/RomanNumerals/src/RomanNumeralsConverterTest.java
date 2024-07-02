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

    @Test
    public void testNumeraltoRomanConversion() {
        assertEquals("I", RomanNumeralConverter.toRoman(1));
        assertEquals("II", RomanNumeralConverter.toRoman(2));
        assertEquals("III", RomanNumeralConverter.toRoman(3));
        assertEquals("IV", RomanNumeralConverter.toRoman(4));
        assertEquals("V", RomanNumeralConverter.toRoman(5));
        assertEquals("VI", RomanNumeralConverter.toRoman(6));
        assertEquals("IX", RomanNumeralConverter.toRoman(9));
        assertEquals("X", RomanNumeralConverter.toRoman(10));
    }


}
