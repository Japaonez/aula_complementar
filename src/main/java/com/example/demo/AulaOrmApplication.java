package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Aluno;
import com.example.demo.model.Disciplina;
import com.example.demo.repository.AlunoRepository;
import com.example.demo.repository.DisciplinaRepository;

@SpringBootApplication
public class AulaOrmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AulaOrmApplication.class, args);
	}
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public void run(String... args) throws Exception {
		Disciplina d1 = new Disciplina("Programação Orientada a Objetos", 64);
		Disciplina d2 = new Disciplina("Estrutura de Dados", 64);
		Disciplina d3 = new Disciplina("Engenharia de Software", 64);
		
		Aluno a1 = new Aluno(0, "João", "joao@gmail.com", 123, "CC");
		Aluno a2 = new Aluno(0, "André", "andre@gmail.com", 234, "CC");
		Aluno a3 = new Aluno(0, "Formigão", "formiga@gmail.com", 154, "CC");
		Aluno a4 = new Aluno(0, "Maria", "maria@gmail.com", 641, "CC");
		Aluno a5 = new Aluno(0, "Marcos", "marcos@gmail.com", 100, "CC");
		
		disciplinaRepository.saveAll(Arrays.asList(d1, d2, d3));
		alunoRepository.saveAll(Arrays.asList(a1, a2, a3, a4, a5));
		
	}

}
