package br.com.cactusdigital.arraylist;

import java.math.BigDecimal;
import java.util.Date;

public class Antecipacao {

	private Banco banco;

	private Date dataAntecipacao;

	private BigDecimal valorAntecipacao;

	public Antecipacao() {

	}

	public Antecipacao(Banco banco, Date dataAntecipacao, BigDecimal valorAntecipacao) {
		this.banco = banco;
		this.dataAntecipacao = dataAntecipacao;
		this.valorAntecipacao = valorAntecipacao;
	}

	/**
	 * @return the banco
	 */
	public Banco getBanco() {
		return banco;
	}

	/**
	 * @param banco
	 *            the banco to set
	 */
	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	/**
	 * @return the dataAntecipacao
	 */
	public Date getDataAntecipacao() {
		return dataAntecipacao;
	}

	/**
	 * @param dataAntecipacao
	 *            the dataAntecipacao to set
	 */
	public void setDataAntecipacao(Date dataAntecipacao) {
		this.dataAntecipacao = dataAntecipacao;
	}

	/**
	 * @return the valorAntecipacao
	 */
	public BigDecimal getValorAntecipacao() {
		return valorAntecipacao;
	}

	/**
	 * @param valorAntecipacao
	 *            the valorAntecipacao to set
	 */
	public void setValorAntecipacao(BigDecimal valorAntecipacao) {
		this.valorAntecipacao = valorAntecipacao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((banco == null) ? 0 : banco.hashCode());
		result = prime * result + ((dataAntecipacao == null) ? 0 : dataAntecipacao.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Antecipacao other = (Antecipacao) obj;
		if (banco == null) {
			if (other.banco != null) {
				return false;
			}
		} else if (!banco.equals(other.banco)) {
			return false;
		}
		if (dataAntecipacao == null) {
			if (other.dataAntecipacao != null) {
				return false;
			}
		} else if (!dataAntecipacao.equals(other.dataAntecipacao)) {
			return false;
		}
		return true;
	}

}
