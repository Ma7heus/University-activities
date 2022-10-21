package br.com.uffs.produto;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Produto[] listaProdutos = new Produto[1];

	public static void main(String[] args) {

		start();

	}

	private static void start() {
		
		System.out.println("========================================");
		System.out.println("          |" + "TELA DE SELECAO" + "|          ");
		System.out.println("========================================");

		menuSelecao();
	}


	private static void menuSelecao() {
		System.out.println("Selecione a acao que deseja realizar:");
		System.out.println("Cadastrar produto    (1): \n" + "Consultar estoque    (2): \n"
				+ "Remover unidades     (3): \n" + "Adicionar unidades   (4): \n" + "Sair                 (9): \n");

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
			cadastraProdutos();

		} else if (resposta.equals("2")) {
			System.out.println("Consulta de estoque");
			int CodProduto = recebeProduto();
			System.out.println("Quantidade exitente do produto " 
					+ listaProdutos[CodProduto] + " e de: " 
					+ listaProdutos[CodProduto].getQuantidade());
			
			System.out.println();
			menuSelecao();

		} else if (resposta.equals("3")) {
			System.out.println("Remover unidades");

		} else if (resposta.equals("4")) {
			System.out.println("Adicionar unidades");

		} else if (resposta.equals("9")) {
			System.out.println("Sair");
			System.exit(1);

		} else {
			menuSelecao();
		}

	}

	
	private static int recebeProduto(){
		Scanner a = new Scanner(System.in);
		System.out.println("Digite o produto que deseja consultar");
		int num = a.nextInt();
		
		if (listaProdutos == null) {
			System.out.println("A lista de produtos esta vazia, e necesssario cadastrar.");

		}else if (listaProdutos.length < num) {
			System.out.println("O produto selecionando nao existe, selecione outro!");
			return recebeProduto();
		}		
		
		return num;
	}
	
	private static void cadastraProdutos() {

		for (int i = 0; i < Main.listaProdutos.length; i++) {
			Scanner n = new Scanner(System.in);

			System.out.print("Digite o nome do produto: ");
			String nome = n.next();

			System.out.print("Digite o codigo do produto: ");
			float valor = n.nextFloat();

			System.out.print("Digite a quantidade: ");
			int quant = n.nextInt();
			listaProdutos[i] = new Produto(nome, valor, quant);
		}

		menuSelecao();
	}

}
