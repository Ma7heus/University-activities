package br.com.uffs.jogoAdivinhacao;

public class GuessGame {
	private Player p1;
	private Player p2;
	private Player p3;

	public void StarGame() {		
		int targuetNumber;
		targuetNumber = (int) (Math.random() * 10);
		System.out.println("Estou pensando em um numero entre 0 e 9...");
		System.out.println("O numero a adivinhar é " + targuetNumber);
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

	
		
		boolean p1IsRight = false;
		boolean p2IsRight = false;
		boolean p3IsRight = false;
	
			
		while(true) {			
						
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.getNumero();
			System.out.println("O jogador um forneceu o palpite " + guessp1);
			
			guessp2 =  p2.getNumero();
			System.out.println("O jogador dois forneceu o palpite " + guessp2);
			
			guessp3 = p3.getNumero();
			System.out.println("O jogador dois forneceu opalpite " + guessp3);
			
			
			if (guessp1 == targuetNumber) {
				p1IsRight = true;
			}
			if (guessp2 == targuetNumber) {
				p2IsRight = true;
			}
			if (guessp3 == targuetNumber) {
				p3IsRight = true;
			}
			
			
			if (p1IsRight || p2IsRight || p3IsRight) {
				System.out.println();
				System.out.println(" *** Temos um vencedor! ***");		
				System.out.println();
				
				System.out.println("O jogador um acertou? " + p1IsRight);
				System.out.println("O jogador dois acertou? " + p2IsRight);
				System.out.println("O jogador tres acertou? " + p3IsRight);
				System.out.println("Fim do jogo..");
				break;
				
			}else {
				System.out.println("OS JOGADORES DEVERÃO TENTAR NOVAMENTE...");
				System.out.println("----------------------------------------");
			}					
		}	
	}
}
