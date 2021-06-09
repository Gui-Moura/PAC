package br.com.atividade.controller;

import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import br.com.atividade.dao.FuncaoDao;

import br.org.catolicasc.model.Usuario;

public class LoginController {

	// METODO CADASTRAR FUNCAO
	public static Usuario cadUsuario(JTextField textNome, JPasswordField textSenha) {

		Usuario usuario = new Usuario();

		boolean erro = false;

		try {

			if (textNome.getText().trim().equals("") || textSenha.getText().trim().equals("") ) {
				JOptionPane.showMessageDialog(null, "Impossível cadastrar!!!");

				erro = true;
				
			} else {
				usuario.setNm_usuario(textNome.getText());
				usuario.setSenha(textSenha.getText());
				JOptionPane.showMessageDialog(null, "Função cadastrada!!!");

			}

		} catch (ClassCastException e) {
			JOptionPane.showMessageDialog(null, "Inválido");
			erro = true;
		}
	
		return usuario;
	}

/*
	// METODO EDITAR FUNCAO
	public static void editFuncao (List<ModelFuncao> funcao, JComboBox comboBoxEscolha, JTextPane textPaneDesc) {

		FuncaoDao funcaoDao = new FuncaoDao();
		ModelFuncao func = new ModelFuncao();

		func.setIdFuncao(funcao.get(comboBoxEscolha.getSelectedIndex()).getIdFuncao());
		func.setDescFuncao(textPaneDesc.getText());

		int index = comboBoxEscolha.getSelectedIndex();

		funcao.set(comboBoxEscolha.getSelectedIndex(), func);

		funcaoDao.updateFuncao(funcao.get(index));

	}*/

}

