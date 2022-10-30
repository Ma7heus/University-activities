import java.time.LocalDate;

public class Movimentacao {
	private LocalDate dataMovimentacao = LocalDate.now();
	private Double valorOperacao;
	private String tipoOperacao;
	
	public Movimentacao(LocalDate dataMovimentacao, Double valorOperacao, String tipoOperacao) {
		this.dataMovimentacao = dataMovimentacao;
		this.valorOperacao = valorOperacao;
		this.tipoOperacao = tipoOperacao;
	}
	
	public Movimentacao(Double valorOperacao, String tipoOperacao) {
		this.valorOperacao = valorOperacao;
		this.tipoOperacao = tipoOperacao;
	}
	
	
	
	@Override
	public String toString() {
		return "Movimentacao [dataMovimentacao: " + dataMovimentacao + ", valorOperacao: " + valorOperacao
				+ ", tipoOperacao" + tipoOperacao + "]";
	}



	public LocalDate getDataMovimentacao() {
		return dataMovimentacao;
	}
	public void setDataMovimentacao(LocalDate dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}
	public Double getValorOperacao() {
		return valorOperacao;
	}
	public void setValorOperacao(Double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}
	public String getTipoOperacao() {
		return tipoOperacao;
	}
	public void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	
}
