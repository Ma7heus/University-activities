package br.com.uffs.ListaExercicios1;

public class Exercicio7 {

	public static void main(String[] args) {
	for (int i = 100;i <=200;i++) {
		if (verificaPrimo(i)) {
			System.out.println(i);
		}
	}
	
}	
	private static boolean verificaPrimo(int numero) {
		for (int i = 2;i<numero;i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
