package com.sbpractice.propertymanagement.service;

import com.sbpractice.propertymanagement.dto.PropertyDTO;

import java.util.List;

public interface PropertyService {

    PropertyDTO saveProperty(PropertyDTO propertyDTO);
    List<PropertyDTO> getAllProperty();
    PropertyDTO updateProperty(PropertyDTO propertyDTO, Long propertyId);
}
