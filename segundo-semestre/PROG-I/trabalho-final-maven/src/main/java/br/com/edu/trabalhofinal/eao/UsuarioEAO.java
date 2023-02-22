package br.com.edu.trabalhofinal.eao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import br.com.edu.trabalhofinal.entidades.Usuario;

/**
 * 
 * @author biasi
 *
 */

public class UsuarioEAO extends GenericEAO<Usuario> {

	private Usuario clazz;

	@Override
	public void insert(Usuario usuario) throws SQLException {
		connect();
		String sql = " INSERT INTO USUARIO (IDUSUARIO, NOME) VALUES(?,?)";

		PreparedStatement prepState = conn.prepareStatement(sql);
		prepState.setLong(1, usuario.getIdUsuario());
		prepState.setString(2, usuario.getNome());
		prepState.executeUpdate();
		System.out.println("Usuario inserido");
		prepState.close();
		disconnect();

	}

	@Override
	public void update(Usuario usuario) throws SQLException {
		connect();

		String sql = "UPDATE USUARIO SET nome = ? WHERE id = ?";

		PreparedStatement prepState = conn.prepareStatement(sql);
		prepState.setString(1, usuario.getNome());
		prepState.setLong(2, usuario.getIdUsuario());

		prepState.executeUpdate();
		System.out.println("Usuario atualizado");
		prepState.close();
		disconnect();
	}

	@Override
	public Usuario find(Long id) throws SQLException {
		connect();

		String query = "SELECT IDUSUARIO, NOME FROM USUARIO WHERE IDUSUARIO = " + id.toString();

		PreparedStatement pstmt = conn.prepareStatement(query);
		ResultSet rs = pstmt.executeQuery();

		if (Objects.nonNull(rs))
			clazz = new Usuario(rs.getLong("IDUSUARIO"), rs.getString("NOME"));

		rs.close();
		pstmt.close();
		disconnect();

		return this.clazz;
	}

	@Override
	public List<Usuario> findAll() throws SQLException {

		connect();

		List<Usuario> lista = new ArrayList<>();

		String query = "SELECT IDUSUARIO, NOME FROM USUARIO ";

		PreparedStatement pstmt = conn.prepareStatement(query);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			Usuario usuario = new Usuario(rs.getLong("IDUSUARIO"), rs.getString("NOME"));
			lista.add(usuario);
		}

		rs.close();
		pstmt.close();
		disconnect();
		return lista;
	}

	@Override
	public void delete(Usuario objeto) {
		// TODO Auto-generated method stub
	}
	
}
