package br.com.alura;

import java.util.ArrayList;

public class Ejemplo1 {
	public static void main(String[] args) {
		String variable1 = "Ejemplo 1";
		String variable2 = "Ejemplo 2";
		String variable3 = "Ejemplo 3";
		String variable4 = "Ejemplo 4";
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add(variable1);
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);
		System.out.println(lista);
		
		lista.remove(2);
		System.out.println(lista);
		
		lista.set(2, "Ejemplo alterado");
		System.out.println(lista);
		System.out.println(lista.size());
	}
}
