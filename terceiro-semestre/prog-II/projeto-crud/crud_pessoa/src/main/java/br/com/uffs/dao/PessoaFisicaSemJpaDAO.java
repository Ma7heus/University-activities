package br.com.uffs.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import br.com.uffs.model.PessoaFisica;
import br.com.uffs.util.DbUtil;

public class PessoaFisicaSemJpaDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private DataSource ds;

	 public PessoaFisica findById(Long id) {
		 PessoaFisica u = new PessoaFisica();
	    	Connection con = null;
	    	PreparedStatement ps = null;
	    	ResultSet rs = null;
	    	try {
				con = this.ds.getConnection();
				ps = con.prepareStatement(new QueryPessoaFisica().findById());
				ps.setLong(1, id);
				rs = ps.executeQuery();
				if (rs.next()) {
					u.setIdPessoaFisica(rs.getLong("IDPESSOAFISICA"));
					u.setNome(rs.getString("NOME"));
					u.setNomeSocial(rs.getString("NOMESOCIAL"));
				    u.setCpf(rs.getString("CPF"));
				    u.setAltura(rs.getBigDecimal("ALTURA"));
				    u.setMassa(rs.getBigDecimal("MASSA"));
				    u.setGenero(rs.getString("GENERO"));
				    u.setIdade(rs.getLong("IDADE"));
				    u.setEmail(rs.getString("EMAIL"));
				    u.setTelefone(rs.getString("TELEFONE"));
				    u.setEndereco(rs.getString("ENDERECO"));
				}
			} catch (SQLException e) {e.printStackTrace();
			} finally {
				DbUtil.closeResultSet(rs);
				DbUtil.closePreparedStatement(ps);
				DbUtil.closeConnection(con);
			}
	        return u;
	    }
	
	 public List<PessoaFisica> listAll() {
	    	List<PessoaFisica> pessoaFisicaList = new ArrayList<PessoaFisica>();
	    	Connection con = null;
	    	PreparedStatement ps = null;
	    	ResultSet rs = null;
	    	try {
				con = this.ds.getConnection();
				ps = con.prepareStatement(new QueryPessoaFisica().getAllPessoaFisica());
				rs = ps.executeQuery();
				while (rs.next()) {
					PessoaFisica u = new PessoaFisica();
					u.setIdPessoaFisica(rs.getLong("IDPESSOAFISICA"));
					u.setNome(rs.getString("NOME"));
					u.setNomeSocial(rs.getString("NOMESOCIAL"));
				    u.setCpf(rs.getString("CPF"));
				    u.setAltura(rs.getBigDecimal("ALTURA"));
				    u.setMassa(rs.getBigDecimal("MASSA"));
				    u.setGenero(rs.getString("GENERO"));
				    u.setIdade(rs.getLong("IDADE"));
				    u.setEmail(rs.getString("EMAIL"));
				    u.setTelefone(rs.getString("TELEFONE"));
				    u.setEndereco(rs.getString("ENDERECO"));
				    pessoaFisicaList.add(u);
				}
			} catch (SQLException e) {e.printStackTrace();
			} finally {
				DbUtil.closeResultSet(rs);
				DbUtil.closePreparedStatement(ps);
				DbUtil.closeConnection(con);
			}
	        return pessoaFisicaList;
	    }
}
