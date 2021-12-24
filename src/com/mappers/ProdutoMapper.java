package com.mappers;

import com.entity.Produto;

public interface ProdutoMapper {
	Produto buscarProduto(Integer codigo);
	void inserirProduto(Produto produto);
}
