package br.com.cactusdigital.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {

	public static void main(String[] args) {

		Date hoje = new Date();
		System.out.println("data de hoje: " + hoje);

		DateFormat formatador1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data com o formatador1: " + formatador1.format(hoje));

		DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Data com o formatador2: " + formatador2.format(hoje));

		String dataAniversario = "01/07/1982";
		DateFormat formatador3 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date aniversario = formatador3.parse(dataAniversario);
			System.out.println("Recebendo uma string e transformando em data: " + aniversario);
			System.out.println("Recebendo uma string e transformando em data e imprimindo com o formatador3: "
					+ formatador3.format(aniversario));
		} catch (ParseException e) {
			System.out.println("Formato de data inválido.");
		}
	}

}
