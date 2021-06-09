package br.com.atividade.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.atividade.dao.SingleConnection;
import br.org.catolicasc.model.Usuario;

public class LoginDao {

	private Connection connection;

	// CONEXAO
	public LoginDao() {
		connection = SingleConnection.getConnection();
	}

	// METODO DE INSERT
	public void login(Usuario usuario) {

		try {
			String insertFuncao = "INSERT INTO usuario (nm_usuario, senha) VALUES (?,?)";
			PreparedStatement ps = connection.prepareStatement(insertFuncao);

			ps.setString(1, usuario.getNm_usuario());
			ps.setString(2, usuario.getSenha());
			ps.execute();

			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();

			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}

	}
	
	
/*
	// METODO DE SELECT
	public List<ModelFuncao> listFuncao(List<ModelFuncao> funcoes) {

		funcoes.clear();

		try {
			String selectFuncao = "SELECT * FROM funcao";
			PreparedStatement ps = connection.prepareStatement(selectFuncao);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				ModelFuncao funcao = new ModelFuncao();
				funcao.setIdFuncao(rs.getInt("idFuncao"));
				funcao.setDescFuncao(rs.getString("descFuncao"));

				funcoes.add(funcao);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return funcoes;
	}

	// METODO DE DELETE
	public void deleteFuncao(int funcao) {

		try {
			String deleteFuncao = "DELETE FROM funcao WHERE idFuncao = ?";
			PreparedStatement ps = connection.prepareStatement(deleteFuncao);
			ps.setInt(1, funcao);
			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// METODO DE UPDATE
	public void updateFuncao(ModelFuncao funcao) {

		try {
			String editarFuncao = "UPDATE funcao SET descFuncao = ? WHERE idFuncao = ?";
			PreparedStatement ps = connection.prepareStatement(editarFuncao);

			ps.setString(1, funcao.getDescFuncao());
			ps.setInt(2, funcao.getIdFuncao());
			ps.execute();

			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();

			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}
	}*/

}
