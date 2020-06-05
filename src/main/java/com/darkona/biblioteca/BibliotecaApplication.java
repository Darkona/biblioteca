package com.darkona.biblioteca;

import com.darkona.biblioteca.service.GreetService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotecaApplication {


	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
		GreetService s = new GreetService();
	}



}
