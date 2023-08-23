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
import java.util.Optional;

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

    @Override
    public PropertyDTO updateProperty(PropertyDTO propertyDTO, Long propertyId) {
        Optional<PropertyEntity> propertyEntityOptional = propertyRepository.findById(propertyId);
        PropertyDTO dto = null;

        if (propertyEntityOptional.isPresent()) {
            PropertyEntity pe = propertyEntityOptional.get();

            pe.setTitle(propertyDTO.getTitle());
            pe.setAddress(propertyDTO.getAddress());
            pe.setOwnerEmail(propertyDTO.getOwnerEmail());
            pe.setOwnerName(propertyDTO.getOwnerName());
            pe.setPrice(propertyDTO.getPrice());
            pe.setDescription(propertyDTO.getDescription());

            dto = propertyConverter.entityToDto(pe);

            propertyRepository.save(pe);
        }

        return dto;
    }

    @Override
    public PropertyDTO updatePropertyDescription(PropertyDTO propertyDTO, Long propertyId) {
        Optional<PropertyEntity> propertyEntityOptional = propertyRepository.findById(propertyId);
        PropertyDTO dto = null;

        if (propertyEntityOptional.isPresent()) {
            PropertyEntity pe = propertyEntityOptional.get();

            pe.setDescription(propertyDTO.getDescription());

            dto = propertyConverter.entityToDto(pe);

            propertyRepository.save(pe);
        }

        return dto;
    }

    @Override
    public void deleteProperty(Long propertyId) {
        propertyRepository.deleteById(propertyId);
    }

}
