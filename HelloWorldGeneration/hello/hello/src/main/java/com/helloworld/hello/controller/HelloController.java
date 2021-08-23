package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping("/hello") 
	public String sayHello() {
		return "Hello World!";
	}
	
	@GetMapping("/atividade1") 
	public String primeiraAtividade() {
		return "Para esta atividade eu fui (mentalidade:) persistente e (habilidade:) proativa!";
	}
	
	@GetMapping("/atividade2") 
	public String segundaAtividade() {
		return "Para esta semana, com todas as mentalidades em prática, pretendo: Pesquisar, estudar e praticar conteúdo a mais do Spring; Organizar meu perfil no LinkedIn; Avançar no meu projeto pessoal e em grupo.";
	}
	
}
