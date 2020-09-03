package com.wladi.wladifood.domain.repository;

import java.util.List;

import com.wladi.wladifood.domain.model.Permissao;

public interface PermissaoRepository {

	List<Permissao> listar();
	Permissao buscar(Long id);
	Permissao salvar(Permissao permissao);
	void remover(Permissao permissao);
	
}
