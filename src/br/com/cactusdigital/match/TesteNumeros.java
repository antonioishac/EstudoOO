package br.com.cactusdigital.match;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {

	public static void main(String[] args) {

		double valor1 = 1400.980;
		System.out.println("Valor: " + valor1);

		DecimalFormat formatador = new DecimalFormat("#,##0.00");
		System.out.println(formatador.format(valor1));

		BigDecimal valor = new BigDecimal("297.9898");
		System.out.println(valor);

		String valor2 = "11.467,87";
		try {
			double valorRecebido = formatador.parse(valor2).doubleValue();
			System.out.println("Valor recebido: " + valorRecebido);
		} catch (ParseException e) {
			System.out.println("Formato inválido");
		}
	}

}
