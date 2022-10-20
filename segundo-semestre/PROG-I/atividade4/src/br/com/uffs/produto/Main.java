package br.com.uffs.produto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("SAMSUNG Galaxy A51", 1599, 50);
		Produto p2 = new Produto("SAMSUNG Galaxy A32", 1689, 20);
		Produto p3 = new Produto("APLLE IPHONE 12", 4700, 8);
		Produto p4 = new Produto("XIAOMI REDMI NOTE 9", 1399, 29);
		Produto p5 = new Produto("APLLE IPHONE 11 PRO", 3900, 3);
		
		Produto[] listaProdutos = {p1,p2,p3,p4,p5,{}};
		
		start();
		
	}

	private static void start() {
		System.out.println("========================================");
		System.out.println("          |"+"TELA DE SELECAO"+"|          ");
		System.out.println("========================================");
		
		menuSelecao();		
	}

	private static void menuSelecao() {
		System.out.println("Selecione a acao que deseja realizar:");
		System.out.println("Cadastrar produto    (1): \n" 
				+ "Consultar estoque    (2): \n" 
				+ "Remover unidades     (3): \n" 
				+ "Adicionar unidades   (4): \n"
				+ "Sair                 (9): \n"
				);		
		
		verificaResposta(recebeResposta());
	}

	private static String recebeResposta() {
		Scanner input = new Scanner(System.in);
		System.out.print("Sua resposta: ");
		String resposta = input.nextLine();
		return resposta;		
	}

	private static void verificaResposta(String resposta) {
		if (resposta.equals("1")) {
			System.out.println("Cadastro de produto");
			cadastrarProduto();			
		}else if (resposta.equals("2")) {
			System.out.println("Consulta de estoque");
			
		}else if (resposta.equals("3")) {
			System.out.println("Remover unidades");
			
		}else if (resposta.equals("4")) {
			System.out.println("Adicionar unidades");
			
		}else if (resposta.equals("9")) {
			System.out.println("Sair");
			
		}else {
			menuSelecao();
		}
				
	}

	private static void cadastrarProduto() {
		Produto produto = new Produto
		
	}
	
	
	

}
