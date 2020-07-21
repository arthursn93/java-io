package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente Bitbank
 * @author arthurnunes
 * 
 */
public class Cliente implements Serializable {
	/**
	 * serialVersionUID define a versão atual da classe e esse valor 
	 * fica gravado na representação binária do objeto.
	 */
	private static final long serialVersionUID = -2749019174744817070L;
	private String nome;
	private String cpf;
	private String profissao;
	
	/**
	 * Construtor para inicializar o objeto Cliente a partir do nome, cpf e profissão
	 * @param nome
	 * @param cpf
	 * @param profissao
	 */
	public Cliente(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getProfissao() {
		return this.profissao;
	}
	
	@Override
	public String toString() {
		return "CPF: " + this.cpf;
	}
	
}

