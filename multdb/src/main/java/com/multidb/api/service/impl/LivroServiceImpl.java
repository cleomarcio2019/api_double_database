package com.multidb.api.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.multidb.api.model.app.Livro;
import com.multidb.api.model.auth.Usuario;
import com.multidb.api.repository.app.LivroRepository;
import com.multidb.api.repository.auth.UsuarioRepository;
import com.multidb.api.service.LivroService;

@Service
public class LivroServiceImpl implements LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Livro> obterLivros() {
		return this.livroRepository.findAll();
	}
	
	@Override
	public Livro adicionarLivros(Livro livro) {
		Usuario usuario = this.usuarioRepository.findById(livro.getCodigoUsuario()).
				orElseThrow(() -> new IllegalArgumentException("Esse usuário não existe!"));
		livro.setNomeUsuario(usuario.getNome());
		return this.livroRepository.save(livro);
	}

}
