package br.com.uffs;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
	
		//utilizando contrutor com atributos
		Scanner input = new Scanner(System.in);
		
		Apolice apolice = new Apolice("Matheus", "Florianópolis", 21, 150);
		
		apolice.imprimir();
		float desconto = apolice.oferecerDesconto(apolice.cidade);
		System.out.print("Valor do premio: ");
		System.out.println(apolice.valorPremio-desconto);
		System.out.print("Numero da ultima apolice: ");
		Apolice.exibeUltimoNum();
		
		
		
	}
	
	
	
	
}
