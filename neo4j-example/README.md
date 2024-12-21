# Neo4j Example Project

## Overview
This project is a simple application demonstrating the use of Neo4j with Spring Boot. It includes basic CRUD operations for managing entities in a Neo4j database.

## Technologies Used
- **Java 21**: The project is built using Java 21.
- **Spring Boot 3.4.1**: Used for building the application.
- **Spring Data Neo4j**: For integrating Neo4j database with Spring Boot.
- **Lombok**: To reduce boilerplate code.
- **JUnit**: For testing the application.

## Getting Started

### Prerequisites
- Java 21
- Neo4j Database
- Maven (or Gradle) for building the project

### Running the Application
1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   ```

2. **Navigate to the project directory**:
   ```bash
   cd neo4j-example
   ```

3. **Build the project**:
   ```bash
   ./gradlew build
   ```

4. **Run the application**:
   ```bash
   ./gradlew bootRun
   ```

5. **Access the application**: The application will be running at `http://localhost:8080`.

### Notes
- Ensure that the Neo4j database is running and accessible before starting the application.
- Update the Neo4j connection details in the application properties if necessary.

## License
This project is licensed under the MIT License.
