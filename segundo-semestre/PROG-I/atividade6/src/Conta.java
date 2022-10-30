

public abstract class Conta {
	private int numero;
	private double saldo;
	private String nome;
	private Cliente cliente;

	public Conta(int numero, double saldo, String nome, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.nome = nome;
		this.cliente =  cliente;
	}


	public void depositar(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
		}
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public void resumoExtrato() {
		System.out.println("Nome: " + this.nome + "| Saldo: R$ " + this.saldo);
	}
	
	public abstract void fazManutencao();

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
