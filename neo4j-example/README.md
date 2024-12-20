# Spring Boot Neo4j Example

This is a simple Spring Boot application demonstrating integration with Neo4j graph database.

## Prerequisites

- Java 17
- Maven
- Neo4j Database (local or remote)

## Configuration

Update the Neo4j connection details in `src/main/resources/application.properties`:

```properties
spring.neo4j.uri=bolt://localhost:7687
spring.neo4j.authentication.username=neo4j
spring.neo4j.authentication.password=password
```

## Running the Application

1. Start your Neo4j database
2. Build the project: `mvn clean install`
3. Run the application: `mvn spring-boot:run`

## API Endpoints

- Create a person: `POST /api/persons`
  ```json
  {
    "name": "John Doe",
    "age": 30
  }
  ```
- Get all persons: `GET /api/persons`

## Testing

You can test the API using curl or any API testing tool like Postman.
