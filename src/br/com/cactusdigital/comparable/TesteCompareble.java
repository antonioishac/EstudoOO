package br.com.cactusdigital.comparable;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TesteCompareble {

	public static void main(String[] args) {
		Conta conta1 = new Conta(43, "Antonio Ishac", new BigDecimal(500));
		Conta conta2 = new Conta(42, "Keli Ishac", new BigDecimal(700));
		Conta conta3 = new Conta(41, "Pedro Ishac", new BigDecimal(900));

		List<Conta> contas = Arrays.asList(conta1, conta2, conta3);
		Collections.sort(contas);

		System.out.println("** Ordenando pelo ID **");
		for (Conta conta : contas) {
			System.out.println(
					"ID: " + conta.getId() + " Titular: " + conta.getTitular() + " Saldo: " + conta.getSaldo());
		}

		System.out.println();
		System.out.println("** Ordena pelo nome **");
		TitularComparator comparatorTitular = new TitularComparator();
		Collections.sort(contas, comparatorTitular);
		for (Conta conta : contas) {
			System.out.println(
					"ID: " + conta.getId() + " Titular: " + conta.getTitular() + " Saldo: " + conta.getSaldo());
		}

		System.out.println();
		System.out.println("** Ordena pelo saldo maior **");
		SaldoComparator comparatorSaldo = new SaldoComparator();
		Collections.sort(contas, comparatorSaldo);
		for (Conta conta : contas) {
			System.out.println(
					"ID: " + conta.getId() + " Titular: " + conta.getTitular() + " Saldo: " + conta.getSaldo());
		}
	}

}
