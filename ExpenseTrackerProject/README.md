# Expense Tracker - Spring Boot Project

## Overview
A simple enterprise-style expense tracker built using Java 17, Spring Boot, JPA, MySQL.

## Features
- REST APIs for managing expenses (CRUD)
- Filter by category
- MySQL integration
- Layered architecture (Controller, Service, Repository)

## Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## Setup Instructions

1. **Create Database**
   ```sql
   CREATE DATABASE expense_db;
   ```

2. **Configure DB Credentials**
   Update `src/main/resources/application.properties` with your MySQL username and password.

3. **Build & Run the Application**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **API Endpoints**
   - `GET /api/expenses` - List all expenses
   - `POST /api/expenses` - Create expense
   - `GET /api/expenses/{id}` - Get expense by ID
   - `DELETE /api/expenses/{id}` - Delete expense
   - `GET /api/expenses/category/{category}` - Filter by category

## Note
- Make sure MySQL is running.
- Use Postman to test APIs.

---
