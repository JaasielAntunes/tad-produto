package br.com.estudos.classes;

public class Produto {
	private int codigo;
	private String nome;
	private double precoCusto;
	private double lucro;
	private double precoDeVenda;
	private String fornecedor;
	private int cnpj;

	public Produto(int codigo, String nome, double precoCusto, double lucro, double precoDeVenda, String fornecedor,
			int cnpj) {
		this.codigo = codigo;
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.lucro = lucro;
		this.precoDeVenda = precoDeVenda;
		this.fornecedor = fornecedor;
		this.cnpj = cnpj;
	}

	public Produto() {
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	public double getPrecoDeVenda() {
		return precoDeVenda;
	}

	public void setPrecoDeVenda(double precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Produto > Código = " + codigo + " / nome = " + nome + " / Preço De Custo = " + precoCusto
				+ " / Lucro = " + lucro + " / Preço De Venda = " + precoDeVenda + " / Fornecedor = " + fornecedor
				+ " / CNPJ = " + cnpj;
	}
}
