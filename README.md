# Livros API
Projeto para ilustrar uma estrutura básica de uma API REST utilizando Java 1.8 e Spring Boot.

### Getting Started
Para executar o projeto, será necessária a seguinte instalação:

* [JDK 1.8 ou Acima](https://www.java.com/en/download/manual.jsp)
* [Maven](https://maven.apache.org/index.html)
* [Eclipse ou uma IDE de sua preferência](https://www.eclipse.org/downloads/packages/)
* [Insomnia, Postman ou outra ferramenta de teste de serviços RESTful](https://insomnia.rest/)

### Features
* Spring Boot é um projeto com o objetivo de facilitar o processo de configuração e publicação de aplicações Java.
* Através do Spring Boot se escolhem os módulos necessários para o projeto através dos starters.
* Esses módulos são dependências que podem agrupar outras dependências.

### Dependencies
No pom.xml estou trabalhando com as seguintes dependências:
* JPA
* Web Starter
* Connector JDBC para MySQL
* Lombok

### Running
No Eclipse, configurar a execução da seguinte forma:
Run As -> Maven Build -> Goals: spring-boot:run

### REST API
##### Obter lista de livros
Request: GET http://localhost:8080/livros

![ScreenShot]
(https://i.postimg.cc/15qRpcWw/Get.png)

##### Incluir Livro
Request: POST http://localhost:8080/livros

![ScreenShot]
(https://i.postimg.cc/2SNkTbJJ/Post.png)

##### Atualizar por Id
Request: PUT http://localhost:8080/livros/{id}

![ScreenShot]
(https://i.postimg.cc/Bn5qzZfv/Put.png)

##### Excluir por Id
Request: DELETE http://localhost:8080/livros/{id}

![ScreenShot]
(https://i.postimg.cc/HWKscPtT/Delete.png)








