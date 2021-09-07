package br.com.estudos.classes;

import java.util.Arrays;

import br.com.estudos.interfaces.*;

public class VetorProduto  implements InterfaceProduto {
	private Produto vetor[];
	private int tamanhoReal;

	public VetorProduto(int tamanho) {
		vetor = new Produto[tamanho];
		tamanhoReal = 0;
	}

	public Produto[] getVetor() {
		return vetor;
	}

	public void setVetor(Produto[] vetor) {
		this.vetor = vetor;
	}

	public int getTamanhoReal() {
		return tamanhoReal;
	}

	public void setTamanhoReal(int tamanhoReal) {
		this.tamanhoReal = tamanhoReal;
	}
	
	
	@Override
	public void addProduto(Produto produto) {
		if (tamanhoReal < vetor.length) {
			vetor[tamanhoReal] = produto;
			tamanhoReal++;
		}
	}
	
	@Override
	public void atualizar(String nome, Produto produto) {
		int indice = 0;
		for (Produto p : vetor) {
			if (p.getNome().equals(nome)) {
				vetor[indice] = produto;
			}
			indice++;
		}
	}
	
	@Override
	public void deletarProduto(int codigo) {
		if (tamanhoReal > 0) {
			Produto vetorAux[] = new Produto[vetor.length-1];
			int indice = 0;
			int j = 0;
			for (Produto p : vetor) {
				if (p.getCodigo() != codigo) {
					vetorAux[j] = vetor[indice];
					j++;
				}
				indice++;
			}
			vetor = vetorAux;
		}
	}
	
	@Override
	public void imprimir() {
		for (Produto p : vetor) {
			System.out.println(p);
			System.out.println();
		}
	}

	@Override
	public Produto[] listarProduto() {
		return vetor;
	}

	@Override
	public String toString() {
		return "Vetor Produto > Vetor = " + Arrays.toString(vetor) + " / Tamanho Real = " + tamanhoReal;
	}	
}
