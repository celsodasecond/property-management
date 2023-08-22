package com.sbpractice.propertymanagement.service.impl;

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

    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
        PropertyEntity pe = new PropertyEntity();
        pe.setTitle(propertyDTO.getTitle());
        pe.setAddress(propertyDTO.getAddress());
        pe.setOwnerEmail(propertyDTO.getOwnerEmail());
        pe.setOwnerName(propertyDTO.getOwnerName());
        pe.setPrice(propertyDTO.getPrice());
        pe.setDescription(propertyDTO.getDescription());

        propertyRepository.save(pe);
        return null;
    }
}
