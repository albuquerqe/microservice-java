package br.edu.atitus.paradigma.cambio_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCaching
public class CambioService1Application {

	public static void main(String[] args) {
		SpringApplication.run(CambioService1Application.class, args);
	}

}
