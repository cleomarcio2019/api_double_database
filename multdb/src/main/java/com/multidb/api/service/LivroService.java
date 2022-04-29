package com.multidb.api.service;

import java.util.List;

import com.multidb.api.model.app.Livro;

public interface LivroService {
	
	public List<Livro> obterLivros();
	
	public Livro adicionarLivros(Livro livro);

}
