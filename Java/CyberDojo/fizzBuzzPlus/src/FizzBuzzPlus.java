public class FizzBuzzPlus {
    public static void main(String... args) {
        for (int number = 1; number <=100; number++)
            System.out.println(fizzBuzzPlus(number));
    }

    public static String fizzBuzzPlus(int number) {
        if (number < 0) throw new IllegalArgumentException("Number must be positive");
        if (number == 0) return "0";

        StringBuilder result = new StringBuilder();
        if (number % 3 == 0 || number % 10 == 3 || number / 10 == 3) result.append("Fizz");
        if (number % 5 == 0 || number / 10 == 5) result.append("Buzz");
        if (result.isEmpty()) result.append(number);

        String resultString = result.toString();
        if (resultString.equals("Fizz") || resultString.equals("Buzz") || resultString.equals("FizzBuzz"))
            return "..." + result + "...";
        else
            return resultString;
    }
}
