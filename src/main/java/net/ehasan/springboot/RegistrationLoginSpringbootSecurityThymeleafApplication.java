package net.ehasan.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "net.ehasan.springboot")
public class RegistrationLoginSpringbootSecurityThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationLoginSpringbootSecurityThymeleafApplication.class, args);
	}

}
