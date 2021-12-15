package br.com.cvinicius.handler;

import br.com.cvinicius.binary.NumberToBinaryLogic;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class ConsoleHandler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {

        if(input.matches("-?\\d+")){
            return NumberToBinaryLogic.convert(Long.parseLong(input));
        }

        return "Valor inválido para a conversão.";
    }
}
