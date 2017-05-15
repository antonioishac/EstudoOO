package br.com.cactusdigital.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {

	public static void main(String[] args) {

		Calendar c = new GregorianCalendar();

		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.MONTH, 6);
		c.set(Calendar.YEAR, 1982);
		c.set(Calendar.HOUR_OF_DAY, 20);
		c.set(Calendar.MINUTE, 35);
		c.set(Calendar.SECOND, 43);

		System.out.println("Imprimindo calendar sem formatador: " + c.getTime());

		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Imprimindo calendar com formatador: " + formatador.format(c.getTime()));

		// somando dia
		c.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println("imprimindo a soma do dia: " + formatador.format(c.getTime()));

		// subtraindo dia
		c.add(Calendar.DAY_OF_MONTH, -20);
		System.out.println("Imprimindo a subtração do dia: " + formatador.format(c.getTime()));

		// mudando somente o dia sem alterar o mes e o ano.
		c.roll(Calendar.DAY_OF_MONTH, 15);
		System.out.println("Imprindo a rotação do dia: " + formatador.format(c.getTime()));
	}

}
