package FizzBuzz;

public class FizzBuzz {
    public void execute() {

    }

    public String processNumber(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Fizz Buzz";
        } else if (number % 3 == 0) { // if number is divisible by 3, remainder will be zero
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }
}