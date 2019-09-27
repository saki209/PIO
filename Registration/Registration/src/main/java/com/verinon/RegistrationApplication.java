package com.verinon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// If we wnat to deploy the application as a Jar file this class is required

// If we wnat to deploy the application as a war  file ServletInitializer class also required

@SpringBootApplication   
// This annotation will work as @ComponentScan, @EnableAutoConfiguration, @SpringBootConfiguration
// @EnableAutoConfiguration will create the Factory beans(EntityManager,InternalResouceViewResolver,DataSource,EntityManagerFactory etc.) which are in classpath(jars)

public class RegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationApplication.class, args);
	}

}
