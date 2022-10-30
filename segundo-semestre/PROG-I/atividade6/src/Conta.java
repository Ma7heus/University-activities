import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Conta {
	private int numero;
	private double saldo;
	private String nome;
	private Cliente cliente;
	private List<Movimentacao> movimentacoes = new ArrayList<>();

	public Conta(int numero, double saldo, String nome, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.nome = nome;
		this.cliente =  cliente;
	}


	public void depositar(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
			Movimentacao movimento = new Movimentacao(valor,"credito");
			this.movimentacoes.add(movimento);
		}
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			Movimentacao movimento = new Movimentacao(valor,"debito");
			this.movimentacoes.add(movimento);
			
			return true;
		}
		return false;
	}
	
	public void resumoExtrato() {
		System.out.println("Nome: " + this.nome + "| Saldo: R$ " + this.saldo);
	}
	
	public void extrato() {
		List<Movimentacao> movimentacoes = this.movimentacoes;
		System.out.println("Extrato de movimentacoes");
		for (Movimentacao movimentacao : movimentacoes) {
			
			System.out.println("Data: " + movimentacao.getDataMovimentacao() 
							+ " Tipo: " + movimentacao.getTipoOperacao() 
							+ " Valor: " + movimentacao.getValorOperacao());
		}
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


	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}


	public void setMovimentacoes(List<Movimentacao> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}

}
