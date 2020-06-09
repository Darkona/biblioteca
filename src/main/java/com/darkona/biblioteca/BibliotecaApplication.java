package com.darkona.biblioteca;

import com.darkona.biblioteca.service.impl.GreetServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BibliotecaApplication {


	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
		GreetServiceImpl s = new GreetServiceImpl();
	}



}
