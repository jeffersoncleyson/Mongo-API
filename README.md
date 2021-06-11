# Informações do Projeto

#
## Introdução
#

Este projeto é uma prova de conceito da utilização do MongoDB como banco não relacional - NoSQL.<br>
A utilização de uma API Rest foi para facilitar a prova de conceito e demonstrar os procedimentos de salvar, atualizar, buscar e deletar entidades do banco de dados.


#
## Técnologias utilizadas neste projeto
#

#
### Spring Boot </br></br>

O Spring Boot é um projeto da Spring que veio para facilitar o processo de configuração e publicação de nossas aplicações. A intenção é ter o seu projeto rodando o mais rápido possível e sem complicação. </br>
Ele consegue isso favorecendo a convenção sobre a configuração. Basta que você diga pra ele quais módulos deseja utilizar (WEB, Template, Persistência, Segurança, etc.) que ele vai reconhecer e configurar. </br></br>
Inicializador de projetos spring: *[Spring Initializr](https://start.spring.io/)*

#### **Material para consulta e entendimento:**
* [O que é Spring Boot?](https://blog.algaworks.com/spring-boot/)
* [Spring Boot: simplificando o Spring](https://www.devmedia.com.br/spring-boot-simplificando-o-spring/31979)
* [Criando uma API REST com o Spring Boot](https://www.treinaweb.com.br/blog/criando-uma-api-rest-com-o-spring-boot)

#
### MongoDB </br></br>

É um banco de dados opensource, de alta performance e flexível, sendo considerado o principal banco de dados NoSQL. Os banco de dados NoSQL apresentam algumas vantagens sobre os outros tipos, principalmente quando precisamos de escalabilidade, flexibilidade, bom desempenho e facilidade para consultas.
</br>
O MongoDB é orientado a documentos, ou seja, os dados são armazenados como documentos, ao contrário de bancos de dados de modelo relacional, onde trabalhamos com registros em linhas e colunas. Os documentos podem ser descritos como dados no formato de chave-valor, no caso, utilizando o formato JSON (JavaScript Object Notation).

#### Por que utilizar o MongoDB? </br>
* Flexibilidade: oferece uma grande flexibilidade devido a seu banco de dados que não segue nenhum esquema, o que acaba o deixando muito flexível, embora possa parecer uma desvantagem, é um recurso que o diferencia de outros tipos de banco de dados.
* Alta disponibilidade: se refere ao alto volume de acesso. Como esses acessos poderão aumentar consideravelmente, isso pode afetar o desempenho do seu banco de dados e nesse sentido, o MongoDB tem capacidade para se adaptar a essas necessidades, permitindo uma grande ou alta disponibilidade.
* Projetos que envolvem Big Data: MongoDB se encaixa muito bem neste tipo de projeto.
* Documentação oficial: a documentação oficial é muito boa, portanto, durante o desenvolvimento do seu projeto, você pode utilizá-la como um ótimo recurso para melhorar suas operações.

* **Link do Material com mais detalhes [Spring Data MongoDB - Reference Documentation](https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/#reference)**</br></br>

#### **Para utilizar o server do MongoDB em conjunto com esta aplicação consultar o material disponível **[AQUI (Env-DEV)](https://github.com/jeffersoncleyson/env_dev)**** 

#
### Lombok </br></br>

O Lombok é um framework para Java que permite escrever código eliminando a verbosidade, o que permite ganhar tempo de desenvolvimento para o que realmente é importante. Seu uso permite gerar em tempo de compilação os métodos getters e setters, métodos construtores, padrão builder e muito mais.

#### **Material para consulta e entendimento:**
* [Lombok](https://projectlombok.org/)
* [Como usar o Lombok em projetos Java](https://digitalinnovation.one/artigos/como-usar-o-lombok-em-projetos-java)
* [Introduction to Project Lombok](https://www.baeldung.com/intro-to-project-lombok)

#
### OpenAPI </br></br>

A Especificação OpenAPI , originalmente conhecida como Especificação Swagger , é uma especificação para arquivos de interface legíveis por máquina para descrever, produzir, consumir e visualizar serviços da Web RESTful . Originalmente parte da estrutura Swagger , tornou-se um projeto separado em 2016, supervisionado pela OpenAPI Initiative, um projeto de colaboração de código aberto da Linux Foundation. Swagger e algumas outras ferramentas podem gerar código, documentação e casos de teste a partir de um arquivo de interface.

#### **Material para consulta e entendimento:**
* [Usando a OpenAPI para criar APIs inteligentes que ajudam os desenvolvedores](https://www.infoq.com/br/articles/apache-kafka-licoes/)
* [Open APO Initiative](https://www.openapis.org/)
* [Documenting a Spring REST API Using OpenAPI 3.0](https://www.baeldung.com/spring-rest-openapi-documentation)
* [springdoc-openapi v1.5.9](https://springdoc.org/)
* [OpenAPI 3 Documentation With Spring Boot](https://dzone.com/articles/openapi-3-documentation-with-spring-boot)
* [OpenAPI Specification - wikipedia](https://en.wikipedia.org/wiki/OpenAPI_Specification)

#
### Postman </br></br>

Os testes da API podem ser feitos utilizando a documentação especificada no tópico abaixo ou utilizando o software *Postman*. Junto ao projeto foi disponibilizado uma *collection* para ser importado no software e assim poder realizar os testes com os endpoints especificiados.

Para importar seguir os seguintes passos:

0) Fazer o [download](https://www.postman.com/downloads/) e instalar o Postman
1) Abrir o Postman
2) Clicar em *file*
3) Clicar em *import*
4) Arrastar e soltar o arquivo presenta na pasta *"Postman/Mongo-API.postman_collection.json"*

#
## Documentação da API
#

Para visualizar a documentação da API rodar o código e acessar no navegador o link abaixo:

```
http://localhost:9001/clientes/v1/swagger-ui.html
```

#
## Bibliotecas utilizadas
#

* Mapear as entidades e Conectar ao banco de dados MongoDB - NoSQL.
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>
```
* Lombok cria os construtores , getteer e setters de forma automática.

```
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.20</version>
    <scope>provided</scope>
</dependency>
```
* Para montar a API Rest
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

* Para documentar a API Rest
```
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-ui</artifactId>
    <version>1.5.2</version>
</dependency>
```


#
### Referências utilizadas para produzir este projeto
#

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [O que é MongoDB?](https://www.treinaweb.com.br/blog/o-que-e-mongodb)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Build a CRUD App with Spring Boot and MongoDB](https://www.split.io/blog/crud-spring-boot-mongodb/)
* [Documenting Spring Boot REST API with SpringDoc + OpenAPI 3](https://www.dariawan.com/tutorials/spring/documenting-spring-boot-rest-api-springdoc-openapi-3/)
* [OpenAPI Specification](https://swagger.io/specification/)
* [OpenAPI 3 & Spring Boot](https://springdoc.org/)

