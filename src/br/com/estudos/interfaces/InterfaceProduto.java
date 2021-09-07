package br.com.estudos.interfaces;

import br.com.estudos.classes.Produto;

public interface InterfaceProduto {
	public void addProduto(Produto produto);
	public void atualizar(String nome, Produto produto);
	public void imprimir();
	public Produto[] listarProduto();
	public void deletarProduto(int codigo);
}
