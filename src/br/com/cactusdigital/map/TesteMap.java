package br.com.cactusdigital.map;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import br.com.cactusdigital.arraylist.Antecipacao;
import br.com.cactusdigital.arraylist.Banco;

public class TesteMap {

	public static void main(String[] args) throws ParseException {

		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date data = formatador.parse("01/05/2017");

		Map<Integer, String> familia = new HashMap<>();

		familia.put(1, "Antonio");
		familia.put(2, "Keli");
		familia.put(3, "Bianca");
		familia.put(4, "Ana Paula");
		familia.put(5, "Ana Laura");
		familia.put(6, "Pedro");

		Banco santander = new Banco(1L, "1", "Banco Santander");
		Banco bradesco = new Banco(2L, "2", "Banco Bradesco");
		Banco itau = new Banco(3L, "3", "Banco Itau");

		Antecipacao antSantander = new Antecipacao(santander, data, new BigDecimal(500));
		Antecipacao antSantander2 = new Antecipacao(santander, data, new BigDecimal(500));
		Antecipacao antBradesco = new Antecipacao(bradesco, data, new BigDecimal(500));
		List<Antecipacao> listaAntecipacoes = Arrays.asList(antSantander, antSantander2, antBradesco);

		Map<String, List<Antecipacao>> antecipacoes = new LinkedHashMap<>();
		antecipacoes.put("Antecipações Mês de Maio", listaAntecipacoes);

		int index = 0;

		List<Antecipacao> listaSumarizada = new LinkedList<>();

		for (Map.Entry<String, List<Antecipacao>> map : antecipacoes.entrySet()) {

			if (listaSumarizada.contains(map.getValue().get(index))) {
				Antecipacao antecipacaoExistente = listaAntecipacoes.get(index);
				antecipacaoExistente.setValorAntecipacao(antecipacaoExistente.getValorAntecipacao()
						.add(map.getValue().get(index).getValorAntecipacao()));
			} else {
				listaSumarizada.add(map.getValue().get(index));
			}

			// System.out.println(map.getValue().get(index).getValorAntecipacao());

			index++;
		}

		for (Map.Entry<Integer, String> str : familia.entrySet()) {
			System.out.println("Chave: " + str.getKey() + " Nome: " + str.getValue());
			if ("Antonio".equalsIgnoreCase(str.getValue())) {
				System.out.println("Tem no Map<>");
			}
		}

	}

}
