public class FizzBuzz {
    public static void main(String... args) {
        for(int number = 1; number <= 100; number++)
            System.out.println(fizzBuzz(number));
    }
    public static String fizzBuzz(int number) {
        if (number < 0) throw new IllegalArgumentException("Number must be positive");
        if (number == 0) return "0";
        StringBuilder result  = new StringBuilder();
        if (number % 3 == 0) result.append("Fizz");
        if (number % 5 == 0) result.append("Buzz");
        if (result.isEmpty()) result.append(number);
        return result.toString();

    }
}
