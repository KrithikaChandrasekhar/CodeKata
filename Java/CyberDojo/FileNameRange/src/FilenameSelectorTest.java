import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilenameSelectorTest {
    @Test
    void testNoExtension() {
        FilenameSelector selector = new FilenameSelector();
        assertArrayEquals(new int []{0, 5}, selector.selectRange("hiker"));
    }

    @Test
    void testWithExtension() {
        FilenameSelector selector = new FilenameSelector();
        assertArrayEquals(new int[] {0, 5}, selector.selectRange("hiker.cpp"));
    }

    @Test
    void testWithKeyword() {
        FilenameSelector selector = new FilenameSelector();
        assertArrayEquals(new int[] {0, 5}, selector.selectRange("hikerTest.js"));
    }

    @Test
    void testInDirectory() {
        FilenameSelector selector = new FilenameSelector();
        assertArrayEquals(new int[] {4, 9}, selector.selectRange("src/hiker.cpp"));
    }

    @Test
    void testWithMultipleSeparatorsAndKeywords() {
        FilenameSelector selector = new FilenameSelector();
        assertArrayEquals(new int[] {0, 10}, selector.selectRange("fizz.buzz-tests.js"));
    }

    @Test
    void testEdgeCases() {
        FilenameSelector selector = new FilenameSelector();
        assertArrayEquals(new int[] {0, 0}, selector.selectRange(""));
        assertArrayEquals(new int[] {0, 1}, selector.selectRange("."));
        assertArrayEquals(new int[] {0, 1}, selector.selectRange(".."));
    }
}
