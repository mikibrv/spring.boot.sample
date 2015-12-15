package com.miki.sample;

/*

    Spring Boot will use an embedded tomcat server on port 8080.
    
    Access GET http://localhost:8080 to call the first method returning hello world;
           POST http://localhost:8080 to call the greet method returning Greetings: NameParam 
 * Created by mikibrv on 15/12/15.
 */
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@EnableAutoConfiguration
public class SpringBootSampleApplication {

    @RequestMapping("/")
    @ResponseBody
    @CrossOrigin
    String home() {
        return "Hello World!";
    }

    /** Receives a POST request on path / with parameter name. Will return parameter
     * 
     * @param request
     * @return */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin // this will allow requests origination from any domain. see CORS
    String greet(HttpServletRequest request) {
        return "Greetings: " + request.getParameter("name");
    }

    /** starts the application
     * 
     * @param args
     * @throws Exception */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootSampleApplication.class, args);
    }
}