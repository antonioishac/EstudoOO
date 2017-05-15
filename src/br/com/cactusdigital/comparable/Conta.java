package br.com.cactusdigital.comparable;

import java.math.BigDecimal;

public class Conta implements Comparable<Conta> {

	private int id;
	private String titular;
	private BigDecimal saldo;

	public Conta() {
	}

	public Conta(int id, String titular, BigDecimal saldo) {
		this.id = id;
		this.titular = titular;
		this.saldo = saldo;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular
	 *            the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return the saldo
	 */
	public BigDecimal getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 *            the saldo to set
	 */
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	// Se o número da conta atual é menor do que da outraConta retormamos -1 (ou
	// qualquer int negativo, indicando que this deve vir “antes” de
	// outraConta), se for maior retornamos 1 (ou qualquer int positivo) e se
	// for igual então devolvemos 0.
	@Override
	public int compareTo(Conta o) {
		if (this.id < o.id) {
			return -1;
		}
		if (this.id > o.id) {
			return 1;
		}
		return 0;
	}
}
