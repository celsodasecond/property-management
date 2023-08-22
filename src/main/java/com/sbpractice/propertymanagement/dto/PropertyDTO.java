package com.sbpractice.propertymanagement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropertyDTO {

    private String title;
    private String description;
    private String ownerName;
    private String ownerEmail;
    private Double price;
    private String address;

    @Override
    public String toString() {
        return "PropertyDTO{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ownerEmail='" + ownerEmail + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                '}';
    }

    //    We can use Lombok instead of Getters and Setters.
}
