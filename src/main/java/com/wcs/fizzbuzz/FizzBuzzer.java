package com.wcs.fizzbuzz;

public class FizzBuzzer {
    
    public String execute(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "fizz";
        }
        if (number % 5 == 0) {
            result += "buzz";
        }
        if (number % 7 == 0) {
            result += "wizz";
        }
        if (result.isEmpty()) {
            result = Integer.toString(number);
        }
        return result;
    }
    
}
