package br.uffs.banco;

public class ContaEspecial extends Conta {
	
	private double limite;
	private double taxaManutencao;

	public ContaEspecial(int numero, double saldo, String nome, double limite, double taxaMan) {
		super(numero, saldo, nome);
		this.limite = limite;
		this.taxaManutencao = taxaMan;
	}
	
	

	@Override
	public boolean sacar(double valor) {
		double saldoCliente = this.getSaldo();
		if (valor <= saldoCliente & valor > 0) {
			return super.sacar(valor);
		
		}else if (valor <= saldoCliente + this.limite & valor > 0) {
			double saldo = this.getSaldo();
			double limiteuUsado = valor - saldo;
			this.limite -= limiteuUsado;
			this.setSaldo(0);			
			return true;
		}		
		return false;
	}
	
	@Override
	public void fazManutencao() {
		this.limite -= this.limite * taxaManutencao; 
	}

	@Override
	public void resumoExtrato() {
		super.resumoExtrato();
		System.out.println("Limite: R$ " + this.limite);
	}
	
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	
	
	
}
