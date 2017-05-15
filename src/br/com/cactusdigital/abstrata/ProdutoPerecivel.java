package br.com.cactusdigital.abstrata;

public class ProdutoPerecivel extends Produto {

	private String dataValidade;

	@Override
	public void imprimirDescricao() {
		System.out.println("Nome do produto: " + super.getDescricao() + " com a validade em: " + dataValidade);
	}

	/**
	 * @return the dataValidade
	 */
	public String getDataValidade() {
		return dataValidade;
	}

	/**
	 * @param dataValidade
	 *            the dataValidade to set
	 */
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

}
