package models;

import java.util.ArrayList;

/**
 * Classe Cachorro
 * @author bruno e luis
 * @since 2023
 * @version 1.3
 */


public class Cachorro extends Animal {
	private String situacaoFucinho;

	
	/**
	 * Construtor que recebe os atributos.
	 * @param nomeDono
	 * @param idadeDono
	 * @param nome
	 * @param especie
	 * @param genero
	 * @param raca
	 * @param idade
	 * @param altura
	 * @param situacaoFucinho
	 */
	
	public Cachorro(String nomeDono, int idadeDono, String nome, String especie, String genero, String raca,
			int idade, String altura, String situacaoFucinho, ArrayList<Vacina> vacinas) {
		super(nomeDono, idadeDono, nome, especie, raca, genero, idade, altura, vacinas);
		this.situacaoFucinho = situacaoFucinho;
	}

	public Cachorro() {

	}

	 /**
     * gets e sets dos atributos da classe Cachorro.
     * @return String
     */
	
	public String getSituacaoFucinho() {
		return situacaoFucinho;
	}

	public void setSituacaoFucinho(String situacaoFucinho) {
		this.situacaoFucinho = situacaoFucinho;
	}

	public String toString() {
		return "Nome Dono: " + getNomeDono() + "\n\nIdade Dono: " + getIdadeDono() + "\n\nNome: " + getNome()
				+ "\n\nEspecie: " + getEspecie() + "\n\nRaca: " + getRaca() + "\n\nGenero: " + getGenero()
				+ "\n\nIdade: " + getIdadePet() + "\n\nPorte: " + getAltura() + "\n\nSituacao fucinho: "
				+ getSituacaoFucinho() + "\n";
	}
}