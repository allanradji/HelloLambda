package org.radji;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

public class HelloLambda{

    public APIGatewayProxyResponseEvent handleRequest() {
        APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();
        response.setStatusCode(200);
        response.setBody("Hello, AWS Lambda!");

        return response;
    }
}