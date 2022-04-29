package com.multidb.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.multidb.api.model.app.Livro;
import com.multidb.api.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@GetMapping
	public List<Livro> obterTodos(){
		return this.livroService.obterLivros();
	}
	
	@PostMapping("/adicionar")
	public ResponseEntity<Livro> addLivro(@RequestBody Livro livro) {
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(this.livroService.adicionarLivros(livro));
		} catch(IllegalArgumentException e) {
			return ResponseEntity.badRequest().build();
		}
	}

}
