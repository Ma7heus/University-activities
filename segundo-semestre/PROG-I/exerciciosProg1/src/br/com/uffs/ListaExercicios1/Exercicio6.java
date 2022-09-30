package br.com.uffs.ListaExercicios1;

public class Exercicio6 {

	public static void main(String[] args) {
	int cont = 0;
	for (int i = 1;cont <15;i++) {
		if (verificaPrimo(i)) {
			cont ++;
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
