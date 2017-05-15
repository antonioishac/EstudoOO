package br.com.cactusdigital.abstrata;

public class TesteAbstrata {

	public static void main(String[] args) {

		ProdutoPerecivel p = new ProdutoPerecivel();
		p.setDescricao("Caixa de Leite");
		p.setDataValidade("12/05/2017");

		p.imprimirDescricao();

	}

}
