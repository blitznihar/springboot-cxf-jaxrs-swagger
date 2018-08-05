# springboot-cxf-jaxrs-swagger
# Apache CXF JAX-RS with Spring Boot Embedded Servlet Containers - Tomcat, Jetty, Undertow with swagger

Simply Build
```
mvn package
```
Run using Spring Boot Maven plugin
```
mvn spring-boot:run
```

Run using standalone JAR
```
 java -jar target/com.fusion-0.0.1-SNAPSHOT.jar
 ```
 
Invoke customer and order REST service
```
  curl http://localhost:8444/api/customer
  curl http://localhost:8444/api/order
```
### Currently using port 8444
> change the port in application.properties file
> can be found under src/main/resources

### Swagger can be accessed
> open below URL in browser:
```
http://localhost:8444/api/api-docs?url=/api/swagger.json

http://localhost:8444/api/services

```
## Spring Boot Embedded Servlet Containers 
- Tomcat
- Jetty
- Undertow 
### Currently using Undertow
> change Embedded Servlet Containers in pom.xml file
> can be found at root folder
> follow the <!-- TOMCAT START --> or <!-- JETTY START--> or <!-- UNDERTOW START--> tags in the pom.xml file
