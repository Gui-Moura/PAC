package br.org.catolicasc.model;

public class Usuario {
	
	private int id_usuario;
	private String nm_usuario;
	private String senha;
	
	
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNm_usuario() {
		return nm_usuario;
	}
	public void setNm_usuario(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String gerarRelatorioDeUso() {
		return this.gerarRelatorioDeUso();
	}
	
	public String gerarRelatorioDeDes() {
		return this.gerarRelatorioDeDes();
	}
	
	public void cadastrarUsuario(int id, String nome, String senha) {
		
	}
	
	public void editarUsuario(int id, String nome, String senha) {
		
	}
	
	public void listarUsuarios(){
		
	}
}

	