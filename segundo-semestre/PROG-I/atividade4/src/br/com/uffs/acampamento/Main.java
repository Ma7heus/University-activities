package br.com.uffs.acampamento;

public class Main {

	public static void main(String[] args) {

		Acampamento a1 = new Acampamento("Matheus", 21);
		Acampamento a2 = new Acampamento("Pedro", 32);
		Acampamento a3 = new Acampamento("Lucas", 8);
		Acampamento a4 = new Acampamento("Maria", 98);
		Acampamento a5 = new Acampamento("Gustavo", 52);
		Acampamento a6 = new Acampamento("Amanda", 19);
		Acampamento a7 = new Acampamento("Isadora", 32);
		Acampamento a8 = new Acampamento("Paula", 20);
		Acampamento a9 = new Acampamento("Igor", 17);
		Acampamento a10 = new Acampamento("Luiz", 12);

		Acampamento[] lista = {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10};
		for (Acampamento acampamento : lista) {
			acampamento.definirEquipe();
			System.out.println(acampamento.toString());
		}

		
		


	
		

		
		
	}

}
