package br.com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Testes01 {

	public static void main(String[] args) {		
		List<String> palavras = new ArrayList<>(
				Arrays.asList("Bruno Gonzales", "Arnaldo Silva", "Alorindo Nomeriano", "Claudio"));
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		palavras.forEach(palavra -> System.out.println(palavra));
		palavras.forEach(System.out::println);
		
		new Thread(() -> System.out.println("Executando um Runnable")).start();
	}
}