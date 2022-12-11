package edu.polytech.tp1chap7_classroom;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Iterator;

@SpringBootApplication
@EnableSwagger2 // pour acceder à la page de documentation
//allez sur http://localhost:port/swagger-ui.html
public class Tp1chap7ClassroomApplication {

	
	
	
    public static void main(String[] args) {
        SpringApplication.run(Tp1chap7ClassroomApplication.class, args);
    }


}

