package br.com.uffs.jogoAdivinhacao;

public class Player {
	int numero;
	
	public Player() {
		
	}
	
	
	public void guess() {
		this.numero = (int) (Math.random() * 10);
		System.out.println("Estou pensando em ... " + numero);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
