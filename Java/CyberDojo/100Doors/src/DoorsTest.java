import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DoorsTest {
    @Test
    public void testInitialDoorsStates() {
        Doors doors  = new Doors(100);
        boolean[] expected = new boolean[100];
        assertArrayEquals(expected, doors.getDoorsState());
    }

    @Test
    public void testDoorsStateAfterFirstToggle() {
        Doors doors = new Doors(100);
        doors.toggleOnce();
        boolean[] expected = new boolean[100];
        for (int door = 0; door < 100;  door++)
            expected[door] = true;
        assertArrayEquals(expected, doors.getDoorsState());
    }

    @Test
    public void testDoorsStateAfterHundredthPass() {
        Doors doors = new Doors(100);
        doors.toggleHundredth();
        boolean[] expected = new boolean[100];
        for (int door  = 0; door < 100; door++) {
            int doorNumber = door + 1;
            expected[door] = (Math.sqrt(doorNumber) % 1 == 0);
        }
        assertArrayEquals(expected, doors.getDoorsState());
    }

    @Test
    public void testNegativeNumberOfDoors() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Doors(-1);
        });
    }

    @Test
    public void testInterface() {
        Doors doors = new Doors(10);
        doors.toggleHundredth();
        boolean[] expected = {true, false, false, true, false, false, false, false, true, false };
        assertArrayEquals(expected, doors.getDoorsState());
    }

}
