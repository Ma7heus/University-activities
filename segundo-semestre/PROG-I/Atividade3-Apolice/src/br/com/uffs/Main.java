package br.com.uffs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Apolice apolice1 = new Apolice();
		Apolice apolice2 = new Apolice();
		Apolice apolice3 = new Apolice();
		Apolice apolice4 = new Apolice();
		
		System.out.print("Digite a idade: ");
		apolice1.idade = input.nextInt();
		
		System.out.print("Digite o nome do segurado: ");
		apolice1.nomeSegurado = input.next();
		
		System.out.print("Digite a cidade: ");
		apolice1.cidade = input.next();
		
		System.out.print("Digite o valor do premio: ");
		apolice1.valorPremio = input.nextFloat();
		
		System.out.println();
		apolice1.imprimir();
		System.out.println();
		System.out.println("Valor do desconto R$ " + apolice1.oferecerDesconto(apolice1.cidade));
		
		System.out.println(apolice1.numApolice);
		
	}

}
