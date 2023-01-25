package br.com.uffs.blog;

import java.util.List;
import java.util.Scanner;

public class Blog {
	
	private List<Post> posts;
	
	public void showAll() {
		for (Post post : this.posts) {
			post.show();
		}
	}

	void readData(Post post) {
		post.show();
	}
	
	public void init() {
		opcoesMenu();
	}

	
	private void msg(String texto) {
		System.out.println(texto);
	}
	
	private void opcoesMenu() {
		msg("BLOG: O que deseja fazer? ");
		msg("1 - Novo post de noticia ");
		msg("2 - Nova resenha de produto ");
		msg("3 - Novo post de outros assuntos ");
		msg("4 - Listar todas as postagens ");
		msg("5 - Novo post de noticia ");
		msg("6 - Nao curtir uma postagem");
		msg("10 - Sair ");
		msg("Escolha a opcao: ");
		userInput();
		
	}

	private void userInput() {
		try (Scanner scanner = new Scanner(System.in)) {
			int userInput = scanner.nextInt();
			
			switch (userInput) {
			
				case 1:
					msg("Novo post de noticia");
					break;
				case 2:
					msg("Nova resenha de produto");
					break;
				case 3:
					msg("Novo post de outros assuntos");
				
			
			
			}
		}
		
	}
	
	
	
	
	
}
