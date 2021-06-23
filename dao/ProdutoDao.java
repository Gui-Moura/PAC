/*package br.com.atividade.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.atividade.dao.SingleConnection;
import br.com.atividade.model.ModelProdMarcaCatFunc;
import br.com.atividade.model.ModelProduto;

public class ProdutoDao {

	private Connection connection;

	// CONEXAO
	public ProdutoDao() {
		connection = SingleConnection.getConnection();
	}

	// METODO DE INSERT
	public void cadProduto(ModelProduto produto) {

		try {

			String insertProduto = "INSERT INTO produto (descProduto, preco, quantidade, idMarca, idCategoria, idFunc) VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(insertProduto);

			ps.setString(1, produto.getDescProduto());
			ps.setDouble(2, produto.getPreco());
			ps.setInt(3, produto.getQuantidade());
			ps.setInt(4, produto.getIdMarca());
			ps.setInt(5, produto.getIdCategoria());
			ps.setInt(6, produto.getIdFunc());
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

	// METODO DE SELECT
	public List<ModelProduto> listProduto(List<ModelProduto> produto) {

		produto.clear();

		try {

			String selectProd = "SELECT * from produto";

			PreparedStatement ps = connection.prepareStatement(selectProd);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				ModelProduto prod = new ModelProduto();

				prod.setIdProduto(rs.getInt("idProduto"));
				prod.setDescProduto(rs.getString("descProduto"));
				prod.setPreco(rs.getDouble("preco"));
				prod.setQuantidade(rs.getInt("quantidade"));
				prod.setIdMarca(rs.getInt("idMarca"));
				prod.setIdCategoria(rs.getInt("idCategoria"));

				produto.add(prod);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return produto;
	}

	// METODO DE SELECT COM INNER JOIN
	public List<ModelProdMarcaCatFunc> listProdMarcaCatFunc(List<ModelProdMarcaCatFunc> produto) {

		produto.clear();
		try {
			String selectProd = "SELECT produto.idProduto, produto.descProduto, produto.preco, produto.quantidade, ";
			selectProd += "marca.descMarca, categoria.descCategoria, funcionario.idFunc, funcionario.email, funcionario.salario ";
			selectProd += "FROM produto ";
			selectProd += "INNER JOIN marca ";
			selectProd += "ON produto.idMarca = marca.idMarca ";
			selectProd += "INNER JOIN categoria ";
			selectProd += "ON produto.idCategoria = categoria.idCategora ";
			selectProd += "INNER JOIN funcionario ";
			selectProd += "ON produto.idFunc = funcionario.idFunc; ";

			PreparedStatement ps;

			ps = connection.prepareStatement(selectProd);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				ModelProdMarcaCatFunc prodMarcaCatFunc = new ModelProdMarcaCatFunc();

				prodMarcaCatFunc.setIdProduto(rs.getInt("idProduto"));
				prodMarcaCatFunc.setDescProduto(rs.getString("descProduto"));
				prodMarcaCatFunc.setPreco(rs.getDouble("preco"));
				prodMarcaCatFunc.setQuantidade(rs.getInt("quantidade"));
				// prodMarcaCatFunc.setIdMarca(rs.getInt("marca.idMarca"));
				prodMarcaCatFunc.setDescMarca(rs.getString("descMarca"));
				// prodMarcaCatFunc.setIdCategoria(rs.getInt("idCategoria"));
				prodMarcaCatFunc.setDescCategoria(rs.getString("descCategoria"));
				prodMarcaCatFunc.setIdFunc(rs.getInt("idFunc"));
				prodMarcaCatFunc.setEmail(rs.getString("email"));
				prodMarcaCatFunc.setSalario(rs.getDouble("salario"));

				produto.add(prodMarcaCatFunc);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return produto;

	}

	// METODO DE DELETE
	public void deleteProduto(int produto) {

		try {
			String deleteProd = "DELETE FROM produto WHERE idProduto = ?";
			PreparedStatement ps = connection.prepareStatement(deleteProd);
			ps.setInt(1, produto);
			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// METODO DE UPADTE
	public void updateProduto(ModelProduto produto) {

		try {
			String editarProd = "UPDATE produto SET descProduto = ?, preco = ?, quantidade = ?, idMarca = ?, idCategoria = ?, idFunc = ? WHERE idProduto = ?";
			PreparedStatement ps = connection.prepareStatement(editarProd);

			ps.setString(1, produto.getDescProduto());
			ps.setDouble(2, produto.getPreco());
			ps.setInt(3, produto.getQuantidade());
			ps.setInt(4, produto.getIdMarca());
			ps.setInt(5, produto.getIdCategoria());
			ps.setInt(6, produto.getIdFunc());
			ps.setInt(7, produto.getIdProduto());
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

}
*/