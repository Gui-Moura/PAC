package br.com.atividade.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import br.com.atividade.dao.FuncaoDao;
import br.com.atividade.dao.SingleConnection;
import br.org.catolicasc.model.Usuario;

public class FuncaoController {

	// METODO CADASTRAR FUNCAO
	public static Usuario cadUsuario(JTextField textNome, JPasswordField textSenha, JTextField textFuncao) {
		Connection connection = SingleConnection.getConnection();
		Usuario usuario = new Usuario();
		String usuarioComp = "";
		boolean erro = false;
		String aux = textNome.getText() + "@" + textFuncao.getText();
		System.out.println(aux);
		
		try {

			if (textNome.getText().trim().equals("") || textSenha.getText().trim().equals("") ) {
				JOptionPane.showMessageDialog(null, "Impossível cadastrar!!!");

				erro = true;
				
			} else {
				try {
                	String insertFuncao = ("Select nm_usuario from usuario where nm_usuario=?");
        			PreparedStatement ps = connection.prepareStatement(insertFuncao);	           

                    ps.setString(1, aux);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                    	JOptionPane.showMessageDialog(null, "Impossível cadastrar!!! Nome de usuário ja está sendo utilizado em mesma função");
                    } else {
                    	usuarioComp = aux.toLowerCase();
        				usuario.setNm_usuario(usuarioComp);
        				usuario.setSenha(textSenha.getText());
        				JOptionPane.showMessageDialog(null, "Usuario cadastrado!!!");
                        
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
				
				
				

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

