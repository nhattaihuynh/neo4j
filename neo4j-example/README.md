# Spring Boot Neo4j Demo

This is a Spring Boot application that demonstrates integration with Neo4j graph database.

## Prerequisites

- Java 17
- Gradle 8.11.1
- Neo4j Database (Make sure it's running on localhost:7687)

## Configuration

The application is configured with the following properties in `application.properties`:

- Neo4j connection: bolt://localhost:7687
- Default username: neo4j
- Default password: password
- Server port: 8080

Please update these values according to your Neo4j installation.

## Building the Application

To build the application, run:

```bash
./gradlew build
```

## Running the Application

To run the application:

```bash
./gradlew bootRun
```

The application will start on http://localhost:8080
