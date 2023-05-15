package com.henritec.atena.domain;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	private Integer id;
	private String nome;
	private String descricao;
	
	private List<Livro> livros = new ArrayList<>();

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(Integer id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	
	

}
