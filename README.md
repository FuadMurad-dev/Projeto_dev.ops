# Projeto_dev.ops

## Description

This is a small Java project (Maven) that works with game data stored in `games.json` and provides a simple JSON service and a `Main` entry point. The project includes unit tests for several game classes.

## Features

- Reads and processes game information from `games.json`.
- Provides JSON handling via `JsonService`.
- Simple CLI entry in `org.example.Main`.
- Unit tests for several game classes.

## Project Structure

- `Projeto/` - main Java source and resources
  - `src/main/java/information/Game.java` - game model
  - `src/main/java/json/JsonService.java` - JSON handling utilities
  - `src/main/java/org/example/Main.java` - application entry point
  - `src/test/java/` - unit tests
- `games.json` - sample data file used by the application

## Requirements

- Java 11+ (JDK)
- Maven 3.6+

## Build

Build the project with Maven:

```
mvn clean package
```

## Run

If the project produces a runnable jar, run it with:

```
java -jar target/your-artifact.jar
```

Alternatively, run the `Main` class from your IDE or using the Maven exec plugin:

```
mvn exec:java -Dexec.mainClass="org.example.Main"
```

## Tests

Run unit tests with:

```
mvn test
```

## Notes

- Update `games.json` to change or extend test/sample data.
- `JsonService` contains JSON parsing and serialization helpers used across the project.
