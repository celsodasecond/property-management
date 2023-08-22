package com.sbpractice.propertymanagement.controller;

import com.sbpractice.propertymanagement.dto.PropertyDTO;
import com.sbpractice.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/properties")
public class PropertyController {
    // Creates the instance of the class, PropertyService now has memory(points) to the PropertyServiceImpl
    @Autowired
    private PropertyService propertyService;
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @PostMapping("/save")
    public PropertyDTO saveProperty(@RequestBody PropertyDTO propertyDTO) {
        propertyService.saveProperty(propertyDTO);
        return propertyDTO;
    }
}
