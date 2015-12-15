
    Spring Boot will use an embedded tomcat server on port 8080.

    Access: 
    - GET http://localhost:8080 to call the first method returning hello world;
    - POST http://localhost:8080 to call the greet method returning Greetings: NameParam


Main class: com.miki.sample.SpringBootSampleApplication
- JDK: 1.8
- Maven: 3.1.1

To create and use an executable jar file use, from terminal:
- mvn clean install
- java -jar target/spring.boot.sample.jar


In the target folder you will find the spring.boot.sample.jar, for reuse.
