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
 
Invoke People REST service
```
  curl http://localhost:8443/api/customer
```
### Currently using port 8443
> change the port in application.properties file
> can be found under src/main/resources

## Spring Boot Embedded Servlet Containers 
- Tomcat
- Jetty
- Undertow 
### Currently using Undertow
> change Embedded Servlet Containers in pom.xml file
> can be found at root folder
> follow the <!-- TOMCAT START --> or <!-- JETTY START--> or <!-- UNDERTOW START--> tags in the pom.xml file
