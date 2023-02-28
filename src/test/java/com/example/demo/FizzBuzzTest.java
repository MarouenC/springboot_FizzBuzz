package com.example.demo;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test 
    void Test(){
        FizzBuzzController c = new FizzBuzzController();
        List<String> n = c.FizzBuzz(15);

        List<String> expected = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
        assertEquals(expected, n);

    }
    @Test 
    void TestNegative(){
        FizzBuzzController c = new FizzBuzzController();
        List<String> n = c.FizzBuzz(-1);
        
        assertEquals(Collections.EMPTY_LIST, n);

    }
}
