package br.com.uffs;

public class Apolice {
	
	int numApolice;
	String nomeSegurado;
	String cidade;
	int idade;
	float valorPremio;
	static int ultimoNumApolice = 0;
	
	public Apolice() {
		numApolice = Apolice.ultimoNumApolice + 1;
	}
			
	public Apolice(String nomeSegurado,int idade,float valorPremio) {
		this.nomeSegurado = nomeSegurado;
		this.idade = idade;
		this.valorPremio = valorPremio;
	}

	public void imprimir() {
		System.out.println("Numero da apolice:  " + this.numApolice);
		System.out.println("Nome do segurado:  " + this.nomeSegurado);
		System.out.println("Idade do segurado:  " + this.idade);
		System.out.println("Valor do premio:  " + this.valorPremio);
	}
	
	public void calcularPremio(Apolice apolice) {
		if(this.idade >= 18 & this.idade <=25) {
			this.valorPremio += (this.valorPremio*0.2); 
		}else if(this.idade >25 & this.idade <=36) {
			this.valorPremio += (this.valorPremio*0.15);
		}else if (this.idade > 36) {
			this.valorPremio += (this.valorPremio*0.1);
		}
		
	}
	
	public float oferecerDesconto(String cidade) {
		float desconto = this.valorPremio;
		
		if(cidade.equals("Florianópolis")) {
			desconto = (float) (this.valorPremio*0.05);
		}
		if(cidade.equals("Chapecó")) {
			desconto = (float) (this.valorPremio*0.06);
		}
		if(cidade.equals("Joaçaba")) {
			desconto = (float) (this.valorPremio*0.07);
		}
		if(cidade.equals("Joinville")) {
			desconto = (float) (this.valorPremio*0.08);
		}
		
		return desconto;
	}
	
	public static void exibeUltimoNum() {
		System.out.println(Apolice.ultimoNumApolice);
		
	}
	
	
}
