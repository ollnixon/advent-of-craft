package games;

public class FizzBuzz {
    private FizzBuzz() {
    }
    
    public static String convert(Integer input) throws OutOfRangeException {

        if (input <= 0) throw new OutOfRangeException();

        if (input > 100) throw new OutOfRangeException();

        if (isDivisibleBy3and5(input)) {
            return "FizzBuzz";
        }
        if (isDivisibleBy3(input)) {
            return "Fizz";
        }
        if (isDivisibleBy5(input)) {
            return "Buzz";
        }

        return input.toString();
    }

    private static boolean isDivisibleBy5(Integer input) {
        return input % 5 == 0;
    }

    private static boolean isDivisibleBy3(Integer input) {
        return input % 3 == 0;
    }

    private static boolean isDivisibleBy3and5(Integer input) {
        return isDivisibleBy3(input) && isDivisibleBy5(input);
    }
}
