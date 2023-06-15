package org.radji;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloLambdaTest {

    @Test
    public void testHandleRequestReturnsHelloLambdaMessage() {
        APIGatewayProxyRequestEvent requestEvent = new APIGatewayProxyRequestEvent();

        APIGatewayProxyResponseEvent responseEvent = new HelloLambda().handleRequest();

        Assertions.assertEquals(200, responseEvent.getStatusCode());
        Assertions.assertEquals("Hello, AWS Lambda!", responseEvent.getBody());
    }
}