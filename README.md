# EasyBasket - Spring Boot Project

EasyBasket is a Spring Boot REST API project built using Java, Spring Boot, Spring Data JPA, Validation, Lombok, Swagger UI and Global Exception Handling.

This project contains:
- Product CRUD APIs
- User Registration APIs
- Validation for input fields
- DTO usage for request/response
- Global Exception Handling
- Swagger UI for API testing and documentation

---

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 Database (In-Memory)
- Lombok
- Spring Validation
- Spring Security (Basic Auth)
- Swagger UI (Springdoc OpenAPI)

---

##  Project Folder Structure
src/main/java/com/codesspace/EasyBasket/
│
├── controller/
│ ├── ProductController.java
│ └── UserController.java
│
├── dtos/
│ ├── Productdto.java
│ ├── RegisterProductRequest.java
│ ├── RegisterUserRequest.java
│ └── UserDto.java
│
├── model/
│ ├── Product.java
│ └── User.java
│
├── repository/
│ ├── ProductRepository.java
│ └── UserRepository.java
│
├── services/
│ ├── ProductService.java
│ └── UserService.java
│
├── exceptions/
│ └── GlobalExceptionHandler.java
│
├── config/
│ ├── SwaggerConfig.java
│ └── SecurityConfig.java
│
└── EasyBasketApplication.java

Run the Project:
./mvnw clean spring-boot:run

Database Used:
This project uses H2 in-memory database.

Spring Security Credentials:
In application.properties:
spring.security.user.name=admin
spring.security.user.password=admin123

Use these credentials in Swagger / Postman.

Swagger UI:
Swagger UI is enabled for API testing.
Swagger URL:
http://localhost:8080/swagger-ui/index.html

Validation:
Validation is applied on user registration fields.
Example:
Name cannot be empty
Email must be valid format
Password must be minimum 6 characters

If validation fails, error response looks like:
{
  "email": "Invalid email format",
  "password": "Password must be at least 6 characters"
}

