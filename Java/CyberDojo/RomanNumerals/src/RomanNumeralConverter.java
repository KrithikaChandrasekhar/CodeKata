public class RomanNumeralConverter {
    public static String toRoman(int number) {
        if (number <= 0) throw new IllegalArgumentException("Roman numerals do not have a representation for zero");
        StringBuilder result = new StringBuilder();
        String[] romanNumerals = new String[] {
                "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };
        int[] values = new int[] {
                1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };
        for (int index = 0; index < values.length; index++) {
            while (number >= values[index]) {
                result.append(romanNumerals[index]);
                number -= values[index];
            }
        }
        return result.toString();
    }
}
