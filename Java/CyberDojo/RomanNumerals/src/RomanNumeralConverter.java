public class RomanNumeralConverter {
    public static String toRoman(int number) {
        if (number <= 0) throw new IllegalArgumentException("Roman numerals do not have a representation for zero");
        StringBuilder result = new StringBuilder();
        if (number >= 10) {
            result.append("X");
            number -= 10;
        }
        if (number >= 9) {
            result.append("IX");
            number -= 9;
        }
        if (number >= 5) {
            result.append("V");
            number -= 5;
        }
        if (number == 4) {
            result.append("IV");
            number -= 4;
        }
        if (number < 4) {
            for (int index = 0; index < number; index++)
                result.append("I");
        }
        return result.toString();
    }
}
