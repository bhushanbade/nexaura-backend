### Nexaura Backend
#AI-Powered Decision Intelligence Platform
> A production-oriented backend application built using Java and Spring Boot while following enterprise backend development practices.

# Project Status
~Currently under active development.
~Completed through Sprint 13.

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
```
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
|── config
├── controller
├── dto
├── entity
├── exception
├── mapper
├── repository
├── security
├── service
└── BackendApplication

# Current APIs

# Health API

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/health` | Check if the backend is running |


# Decision APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/decisions` | Create a new decision |
| GET | `/decisions/{id}` | Get a decision by ID |
| GET | `/decisions` | Get all decisions (pagination supported) |
| PUT | `/decisions/{id}` | Update a decision |
| DELETE | `/decisions/{id}` | Delete a decision |
| GET | `/decisions/status/{status}` | Get decisions by status |
| GET | `/decisions/search?title={title}` | Search decisions by title |

# User APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/users` | Register a new user |
| GET | `/users` | Get all users |
| GET | `/users/{id}` | Get a user by ID |
| PUT | `/users/{id}` | Update user details |
| DELETE | `/users/{id}` | Delete a user |
| GET | `/users/{id}/decisions` | Get all decisions of a specific user |


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
| Sprint  | Status | Topics |
|---------|--------|-------------------------------------------|
| Sprint 1 | ✅ | Spring Boot Setup & Project Initialization |
| Sprint 2 | ✅ | Global Exception Handling |
| Sprint 3 | ✅ | JPA, Hibernate & MySQL Integration |
| Sprint 4 | ✅ | DTO Pattern & Mapper Pattern |
| Sprint 5 | ✅ | Bean Validation |
| Sprint 6 | ✅ | Read APIs (GET All, GET By ID) |
| Sprint 7 | ✅ | Update API (PUT) |
| Sprint 8 | ✅ | Delete API (DELETE) |
| Sprint 9 | ✅ | Pagination & Sorting |
| Sprint 10 | ✅ | Search & Filtering |
| Sprint 11 | ✅ | User Module & CRUD APIs |
| Sprint 12 | ✅ | Entity Relationships (One-to-Many & Many-to-One) |
| Sprint 13 | ✅ | Spring Security Fundamentals |
| Sprint 14 | ⏳ | JWT Authentication |
| Sprint 15 | ⏳ | Role-Based Authorization |
| Sprint 16 | ⏳ | API Response Standardization |
| Sprint 17 | ⏳ | Logging & Monitoring |
| Sprint 18 | ⏳ | Unit Testing (JUnit & Mockito) |
| Sprint 19 | ⏳ | Integration Testing |
| Sprint 20 | ⏳ | Swagger / OpenAPI Documentation |
| Sprint 21 | ⏳ | Database Migration (Flyway) |
| Sprint 22 | ⏳ | Docker & Environment Configuration |
| Sprint 23 | ⏳ | Decision Intelligence Engine |
| Sprint 24 | ⏳ | AI Recommendation Engine |
| Sprint 25 | ⏳ | Production Deployment |

                    
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
- [x] Validation
- [x] CRUD Operations
- [ ] Authentication
- [ ] Swagger
- [ ] Docker
- [ ] Deployment

# Author
**Bhushan Bade**
Aspiring Software Engineer
Focused on Java Backend Development with Spring Boot
