package com.algaworks.brewer.repository.helper.estado;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.algaworks.brewer.model.Estado;
import com.algaworks.brewer.repository.filter.EstadoFilter;

public interface EstadosQueries {

	public Page<Estado> filtrar(EstadoFilter filtro, Pageable pageable);
}
