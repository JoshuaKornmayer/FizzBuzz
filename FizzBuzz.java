package FizzBuzz;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzz {
    public String execute(int[] numbers) {
        // Creating a sequence from each member of our array, passing it as a parameter
        // of our processNumber() method and then collect the output and join them
        // together separated by a comma
        return Arrays.stream(numbers).mapToObj(this::processNumber).collect(Collectors.joining(", "));
    }

    public String processNumber(int number) {
        if (ismultipleOf3(number) && isMultipleOf5(number)) {
            return "Fizz Buzz";
        } else if (ismultipleOf3(number)) { // if number is divisible by 3, remainder will be zero
            return "Fizz";
        } else if (isMultipleOf5(number)) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }

    private boolean ismultipleOf3(int number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }
}