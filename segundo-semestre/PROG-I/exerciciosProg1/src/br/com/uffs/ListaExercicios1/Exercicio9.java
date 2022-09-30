package br.com.uffs.ListaExercicios1;

import java.util.ArrayList;

public class Exercicio9 {
	public static void main(String[] args) {
		
		//gera lista comnumeros randomicos
		ArrayList<Integer> listNum = new ArrayList<>();		
		for (int i =0;i<50;i++) {
			listNum.add((int) (Math.random() * 100));			
		}
		
		// descobre a media dos valores
		int soma = 0;
		int media = 0;
		for (int num: listNum) {
			soma += num;
			media = soma/listNum.size();
		}
		int soma2 = 0;
		int media2 = 0;
		//gera nova lista
		ArrayList<Integer> listNum2 = new ArrayList<>();
		for (int num:listNum) {
			if (num < media) {
				listNum2.add(num);
			}
		}
		
		for (int num: listNum2) {
			soma2 += num;
		}
		media2 = soma2/listNum2.size();
		System.out.println(media2);		
		
		
	}
}
