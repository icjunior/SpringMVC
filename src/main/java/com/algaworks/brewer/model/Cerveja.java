package com.algaworks.brewer.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Cerveja {

	@NotBlank(message = "SKU não pode estar em branco")
	private String sku;

	@NotBlank(message = "Nome não pode ser nulo")
	private String nome;

	@Size(min = 1, max = 50, message = "Tamanho deve estar entre 1 e 50 caracteres")
	private String descricao;

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
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
}
