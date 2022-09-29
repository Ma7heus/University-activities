package br.com.uffs.ListaExercicios1;

public class Exercicio6 {
	public static void main(String[] args) {		
		int cont = 0;
		for (int i = 1;cont <= 15;i++) {
			for (int j = 1;j<10;j++) {
				if(i%j != 0) {					
					System.out.println(i);
					break;
			}
				cont ++;
			}
		}
	}
}