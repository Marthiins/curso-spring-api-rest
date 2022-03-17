package com.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@SpringBootApplication
@EntityScan(basePackages = {"curso.api.rest.model"})//pacote de modelo
@ComponentScan(basePackages = {"curso.*"}) /*Tudo que estiver na pasta de curso*/
@EnableJpaRepositories({"curso.api.rest.repository"})
@EnableTransactionManagement/*Transação do banco de dados*/
@EnableWebMvc
@RestController /*retornar json*/
@EnableAutoConfiguration /*configurar todas as anotações*/
public class CursospringrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursospringrestapiApplication.class, args);
	}

}
