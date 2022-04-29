package com.multidb.api.model.app;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "livro")
public class Livro {
	
	@Id
	private Long codigo;
	
	private String titulo;
	
	private String nome;
	
	private String tema;
	
	@Column(name = "nome_usuario")
	private String nomeUsuario;
	
	@Transient
	private Long codigoUsuario;

	public Livro() {
		
	}
	
	public Livro(Long codigo, String titulo, String nome, String tema, String nomeUsuario) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.nome = nome;
		this.tema = tema;
		this.nomeUsuario = nomeUsuario;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public Long getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(Long codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, nomeUsuario, tema, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(nomeUsuario, other.nomeUsuario)
				&& Objects.equals(tema, other.tema) && Objects.equals(titulo, other.titulo);
	}
	

}
