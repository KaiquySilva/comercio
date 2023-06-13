package com.itb.inf2fm.comercio;

public class Produto {
	
	private Long id;
	private String nome;
	private String descriçao;
	private String codigoBarras;
	private double preco;
	
	// public : Acesso liberado para todas as classes
	
	// private : Acesso permitido apenas para os membros
    //            da propria classe.
	//              Entende-se por membros(atributos e ou metodos)
	
	// Metodos Setter ´s e Getter ´ s : atribuir e recuperar dados do atributo "RESPECTIVAMENTE"
	
	public void setId(Long id) {
	     this.id = id;
	}
	public Long getId() {
		return id;
	}
	
	public void setNome(Long Nome, String nome) {
		this.nome = nome;

	}
	public String getNome() {
		return nome;
	}
	
	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}
	public String getDescriçao() {
		return descriçao;
    }
	
	public String setcodigoBarras() {
		return codigoBarras;
    }
	
	public String getcodigoBarras() {
		return codigoBarras;
	
    }
	public void setpreco(Long preco) {
	     this.preco = preco;
	
	
    }
	
	public double getPreco() {
		return preco;
}
}



