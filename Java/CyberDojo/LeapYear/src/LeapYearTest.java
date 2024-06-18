import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LeapYearTest {
    @Test
    public void testLeapYear() {
        assertFalse(LeapYear.isLeapYear(2001));
        assertTrue(LeapYear.isLeapYear(2004));
        assertFalse(LeapYear.isLeapYear(2100));
        assertTrue(LeapYear.isLeapYear(2400));
    }
}
