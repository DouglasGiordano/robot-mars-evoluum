# robot-mars-evoluum
Restful web service to control a robot using an L, R or M string pattern.

## Technologies 
* Java 11
* Maven
* Spring Boot 2.4.0
* Lombok

## Build
Use maven to build the web service.

> mvn package

## Run
Use maven to run the web service.

> mvn spring-boot:run

## Use
Send get requests with the following pattern: L, R ou M. Examples:

> localhost:8080/rest/mars/MMML

> localhost:8080/rest/mars/MLMRML
