package com.algaworks.brewer.dto;

import java.math.BigDecimal;

public class InformacoesEstoqueProdutos {
	private Long totalEstoque;
	private BigDecimal valorEstoque;

	public InformacoesEstoqueProdutos(BigDecimal valorEstoque, Long totalEstoque) {
		this.totalEstoque = totalEstoque;
		this.valorEstoque = valorEstoque;
	}

	public Long getTotalEstoque() {
		return totalEstoque;
	}

	public void setTotalEstoque(Long totalEstoque) {
		this.totalEstoque = totalEstoque;
	}

	public BigDecimal getValorEstoque() {
		return valorEstoque;
	}

	public void setValorEstoque(BigDecimal valorEstoque) {
		this.valorEstoque = valorEstoque;
	}
}
