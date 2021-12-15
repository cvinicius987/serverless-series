## aws-java-console

### Tecnologias
- Java 11
- Maven;
- AWS Lambda.

### Utilização

**Build**
```
mvn clean package
```

**Deploy**
```
serverless deploy --verbose
```

**Execução**
```
serverless invoke -f consoleHandler -d 'Aws Lambda Parameter'
```
![Resultado da Execução](img/result.png?raw=true "Serverless")