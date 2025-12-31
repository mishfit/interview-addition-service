# Addition Service - Interview Exercise

## Overview
This is a Spring Boot REST API service with a single endpoint for adding two numbers. Your task is to implement the addition logic.

## Task
Complete the `add()` method in [CalculatorService.java](src/main/java/com/interview/addition/service/CalculatorService.java#L14) to add two numbers together.

## Running the Application

### Prerequisites
- Java 17 or higher
- Maven 3.6+

### Build and Run
```bash
# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoint

### POST /api/add
Adds two numbers together.

**Request Body:**
```json
{
  "number1": 5.0,
  "number2": 3.0
}
```

**Response:**
```json
{
  "result": 8.0
}
```

### Testing the Endpoint

Using curl:
```bash
curl -X POST http://localhost:8080/api/add \
  -H "Content-Type: application/json" \
  -d '{"number1": 5.0, "number2": 3.0}'
```

Expected response:
```json
{
  "result": 8.0
}
```

## Project Structure
```
interview-addition-service/
├── src/main/java/com/interview/addition/
│   ├── AdditionServiceApplication.java    # Main application entry point
│   ├── controller/
│   │   └── AdditionController.java        # REST endpoint
│   ├── dto/
│   │   ├── AdditionRequest.java           # Request model
│   │   └── AdditionResponse.java          # Response model
│   └── service/
│       └── CalculatorService.java         # ⚠️ IMPLEMENT THIS
└── src/main/resources/
    └── application.properties              # Configuration
```

## What You Need to Do
1. Navigate to [CalculatorService.java](src/main/java/com/interview/addition/service/CalculatorService.java)
2. Implement the `add()` method
3. Remove the `throw new UnsupportedOperationException()` line
4. Return the sum of the two numbers
5. Test your implementation using the curl command above
