# MIS Invoice System

A secure backend application built using **Java Spring Boot** that provides user registration, login, and JWT-based authentication. The application is deployed on **Render** and uses a **MySQL** database hosted on **Railway**.

---

## Features

- User Registration
- User Login
- JWT Authentication
- BCrypt Password Encryption
- Protected REST APIs
- MySQL Database Integration
- Cloud Deployment using Render
- Git Version Control with GitHub

---

## Technology Stack

| Technology | Purpose |
|------------|---------|
| Java 21 | Programming Language |
| Spring Boot | Backend Framework |
| Spring Security | Authentication & Authorization |
| JWT | Secure Token Authentication |
| BCrypt | Password Encryption |
| MySQL | Database |
| Railway | Cloud Database Hosting |
| Render | Backend Deployment |
| Maven | Dependency Management |
| Git & GitHub | Version Control |
| Postman | API Testing |

---

## API Endpoints

### Register User

**POST**

```
/api/users/register
```

### Login User

**POST**

```
/api/users/login
```

### Get User Profile

**GET**

```
/api/users/profile
```

Requires JWT Bearer Token.

---

## Deployment

### Live Backend

https://mis-invoice-system.onrender.com

### GitHub Repository

https://github.com/Atharvx12/mis-invoice-system

---

## Project Structure

```
backend/
└── mis-invoice-system/
    ├── controller/
    ├── dto/
    ├── entity/
    ├── jwt/
    ├── repository/
    ├── security/
    ├── service/
    └── resources/
```

---

## Author

**Atharva Rothe**

B.E Information Technology

Indala College of Engineering

Mumbai University

---

## Internship

This project was developed as part of the internship program conducted by **Itvedant Education Pvt. Ltd.**
