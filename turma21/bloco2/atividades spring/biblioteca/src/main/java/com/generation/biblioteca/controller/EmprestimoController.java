package com.generation.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.biblioteca.model.Emprestimo;
import com.generation.biblioteca.repository.EmprestimoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/emprestimo")
public class EmprestimoController {
	
	@Autowired
	private EmprestimoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Emprestimo>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Emprestimo> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
		
	@PostMapping
	public ResponseEntity<Emprestimo> post (@RequestBody Emprestimo emprestimo){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(emprestimo));
	}

	@PutMapping
	public ResponseEntity<Emprestimo> put (@RequestBody Emprestimo emprestimo){
		return  ResponseEntity.ok(repository.save(emprestimo));				
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
