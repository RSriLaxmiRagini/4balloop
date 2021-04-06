package com.gradle.tutorial;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzprocessorTest {
    @Test
    public void FizzBuzzNormalNumbers() {

        FizzBuzzprocessor fb = new FizzBuzzprocessor();
        Assertions.assertEquals("1", fb.convert(1));
        Assertions.assertEquals("2", fb.convert(2));
    }

    @Test
    public void FizzBuzzThreeNumbers() {

        FizzBuzzprocessor fb = new FizzBuzzprocessor();
        Assertions.assertEquals("Fizz", fb.convert(3));
    }

    @Test
    public void FizzBuzzFiveNumbers() {

        FizzBuzzprocessor fb = new FizzBuzzprocessor();
        Assertions.assertEquals("Buzz", fb.convert(5));
    }

    @Test
    public void FizzBuzzThreeAndFiveNumbers() {

        FizzBuzzprocessor fb = new FizzBuzzprocessor();
        Assertions.assertEquals("Buzz", fb.convert(5));
    }

}