# Project Name

## Overview

This project demonstrates the creation and testing of a Lambda function using Java 17. The objective was to create a simple "Hello World" Lambda function. The Lambda function is accessed through an API Gateway.

## Prerequisites

- Java 17
- AWS account with proper credentials and permissions

## Setup

1. Clone the repository:

   ```
   git clone https://github.com/allanradji/HelloLambda.git
   ```

2. Open the project in your preferred Java IDE.

## Lambda Function

This project contains a handleRequest() method, which serves as the entry point for the Lambda execution. The method is responsible for processing the incoming API Gateway request and generating a response. The handleRequest() method creates an instance of the APIGatewayProxyResponseEvent class, which represents the response to be returned by the Lambda function. It sets the response status code to 200 (indicating a successful response) and sets the response body to the string "Hello, AWS Lambda!".

Finally, the method returns the APIGatewayProxyResponseEvent object, which will be serialized and sent back to the API Gateway as the Lambda function's response.

## Testing

Unit tests for the Lambda function are implemented using JUnit Jupiter. The test class can be found in the `HelloLambdaTest` file. To run the tests, execute the following command:

```
mvn test
```

## Deployment

To deploy the Lambda function, follow these steps:

1. Build the project using the following command:

   ```
   mvn clean package
   ```

2. Create a Lambda function AWS and upload the code.

3. Set up an API Gateway to access the Lambda function. Set the main method called to `org.radji.HelloLambda::handleRequest`.

## Usage

Once the Lambda function and API Gateway are set up, you can access the function using the provided API endpoint.

### Example API Request

```
https://zp2nl7h4m5.execute-api.us-east-2.amazonaws.com/default/HelloWorldLambda
```

### Example Response

```
{
  Hello, AWS Lambda!
}
```

## Screenshots


