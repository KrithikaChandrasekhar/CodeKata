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
        assertEquals("XL", RomanNumeralConverter.toRoman(40));
        assertEquals("L", RomanNumeralConverter.toRoman(50));
        assertEquals("XC", RomanNumeralConverter.toRoman(90));
        assertEquals("C", RomanNumeralConverter.toRoman(100));
        assertEquals("CD", RomanNumeralConverter.toRoman(400));
        assertEquals("D", RomanNumeralConverter.toRoman(500));
        assertEquals("CM", RomanNumeralConverter.toRoman(900));
        assertEquals("M", RomanNumeralConverter.toRoman(1000));
    }

    @Test
    public void testMaximumBoundary() {
        assertEquals("MMMCMXCIX", RomanNumeralConverter.toRoman(3999));
    }


}
