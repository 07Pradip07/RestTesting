package com.example.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {

    // if number divisible by 3 ,print fizz
    //if by 5 print buzz
    //if 3 and 5 print fizz buzz
    //if not by 3or5 print number
    @DisplayName("Divisible By Three")
    @Test
    void testForDivisibleByThree() {
        String expected = "Fizz";
        Assertions.assertEquals(expected, FizzBuzz.compute(3), "Should return Fizz");
    }
    @DisplayName("Divisible By Five")
    @Test
    void testForDivisibleByFive() {
        String expected = "Buzz";
        Assertions.assertEquals(expected, FizzBuzz.compute(5), "Should return Buzz");
    }
    @DisplayName("Divisible By Three And Five")
    @Test
    void testForDivisibleByThreeAndFive() {
        String expected = "FizzBuzz";
        Assertions.assertEquals(expected, FizzBuzz.compute(15), "Should return FizzBuzz");
    }
    @DisplayName("Not Divisible By Three or Five")
    @Test
    void testForNotDivisibleByThreeOrFive() {
        String expected = "16";
        Assertions.assertEquals(expected, FizzBuzz.compute(16), "Should return 1");
    }

    @DisplayName("Testing with csv data")
    @ParameterizedTest(name = "value{0},expected{1}")
    @CsvSource({"1,1","2,2","3,Fizz","4,4","5,Buzz","6,Fizz","7,7"})
    void testCsvData(int value,String expected){
        Assertions.assertEquals(expected,FizzBuzz.compute(value));
    }
}
