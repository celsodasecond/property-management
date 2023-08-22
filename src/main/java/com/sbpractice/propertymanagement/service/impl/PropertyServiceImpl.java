package com.sbpractice.propertymanagement.service.impl;

import com.sbpractice.propertymanagement.dto.PropertyDTO;
import com.sbpractice.propertymanagement.service.PropertyService;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
        System.out.println("propertyDTO: " + propertyDTO);
        return null;
    }
}
