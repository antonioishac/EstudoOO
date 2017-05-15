package br.com.cactusdigital.comparable;

import java.util.Comparator;

public class SaldoComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta o1, Conta o2) {
		return o2.getSaldo().compareTo(o1.getSaldo());
	}

}
