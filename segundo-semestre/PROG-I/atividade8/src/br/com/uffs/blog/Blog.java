package br.com.uffs.blog;

import java.util.List;
import java.util.Scanner;

public class Blog {
	
	private List<Post> posts;
	
	private OpcoesMenuImpl opcoesMenu;
	
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

	
	void msg(String texto) {
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
			Integer userInput = scanner.nextInt();
			opcoesMenu.novoPostNoticia(userInput);
		}
	}
}
