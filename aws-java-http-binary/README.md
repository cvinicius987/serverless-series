## aws-java-http-binary

Função lambda que realiza a conversão de decimal em binário.

### Tecnologias
- Java 11
- Maven;
- AWS Lambda;
- AWS Lambda Http Events.

### Execução

**Build**
```
mvn clean package
```

**Deploy**
```
serverless deploy --verbose
```

### Rotas
```
GET
https://<aws-lambda-url>/binary?number=<value>
```