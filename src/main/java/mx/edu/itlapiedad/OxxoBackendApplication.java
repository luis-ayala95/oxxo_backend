package mx.edu.itlapiedad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = {"package mx.edu.itlapiedad.controladores"})
@ComponentScan(basePackages = {"package mx.edu.itlapiedad.ws"})

@SpringBootApplication
public class OxxoBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OxxoBackendApplication.class, args);
	}

}
