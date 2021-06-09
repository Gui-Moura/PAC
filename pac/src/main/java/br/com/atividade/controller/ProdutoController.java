package br.com.atividade.controller;

import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextPane;

import br.com.atividade.dao.ProdutoDao;
import br.com.atividade.model.ModelFuncionario;
import br.com.atividade.model.ModelMarca;
import br.com.atividade.model.ModelPessoa;
import br.com.atividade.model.ModelProduto;
import br.com.atividade.model.ModelCategoria;
import br.com.atividade.model.ModelEndereco;

public class ProdutoController {

	// METODO PARA CADASTRAR PRODUTO
	public static ModelProduto cadProduto(JTextPane textPaneDesc, JSpinner spnPreço, JSpinner spnQuantidade,
			List<ModelProduto> produto, List<ModelMarca> marc, List<ModelFuncionario> func, List<ModelCategoria> cat,
			JComboBox comboBoxMarc, JComboBox comboBoxCat, JComboBox comboBoxFuncio, int idFuncionario, int idCategoria,
			int idMarca) {

		int idFunc = comboBoxFuncio.getSelectedIndex();
		int idCat = comboBoxCat.getSelectedIndex();
		int idMarc = comboBoxMarc.getSelectedIndex();
		ModelProduto prod = new ModelProduto();

		try {

			if (textPaneDesc.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(null, "Descricao nao informado para cadastro!", "ATENCAO!", 2);

			} else {

				prod.setDescProduto(textPaneDesc.getText());
				prod.setPreco((Double) spnPreço.getValue());
				prod.setQuantidade((Integer) spnQuantidade.getValue());

				prod.setIdMarca(marc.get(idMarc).getIdMarca());
				prod.setIdCategoria(cat.get(idCat).getIdCategora());
				prod.setIdFunc(func.get(idFunc).getIdFunc());
				JOptionPane.showMessageDialog(null, "Produto cadastrado!!!");

			}

		} catch (ClassCastException e) {
			JOptionPane.showMessageDialog(null, "Campos nao preenchidos corretamente!", "Ops! Algo deu errado!",
					JOptionPane.ERROR_MESSAGE);
		}

		produto.add(prod);
		return prod;
	}

	// METODO PARA EDITAR PRODUTO
	public static void editProduto(JTextPane textPaneDesc, List<ModelProduto> prod, List<ModelMarca> marca,
			List<ModelFuncionario> funcionario, List<ModelCategoria> categoria, JComboBox comboBoxMarc,
			JComboBox comboBoxFunc, JComboBox comboBoxProd, JComboBox comboBoxCat, JSpinner spnPreco,
			JSpinner spinnerQtd) {

		ProdutoDao produtoDao = new ProdutoDao();
		ModelProduto produto = new ModelProduto();

		int idProd = prod.get(comboBoxProd.getSelectedIndex()).getIdProduto();
		int idMarca = marca.get(comboBoxMarc.getSelectedIndex()).getIdMarca();
		int idFunc = funcionario.get(comboBoxFunc.getSelectedIndex()).getIdFunc();
		int idCat = categoria.get(comboBoxCat.getSelectedIndex()).getIdCategora();

		produto.setIdProduto(idProd);
		
		produto.setDescProduto(textPaneDesc.getText());
		produto.setPreco((Double) spnPreco.getValue());
		produto.setQuantidade((Integer)spinnerQtd.getValue());
		produto.setIdMarca((idMarca));
		produto.setIdCategoria((idCat));
		produto.setIdFunc((idFunc));
		
		int index = comboBoxProd.getSelectedIndex();

		prod.set(index, produto);

		produtoDao.updateProduto(prod.get(index));

	}

}
