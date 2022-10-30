

public class Main {

	public static void main(String[] args) {

		
		
		Cliente matheus = new Cliente("Matheus", "123.515.115-51");
		Cliente andressa = new Cliente("Andressa", "564.487.321-98");
		
		ContaEspecial ce1 = new ContaEspecial(201, 150, "Pedrinho", 100, 0.05, matheus);
		Investimento i1 = new Investimento(301,50,"Maria", 0.08, matheus);

		
		ce1.depositar(150);
		i1.depositar(500);
		ce1.depositar(200);
		ce1.sacar(50);
		i1.depositar(2000);
		
		ce1.extrato();
		i1.extrato();
		
		System.out.println();
		
		CarteiraPrime carteiraPrime =  new CarteiraPrime();
		carteiraPrime.adicionar(andressa);
		carteiraPrime.adicionar(matheus);
		
		carteiraPrime.listar();
		

	}

}
