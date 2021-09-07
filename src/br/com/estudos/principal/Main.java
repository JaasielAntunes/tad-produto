package br.com.estudos.principal;

import br.com.estudos.classes.Produto;
import br.com.estudos.classes.VetorProduto;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		Produto prod1 = new Produto(1, "detergente", 2.80, 1.00, 3.80, "DCS", 12345);
		Produto prod2 = new Produto(2, "álcool em gel", 4.13, 2.50, 4.00, "distribuidora", 87654);
		Produto prod3 = new Produto(3, "sabonete", 1.50, 3.00, 4.30, "distribuidora", 01020);

		VetorProduto vetor = new VetorProduto(3);

		vetor.addProduto(prod1);
		vetor.addProduto(prod2);
		vetor.addProduto(prod3);
		
		vetor.deletarProduto(1);

		//Produto prod3 = new Produto(003, "sabão", 3.50, 2.00, 3.20, "DCS", 123098);
		//vetor.atualizar("detergente", prod3);

		vetor.imprimir();
	}
}
