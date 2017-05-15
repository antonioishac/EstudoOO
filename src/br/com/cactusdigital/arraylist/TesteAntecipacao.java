package br.com.cactusdigital.arraylist;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteAntecipacao {

	public static void main(String[] args) {
		try {
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			BigDecimal valorTotal = BigDecimal.ZERO;

			Banco bancoDoBrasil = new Banco(123L, "Agencia Cidade", "Banco do Brasil");
			Banco bancoSantander = new Banco(456L, "Agencia Cidade Alta", "Banco Santander");
			Banco bancoBradesco = new Banco(789L, "Agencia Centro", "Banco Bradesco");
			Banco bancoItau = new Banco(1011L, "Agencia Alameda", "Banco Itau");

			Antecipacao antecipacao1 = new Antecipacao(bancoItau, df.parse("01/01/2017"), new BigDecimal(500));
			Antecipacao antecipacao2 = new Antecipacao(bancoItau, df.parse("01/01/2017"), new BigDecimal(1500));

			Antecipacao antecipacao3 = new Antecipacao(bancoBradesco, df.parse("01/01/2017"), new BigDecimal(500));
			Antecipacao antecipacao4 = new Antecipacao(bancoDoBrasil, df.parse("01/01/2017"), new BigDecimal(1500));
			Antecipacao antecipacao5 = new Antecipacao(bancoSantander, df.parse("01/01/2017"), new BigDecimal(3500));

			List<Antecipacao> antecipacoes = Arrays.asList(antecipacao1, antecipacao2, antecipacao3, antecipacao4,
					antecipacao5);

			// for (Antecipacao antecipacao : antecipacoes) {
			// System.out.println("Nome do Banco: " +
			// antecipacao.getBanco().getNome() + " Data: "
			// + df.format(antecipacao.getDataAntecipacao()) + " Valor: " +
			// antecipacao.getValorAntecipacao());
			//
			// valorTotal = valorTotal.add(antecipacao.getValorAntecipacao());
			// }

			List<Antecipacao> antecipacaoSumarizada = new ArrayList<>();

			for (Antecipacao antecipacao : antecipacoes) {

				if (antecipacaoSumarizada.contains(antecipacao)) {

					Antecipacao antecipacaoExistente = antecipacaoSumarizada
							.get(antecipacaoSumarizada.indexOf(antecipacao));

					antecipacaoExistente.setValorAntecipacao(
							antecipacaoExistente.getValorAntecipacao().add(antecipacao.getValorAntecipacao()));

				} else {
					antecipacaoSumarizada.add(antecipacao);
				}
			}

			for (Antecipacao antecipacao : antecipacaoSumarizada) {
				System.out.println("Nome do Banco: " + antecipacao.getBanco().getNome() + " Data: "
						+ df.format(antecipacao.getDataAntecipacao()) + " Valor: " + antecipacao.getValorAntecipacao());
			}

			// System.out.println("");
			// System.out.println("------------------------------------------------------------------------------------");
			// System.out.println("Valor Total: " + valorTotal);

		} catch (ParseException e) {
			System.out.println("Data da antecipação informada não confere com os padrões");
		}

	}

}
