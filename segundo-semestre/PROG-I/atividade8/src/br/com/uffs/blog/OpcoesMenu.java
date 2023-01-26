package br.com.uffs.blog;

public interface OpcoesMenu {

	public void novoPostNoticia(Integer opcaoSelecionada);
	
	public void novaResenhaProduto(Integer opcaoSelecionada);
	
	public void novoPostOutrosAssuntos(Integer opcaoSelecionada);
	
	public void ListarTodasPostagens(Integer opcaoSelecionada);
	
	public void curtirPostagem(Integer opcaoSelecionada);
	
	public void naoCurtirPostagem(Integer opcaoSelecionada);
	
	public void sair(Integer opcaoSelecionada);
	
}
