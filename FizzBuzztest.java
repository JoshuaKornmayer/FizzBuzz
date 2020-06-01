package FizzBuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzztest {

    @Test
    public void test() {

    }

    @Test
    public void shouldprocessInput() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.processNumber(1));
        assertEquals("2", fizzBuzz.processNumber(2));
        assertEquals("Fizz", fizzBuzz.processNumber(3));
    }
}