package com.sbpractice.propertymanagement.controller;

import com.sbpractice.propertymanagement.dto.CalculatorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public Double subtract(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
        Double result = null;
        result = (num1 > num2)
                ? num1 - num2
                : num2 - num1;

        return result;
    }

    // Using POST instead of GET to hide data in the url
    // Important for sensitive data
    @PostMapping("/multiply")
    public ResponseEntity<Double> multiply(@RequestBody CalculatorDTO calculatorDTO) {
        Double result = null;
        result = calculatorDTO.getNum1() * calculatorDTO.getNum2() * calculatorDTO.getNum3() * calculatorDTO.getNum4();
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}
