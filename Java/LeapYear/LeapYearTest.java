public class LeapYearTest {
    public static void main(String[] args) {
        assert !LeapYear.isLeapYear(2001);
        assert LeapYear.isLeapYear(2004);
        assert !LeapYear.isLeapYear(2100);
        assert LeapYear.isLeapYear(2400);
    }
}
