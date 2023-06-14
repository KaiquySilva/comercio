package com.itb.inf2fm.comercio;

public class Produto {
	
	private Long id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double preco;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// public : Acesso liberado para todas as classes
	
	// private : Acesso permitido apenas para os membros
    //            da propria classe.
	//              Entende-se por membros(atributos e ou metodos)
	
	// Metodos Setter ´s e Getter ´ s : atribuir e recuperar dados do atributo "RESPECTIVAMENTE"
	
	
  }



