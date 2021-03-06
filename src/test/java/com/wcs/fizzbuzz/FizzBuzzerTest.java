package com.wcs.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzerTest {

    private FizzBuzzer fizzBuzzer = new FizzBuzzer();

    @Test
    public void executeShouldReturnFizzIfTheNumberIsDividableBy3() {
        assertEquals("fizz", fizzBuzzer.execute(3));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy5() {
        assertEquals("buzz", fizzBuzzer.execute(5));
        assertEquals("buzz", fizzBuzzer.execute(10));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy15() {
        assertEquals("fizzbuzz", fizzBuzzer.execute(15));
        assertEquals("fizzbuzz", fizzBuzzer.execute(30));
    }

    @Test
    public void executeShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        assertEquals("1", fizzBuzzer.execute(1));
        assertEquals("2", fizzBuzzer.execute(2));
        assertEquals("4", fizzBuzzer.execute(4));
    }
    
    @Test
    public void executeShouldReturnWizzIfTheNumberIsDividableBy7() {
        assertEquals("wizz", fizzBuzzer.execute(7));
        assertEquals("wizz", fizzBuzzer.execute(14));
    }
    
    @Test
    public void executeShouldReturnFizzIfTheNumberContainsDigit3() {
        assertEquals("fizz", fizzBuzzer.execute(13));
        assertEquals("fizz", fizzBuzzer.execute(31));
    }
    
    @Test
    public void executeShouldReturnBuzzIfTheNumberContainsDigit5() {
        assertEquals("buzz", fizzBuzzer.execute(25));
        assertEquals("buzz", fizzBuzzer.execute(59));
    }
    
    @Test
    public void executeShouldReturnFizzBuzzIfTheNumberContainsDigits5And3() {
        assertEquals("fizzbuzz", fizzBuzzer.execute(53));
    }
    
    public void executeShouldReturnWizzIfTheNumberContainsDigit7() {
        assertEquals("wizz", fizzBuzzer.execute(17));
        assertEquals("wizz", fizzBuzzer.execute(47));
    }

}
