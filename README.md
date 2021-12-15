# Serverless Series

Conteudo sobre o uso da arquitetura Serverless utilizando os principais provedores de Cloud e tecnologias variadas.


### Ambiente


#### AWS

Necessário a instalação do AWS CLI para realizar os deploys diretamente pelo console.

A Instalação e configuração pode ser encontrada no link:

[AWS CLI Instalação](https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-getting-started.html)

Após a instalação necessário executar o comando abaixo, para verificar o correto funcionamento do ambiente:

```
aws --version
```

### Serverless Framework


Utilizado para realizar deploy e execução de funções remotas.

[Site oficial](https://www.serverless.com/framework/docs/getting-started)

#### NodeJS e NPM

Para Utilizar o Serverless frmework precisamos ter o NodeJS e NPM instalados, seguindo os seguintes procedimentos:

[Instalação NodeJS e NPM](https://nodejs.org/en/)

Após a instalação devemos verificar se o ambiente este devidamente configurado através dos comandos:

**NodeJS**
```
node -v
```

**NPM**
```
npm -v
```

#### Instalação


A instalação pode ser realizada de 2 formas, sendo elas **standalone** ou via **npm**

**Via NPM**
```
npm install -g serverless
```

Verificação da instalação através do comando:
```
serverless -version
```
