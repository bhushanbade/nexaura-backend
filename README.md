### Nexaura Backend
#AI-Powered Decision Intelligence Platform
> A production-oriented backend application built using Java and Spring Boot while following enterprise backend development practices.

# Project Status
~Currently under active development.
~Completed through Sprint 4.

# About
Nexaura is an AI-powered Decision Intelligence Platform designed to help users make smarter decisions through structured analysis and intelligent recommendations.
This repository contains the backend application built with Spring Boot following a clean layered architecture.
The project is being developed incrementally using sprint-based development to simulate a real software engineering workflow.

# Current Features
- RESTful APIs using Spring Boot
- Layered Architecture
- Spring Data JPA
- Hibernate ORM
- MySQL Integration
- DTO Pattern
- Mapper Pattern
- Global Exception Handling
- Decision Creation API
- Git & GitHub Version Control

# Tech Stack
| Technology      | Purpose              |
| --------------- | -------------------- |
| Java 21         | Programming Language |
| Spring Boot     | Backend Framework    |
| Spring Data JPA | Data Access          |
| Hibernate       | ORM                  |
| MySQL           | Database             |
| Maven           | Build Tool           |
| Git             | Version Control      |
| GitHub          | Source Code Hosting  |
| Postman         | API Testing          |

# Architecture
```text
                Client
                   │
                   ▼
            Controller
                   │
                   ▼
              Service
                   │
                   ▼
              Mapper
                   │
                   ▼
            Repository
                   │
                   ▼
             Hibernate ORM
                   │
                   ▼
             MySQL Database
```
             
# Folder Structure             
backend
│
├── controller
├── dto
├── entity
├── exception
├── mapper
├── repository
├── service
└── BackendApplication

# Current APIs
| Method | Endpoint     | Description       |
| ------ | ------------ | ----------------- |
| GET    | /health      | Health check      |
| POST   | /decisions   | Create a decision |


# Running Locally

> git clone https://github.com/bhushanbade/nexaura-backend.git
cd backend
mvn spring-boot:run

# Database
| Property      | Value |
|---------------|-------|
| Database      | MySQL |
| Database Name | nexaura |

# Sprint Progress
| Sprint   | Status | Topics             |
| -------- | ------ | ------------------ |
| Sprint 1 |   ✅   | Spring Boot Setup  |
| Sprint 2 |   ✅   | Exception Handling |
| Sprint 3 |   ✅   | Entity & JPA       |
| Sprint 4 |   ✅   | DTO & Mapper       |
| Sprint 5 |   🚧   | Validation         |

# Project Goals
- Learn enterprise backend development
- Build production-style REST APIs
- Apply clean architecture principles
- Follow sprint-based development
- Prepare for software engineering internships

# Roadmap

- [x] Spring Boot Setup
- [x] Exception Handling
- [x] Decision API
- [x] DTO & Mapper
- [ ] Validation
- [ ] CRUD Operations
- [ ] Authentication
- [ ] Swagger
- [ ] Docker
- [ ] Deployment

# Author
**Bhushan Bade**
Aspiring Software Engineer
Focused on Java Backend Development with Spring Boot
