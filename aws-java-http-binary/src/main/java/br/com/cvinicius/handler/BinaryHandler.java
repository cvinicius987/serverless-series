package br.com.cvinicius.handler;

import br.com.cvinicius.binary.NumberToBinaryLogic;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

public class BinaryHandler implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent input, Context context) {

        var responseEvent = new APIGatewayProxyResponseEvent();

        var pathParam = input.getQueryStringParameters().getOrDefault("number", "0");

        if(pathParam.matches("-?\\d+")){
            responseEvent.setBody(NumberToBinaryLogic.convert(Long.parseLong(pathParam)));
            responseEvent.setStatusCode(200);
        }else{
            responseEvent.setBody("Parâmetro [number] é inválido.");
            responseEvent.setStatusCode(400);
        }

        return responseEvent;
    }
}
