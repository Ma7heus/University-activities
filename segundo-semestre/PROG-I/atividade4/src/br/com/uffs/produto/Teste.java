package br.com.uffs.produto;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Produto[] listaProdutos = new Produto[1];
		
		for (int i = 0;i < listaProdutos.length;i++) {
		Scanner n = new Scanner(System.in);
			
		System.out.print("Digite o nome do produto: ");
		String nome = n.next();
	
		System.out.print("Digite o codigo do produto: ");
		float valor = n.nextFloat();
		
		System.out.print("Digite a quantidade: ");
		int quant = n.nextInt();			
			listaProdutos[i] = new Produto(nome, valor, quant);
		}
		
		int n = 0;
	
		System.out.println(listaProdutos[n]);
		
		
	}

}
