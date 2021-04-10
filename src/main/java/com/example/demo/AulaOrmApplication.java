package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Disciplina;
import com.example.demo.repository.DisciplinaRepository;

@SpringBootApplication
public class AulaOrmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AulaOrmApplication.class, args);
	}
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;

	@Override
	public void run(String... args) throws Exception {
		Disciplina d1 = new Disciplina("Programação Orientada a Objetos", 64);
		Disciplina d2 = new Disciplina("Estrutura de Dados", 64);
		Disciplina d3 = new Disciplina("Engenharia de Software", 64);
		
		disciplinaRepository.saveAll(Arrays.asList(d1, d2, d3));
		
	}

}
