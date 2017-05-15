package br.com.cactusdigital.abstrata;

public abstract class Produto {

	private String descricao;

	public abstract void imprimirDescricao();

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
