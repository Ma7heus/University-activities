package br.uffs.banco;

public class Main {

	public static void main(String[] args) {

		Conta c1 = new Conta(001,500,"Matheus");
		ContaEspecial ce1 = new ContaEspecial(201, 150, "Pedrinho", 100, 0.05);
		Investimento i1 = new Investimento(301,50,"Maria", 0.08);
		
		c1.resumoExtrato();
		c1.depositar(-50);
		c1.depositar(30);
		c1.resumoExtrato();
		c1.sacar(180);
		c1.resumoExtrato();
		
		System.out.println();
		
		ce1.depositar(300);
		ce1.resumoExtrato();
		ce1.sacar(480);
		ce1.fazManutencao();
		ce1.resumoExtrato();
		
		System.out.println();
		
		i1.depositar(100);
		i1.resumoExtrato();
		i1.fazManutencao();
		i1.resumoExtrato();
		
		
	}

}
