# Property Management System ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

## What is this Project ?

The concept behind this app is to study Spring Boot with Spring Web, Lombok, Spring Data JPA, and H2 Database.

## What did I learn ?

- Use Lombok instead of 'Getters & Setters' in the DTO/Model
- @RequestMapping is used to map web requests onto specific handler classes and/or handler methods
- @RequestBody must match the fields in the Model/DTO
- @ResponseEntity enables to send data from client to server (DataBody & Response Code)
- @Autowired is used to inject Implementations from Interfaces automatically (uses Dependecy Injection)
- Entity is used to hold the data in the Repository layer.
- Reviewed design patterns such as **Dependency Injection** and **Adaptor Pattern**

## Want to get the boilerplate ?

[Just click this link](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.7.14&packaging=jar&jvmVersion=17&groupId=com.sbpractice&artifactId=property-management&name=property-management&description=Spring%20Boot%20Basics%20-%20Property%20Management%20System&packageName=com.sbpractice.property-management&dependencies=web,lombok,data-jpa,h2).

## Development

### API Endpoint

#### Calculator

- **@GET: /api/v1/calculator/add** - Adds the value of two numbers.
- **@GET: /api/v1/calculator/subtract** - Subtracts the value of two numbers.
- **@POST: /api/v1/calculator/multiply** - Multiplies numbers based on the field and annotation stated on the
  CalculatorDTO.

#### Properties

- **@POST: /api/v1/properties/save** - Saves property with required title, and ownerEmail. Optional: description,
  ownerName, price, and address. ID Autoincrement.
- **@GET: /api/v1/properties** - Returns all property data in the database.
- **@PUT: /api/v1/properties/update/{propertyId}** - Full update a specific row given the PropertyDTO and propertyId (Just for the sake of using and reviewing @PUT method).
- **@PATCH: /api/v1/properties/update/description/{propertyId}** Partial update a specific row given the specific field
  to be updated and propertyId (Just for the sake of using and reviewing @PATCH method).
- **@DELETE: /api/v1/properties/delete/{propertyId}** - Delete a property by Id.

### Dependencies

- Maven
- Spring Boot 2.7.14
- Java 17
- Spring Web
- Lombok
- Spring Data JPA
- H2 Database

### Clone Project

```shell
https://github.com/celsodasecond/property-management.git
```

This Command will copy a full project to your local environment

