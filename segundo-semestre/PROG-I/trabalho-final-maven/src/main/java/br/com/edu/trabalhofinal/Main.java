package br.com.edu.trabalhofinal;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

	BigDecimal nota1 =  new BigDecimal(8.10);
	BigDecimal nota2 =  new BigDecimal(7.8);
	
	BigDecimal perc =  new BigDecimal(100);
		
	nota1.multiply(perc);
	nota1.divide(new BigDecimal(30));
	
	BigDecimal media = nota1.multiply(nota2);
		
	
	System.out.println(nota1);
		
		
		
	}

}
