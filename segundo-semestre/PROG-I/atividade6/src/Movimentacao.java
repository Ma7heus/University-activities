import java.util.Date;

public class Movimentacao {
	private Date dataMovimentacao = new Date();
	private Double valorOperacao;
	private String tipoOperacao;
	
	public Movimentacao(Date dataMovimentacao, Double valorOperacao, String tipoOperacao) {
		this.dataMovimentacao = dataMovimentacao;
		this.valorOperacao = valorOperacao;
		this.tipoOperacao = tipoOperacao;
	}
	
	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}
	public void setDataMovimentacao(Date dataMovimentacao) {
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
