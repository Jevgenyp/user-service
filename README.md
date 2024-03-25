# User Service

This is a Spring Boot application that provides user management functionality.

## Features

- User registration
- User authentication (login)
- User management (CRUD operations)

## Technologies

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- PostgreSQL
- JSON Web Token (JWT) for authentication
- Eureka for service discovery

## Setup

1. Clone the repository
2. Update the `application.properties` file with your database credentials
3. Run the application using `mvn spring-boot:run`

## API Endpoints

- `/api/users/register` - Register a new user
- `/api/users/login` - Authenticate a user
- `/api/users` - Get all users
- `/api/users/{id}` - Get, update, or delete a user by ID

## Contact

If you have any questions or suggestions, feel free to open an issue or submit a pull request.