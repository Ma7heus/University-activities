package br.com.uffs.ListaExercicios1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		ArrayList<Integer> listNum = new ArrayList<>();
		
		for (int i = 0;i <10;i++) {
			System.out.print("Digite um numero: ");
			listNum.add(input.nextInt());
		}
		System.out.println(listNum);
		int maior = listNum.get(0);
		int menor = listNum.get(0);
		
		for (int i = 0; i<10;i++) {
			if(listNum.get(i) >maior) {
				maior = listNum.get(i);
			}
			if(listNum.get(i) <menor) {
				menor = listNum.get(i);
			}
				
		}
		System.out.println(menor);
		System.out.println(maior);
		
		}

}
