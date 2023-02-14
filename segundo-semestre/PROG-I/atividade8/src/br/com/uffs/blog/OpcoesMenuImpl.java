package br.com.uffs.blog;

public class OpcoesMenuImpl implements OpcoesMenu {

	private Blog blog;
	
	@Override
	public void novoPostNoticia(Integer opcaoSelecionada) {
		if(opcaoSelecionada.equals(1L)) {
			blog.msg("Postando Noticia");
		} else {
			novaResenhaProduto(opcaoSelecionada);
		}
	}

	@Override
	public void novaResenhaProduto(Integer opcaoSelecionada) {
		if(opcaoSelecionada.equals(2L)) {
			blog.msg("Nova resenha de produto");
		} else {
			novoPostOutrosAssuntos(opcaoSelecionada);
		}
		
	}

	@Override
	public void novoPostOutrosAssuntos(Integer opcaoSelecionada) {
		if(opcaoSelecionada.equals(3L)) {
			blog.msg("Novo post de outros assuntos");
		} else {
			ListarTodasPostagens(opcaoSelecionada);
		}
		
	}

	@Override
	public void ListarTodasPostagens(Integer opcaoSelecionada) {
		if(opcaoSelecionada.equals(4L)) {
			blog.msg("Listar todas postagens");
		} else {
			curtirPostagem(opcaoSelecionada);
		}
		
	}

	@Override
	public void curtirPostagem(Integer opcaoSelecionada) {
		if(opcaoSelecionada.equals(5L)) {
			blog.msg("Curtir uma postagem");
		} else {
			naoCurtirPostagem(opcaoSelecionada);
		}
	}

	@Override
	public void naoCurtirPostagem(Integer opcaoSelecionada) {
		if(opcaoSelecionada.equals(6L)) {
			blog.msg("Nao curtir uma postagem");
		} else {
			sair(opcaoSelecionada);
		}
	}

	@Override
	public void sair(Integer opcaoSelecionada) {
		if(opcaoSelecionada.equals(10L)) {
			blog.msg("Sair");
		} else {
			blog.msg("Opcao selecionada nao existente, tente novamente");
			
		}
		
	}
	
	

}
