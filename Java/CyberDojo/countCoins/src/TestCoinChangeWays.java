import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestCoinChangeWays {
    @Test
    public void testZeroCents() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CoinChangeWays.countWaysToMakeChange(0);
        });
        assertEquals("Input cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testOneCent() {
        int ways = CoinChangeWays.countWaysToMakeChange(1);
        assertEquals(1, ways);
    }

    @Test
    public void testFiveCents() {
        int ways = CoinChangeWays.countWaysToMakeChange(5);
        assertEquals(2, ways);
    }

    @Test
    public void testFifteenCents() {
        int ways = CoinChangeWays.countWaysToMakeChange(15);
        assertEquals(6, ways);
    }

    @Test
    public void testOneDollar() {
        int ways = CoinChangeWays.countWaysToMakeChange(100);
        assertEquals(242, ways);
    }

}
