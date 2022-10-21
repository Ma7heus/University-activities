package br.com.uffs.produto;

public class Produto{

    private String nome;
    private float valor;
    private int quantidade;

	public Produto(String nome, float valor, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public boolean verificarDisponibilidade(int quantVerificar) {
    	if (this.quantidade >= quantVerificar) {
    		return true;
    	}    	
    	return false;
    }
    
    public void adicionarUnidades(int quantAdicionar) {
    	this.quantidade += quantAdicionar; 
    }
    
    public boolean removerUnidades(int quantRemover) {
    	if (verificarDisponibilidade(quantRemover)) {
    		this.quantidade -= quantRemover;
    		return true;
    	}
    	return false;
	}
        
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + ", quantidade=" + quantidade + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

    


}


