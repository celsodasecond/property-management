package com.sbpractice.propertymanagement.controller;

import com.sbpractice.propertymanagement.dto.PropertyDTO;
import com.sbpractice.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<PropertyDTO> saveProperty(@RequestBody PropertyDTO propertyDTO) {
        propertyDTO = propertyService.saveProperty(propertyDTO);

        return new ResponseEntity<>(propertyDTO, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<PropertyDTO>> getAllProperties() {
        List<PropertyDTO> propertyList = propertyService.getAllProperty();

        return new ResponseEntity<>(propertyList, HttpStatus.ACCEPTED);
    }
}
