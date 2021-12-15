package br.com.cvinicius;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class ConsoleHandler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {

        var result = new StringBuilder();

        result.append("Parâmetro: "+input);
        result.append(" || ");
        result.append("Variável de Ambiente: "+System.getenv("TITLE"));

        return result.toString();
    }
}
