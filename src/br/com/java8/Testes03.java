package br.com.java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Testes03 {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate date = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(date);
		
		Period period = Period.between(today, date);
		System.out.println(period.getYears());	
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatter.format(today));
	}
}
