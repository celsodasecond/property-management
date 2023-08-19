package com.sbpractice.propertymanagement.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {
    // http://localhost:8080/api/v1/calculator/add?num1=6.7&num2=1.3
    @GetMapping("/add")
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return num1 + num2;
    }

    // Another way - Map the values of url to java variables by Path Variable Method
    @GetMapping("/subtract/{num1}/{num2}")
    public Double subtract(@PathVariable("num1") Double num1,@PathVariable("num2") Double num2) {
        Double result = null;
        result = (num1 > num2)
                ? num1 - num2
                : num2 - num1;

        return result;
    }
}
