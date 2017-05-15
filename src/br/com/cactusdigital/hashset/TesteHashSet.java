package br.com.cactusdigital.hashset;

import java.util.HashSet;
import java.util.Set;

public class TesteHashSet {

	public static void main(String[] args) {

		String n1 = "Antonio";
		String n2 = "Keli";
		String n3 = "Bianca";
		String n4 = "Ana Paula";
		String n5 = "Ana Laura";
		String n6 = "Pedro";

		Set<String> listaSet = new HashSet<>();
		listaSet.add(n1);
		// listaSet.add(n1);
		listaSet.add(n2);
		listaSet.add(n3);
		listaSet.add(n4);
		listaSet.add(n5);
		listaSet.add(n6);

		for (String str : listaSet) {
			System.out.println("Nome: " + str);
		}
	}

}
