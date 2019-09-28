package br.com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Testes02 {
	
	public static void main(String[] args) {
		List<Curso> cursos = Arrays.asList(
				new Curso("Python", 150),
				new Curso("Java", 250),
				new Curso("C#", 100),
				new Curso("Mongo", 50));
		
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		cursos.stream().filter(c -> c.getAlunos() > 50)
			.map(c -> c.getNome())
			.forEach(System.out::println);
		
		// Calculando a média de alunos dos cursos		
		cursos.stream().
			mapToInt(Curso::getAlunos)
			.average()
			.ifPresent(System.out::println);
		
		// Convertendo um stream para list
		List<Curso> cursosFiltrados = cursos.stream().filter(c -> c.getAlunos() > 100)		
			.collect(Collectors.toList());
		cursosFiltrados.forEach(System.out::println);
		
	}
}
