# Juice Chain Backend
A RESTful backend built with **Spring Boot** that servers as the engine for theJuice chain kotlin application by 
managing inventory tracking, order tracking, basic analytics by offering secure endpoints thanks' to JWT and spring security.

--- 

## Key Features
* **Maintainable Layered Architecture:** Strict separation of concerns by following the Controller-Service-Repository pattern
* **Modern Data persistence layer:** configured with Spring DATA JPA for ORM and DB communication
* **Type-Safe Data Transfer (DTOs):** Separation of persistence models and network payloads using manual DTO mapping.
* **Global Exception Interception:** Centralized error handling via `@RestControllerAdvice` to capture specific exceptions and return safe JSON responses.
* **Stateless JWT Authentication:** implemented via `Spring Security` and JSON web Tokens (JWT) for secure and role based endpoint protection.

--- 

## Tech Stack & Architecture



| Layer / Component | Technology      | Brief description                                                              | 
|:------------------|:----------------|:-------------------------------------------------------------------------------|
| **Language**      | Java            | a staple secure language in Entreprise systems.                                |
| **Framework**     | Spring Boot     | the framework handling dependency injections and Components .                  |
| **Persistence**   | Spring Data JPA | the module that handles objcet relational mapping (ORM) and entity lifecycles. |

---

## Get started

follow these steps to get the app running on your device :

### Prerequisites
* JDK 17 or higher

