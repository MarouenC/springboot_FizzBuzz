package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class FizzBuzzController {
    @GetMapping("/fizzbuzz/{n}")
    public List<String> FizzBuzz (@PathVariable("n") Integer n ){
        List<String> numbers = new ArrayList<>();
        if(n<= 0) return numbers;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                numbers.add("FizzBuzz");
            } else if (i % 3 == 0) {
                numbers.add("Fizz");
            } else if (i % 5 == 0) {
                numbers.add("Buzz");
            } else {
                numbers.add(String.valueOf(i));
            }
        }
        return numbers;
    }
}
