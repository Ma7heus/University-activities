package br.com.uffs.produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<Produto>();
		
		Scanner input =  new Scanner(System.in);
		System.out.println("Quantos produtos deseja cadastrar: ");
		int num =  input.nextInt();
		
		for (int i = 0;i>=num;i++) {
			System.out.print("Digite o nome do produto que deseja cadastrar: ");
			String nome =  input.nextLine();
			
			System.out.print("Digite o preco do produto: ");			
			int quant = input.nextInt();
			
			System.out.print("Digite o preco do produto: ");
			float preco = input.nextFloat();			
			
			Produto produto =  new Produto(nome, preco, quant);
			
			lista.add(produto);
			
		}
		
		
		System.out.println(lista);
		
	}

}
