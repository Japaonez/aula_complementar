package com.example.demo.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.model.Disciplina;
import com.example.demo.repository.DisciplinaRepository;

@RestController
@RequestMapping(value="/disciplinas")
public class DisciplinaController {

	@Autowired
	private DisciplinaRepository repository;
	
	@GetMapping
	public List<Disciplina> listar() {
		List<Disciplina> list = repository.findAll();
		return list;
	}
	
	@GetMapping(value = "/{id}")
	public Disciplina listarUm(@PathVariable int id) {
		Optional<Disciplina> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
	@PostMapping
	public ResponseEntity<Void> inserir(@RequestBody Disciplina obj){
		obj = repository.save(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("{}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	//antigo
//	@PostMapping
//	public String inserir(@RequestBody Disciplina obj){
//		obj = repository.save(obj);
//		return "redirect:/";
//	}
}