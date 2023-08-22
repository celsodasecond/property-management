package com.sbpractice.propertymanagement.service.impl;

import com.sbpractice.propertymanagement.converter.PropertyConverter;
import com.sbpractice.propertymanagement.dto.PropertyDTO;
import com.sbpractice.propertymanagement.entity.PropertyEntity;
import com.sbpractice.propertymanagement.repository.PropertyRepository;
import com.sbpractice.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;
    @Autowired
    private PropertyConverter propertyConverter;

    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {


        propertyRepository.save(propertyConverter.dtoToEntity(propertyDTO));
        return null;
    }
}
