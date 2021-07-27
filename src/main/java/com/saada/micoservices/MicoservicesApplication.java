package com.saada.micoservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.saada")
public class MicoservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicoservicesApplication.class, args);
		System.out.println("---------------------------------------------------------");
		System.out.println("*************MicoservicesApplication start..*************");
		System.out.println("---------------------------------------------------------");
	}

}
