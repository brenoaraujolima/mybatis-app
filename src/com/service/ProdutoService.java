package com.service;

import org.apache.ibatis.session.SqlSession;

import com.entity.Produto;
import com.mappers.ProdutoMapper;
import com.util.MyBatisSqlSessionFactory;

public class ProdutoService {
	public Produto buscarProduto(Integer codigo) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			ProdutoMapper produtoMapper = sqlSession.getMapper(ProdutoMapper.class);
			return produtoMapper.buscarProduto(codigo);
		} finally {
			sqlSession.close();
		}
	}

	public void inserirProduto(Produto student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			ProdutoMapper produtoMapper = sqlSession.getMapper(ProdutoMapper.class);
			produtoMapper.inserirProduto(student);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
}