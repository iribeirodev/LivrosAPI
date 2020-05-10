package com.iribeirodev.livrosapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iribeirodev.livrosapi.repository.LivroRepository;
import com.iribeirodevmodel.livrosapi.model.Livro;

@RestController
@RequestMapping({"/livros"})
public class LivroController {

	private LivroRepository repository;

	public LivroController(LivroRepository livroRepository) {
		this.repository = livroRepository;
	}
	
	@GetMapping
	public List findAll() {
		return repository.findAll();
	}
	
	@GetMapping(path = {"/{id}"})
	public ResponseEntity findById(@PathVariable long id) {
		return repository.findById(id)
					.map(data -> ResponseEntity.ok().body(data))
					.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public Livro create(@RequestBody Livro livro) {
		return repository.save(livro);
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity update(
			@PathVariable("id") long id,
			@RequestBody Livro livro) {
		return repository.findById(id)
					.map(data -> {
						data.setTitulo(livro.getTitulo());
						data.setAnooriginal(livro.getAnooriginal());
						Livro updated = repository.save(data);
						return ResponseEntity.ok().body(updated);
					}).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping(path= {"/{id}"})
	public ResponseEntity<?> delete(@PathVariable long id) {
		return repository.findById(id)
					.map(data -> {
						repository.deleteById(id);
						return ResponseEntity.ok().build();
					})
					.orElse(ResponseEntity.notFound().build());
	}
}
