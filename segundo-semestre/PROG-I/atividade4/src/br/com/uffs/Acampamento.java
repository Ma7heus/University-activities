package br.com.uffs;

public class Acampamento {

	private String nome;
	private Integer idade;
	private char equipe;
	
	
	public Acampamento(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public void definirEquipe() {
		if(this.idade >6 & this.idade <=10) {
			this.equipe = 'A';
		} else if (this.idade >11 & this.idade <=20) {
			this.equipe = 'B';
			
		}else if (this.idade >20) {
			this.equipe = 'C';
		}
	}
	

	@Override
	public String toString() {
		return "Acampamento [nome=" + nome + ", idade=" + idade + ", equipe=" + equipe + "]";
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public char getEquipe() {
		return equipe;
	}


	public void setEquipe(char equipe) {
		this.equipe = equipe;
	}
	
	
	
	
	
	
}
