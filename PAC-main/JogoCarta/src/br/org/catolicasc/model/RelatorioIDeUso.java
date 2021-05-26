package br.org.catolicasc.model;

import java.util.Date;

public class RelatorioIDeUso {
	
	private int id_rel_uso;
	private Date dt_entrada;
	private Date dt_saida;
	
	
	public int getId_rel_uso() {
		return id_rel_uso;
	}
	public void setId_rel_uso(int id_rel_uso) {
		this.id_rel_uso = id_rel_uso;
	}
	public Date getDt_entrada() {
		return dt_entrada;
	}
	public void setDt_entrada(Date dt_entrada) {
		this.dt_entrada = dt_entrada;
	}
	public Date getDt_saida() {
		return dt_saida;
	}
	public void setDt_saida(Date dt_saida) {
		this.dt_saida = dt_saida;
	}
	
	
}
