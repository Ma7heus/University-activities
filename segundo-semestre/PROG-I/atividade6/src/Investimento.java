

public class Investimento extends Conta {
	private double taxaRendimento;

	public Investimento(int numero, double saldo, String nome,
			double taxaRendimento,Cliente cliente) {
		super(numero, saldo, nome, cliente);
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public void fazManutencao() {
		double novoSaldo = this.getSaldo();
		novoSaldo += this.taxaRendimento * this.getSaldo();
		this.setSaldo(novoSaldo);
	}
	
	@Override
	public void resumoExtrato() {
		super.resumoExtrato();
		System.out.println("Taxa Rendimento: " + this.taxaRendimento + "%");
	}
	
	
	
	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

}
