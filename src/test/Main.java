package test;

import java.sql.SQLException;
import java.util.Date;

import com.entity.Produto;
import com.service.ProdutoService;

public class Main {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		ProdutoService produtoService = new ProdutoService();

		Produto produto = new Produto();
		produto.setCodigo(50);
		produto.setNome("Panetone");
		produto.setDataCadastro(new Date());
		produtoService.inserirProduto(produto);

		Produto produto2 = produtoService.buscarProduto(50);
		System.out.println("Codigo: "+produto2.getCodigo());
		System.out.println("Nome: "+produto2.getNome());
		System.out.println("Data Cadastro: "+produto2.getDataCadastro());
	}
}
