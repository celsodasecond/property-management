package com.sbpractice.propertymanagement.service.impl;

import com.sbpractice.propertymanagement.converter.PropertyConverter;
import com.sbpractice.propertymanagement.dto.PropertyDTO;
import com.sbpractice.propertymanagement.entity.PropertyEntity;
import com.sbpractice.propertymanagement.repository.PropertyRepository;
import com.sbpractice.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;
    @Autowired
    private PropertyConverter propertyConverter;

    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
        PropertyEntity pe = propertyRepository.save(propertyConverter.dtoToEntity(propertyDTO));

        propertyDTO = propertyConverter.entityToDto(pe);

        return propertyDTO;
    }

    @Override
    public List<PropertyDTO> getAllProperty() {
        List<PropertyEntity> propertiesEntity = (List<PropertyEntity>) propertyRepository.findAll();
        List<PropertyDTO> propertiesDto = new ArrayList<>();

        for (PropertyEntity pe : propertiesEntity) {
            PropertyDTO dto = propertyConverter.entityToDto(pe);
            propertiesDto.add(dto);
        }

        return propertiesDto;
    }

}
