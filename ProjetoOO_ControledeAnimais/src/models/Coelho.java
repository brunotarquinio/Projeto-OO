package models;

import java.util.ArrayList;

/**
 * Classe Coelho
 * @author bruno e luis
 * @since 2023
 * @version 1.3
 */


public class Coelho extends Animal {
	private String situacaoDosDentes;

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
	 * @param situacaoDosDentes
	 */
	
	public Coelho(String nomeDono, int idadeDono, String nome, String especie, String genero, String raca, 
			int idade,String altura, String situacaoDosDentes, ArrayList<Vacina> vacinas) {
		super(nomeDono, idadeDono, nome, especie, raca, genero, idade, altura, vacinas);
		this.situacaoDosDentes = situacaoDosDentes;
	}

	public Coelho() {

	}

	/**
	 * Gets e sets da classe Coelho
	 * @return String
	 */
	
	public String getSituacaoDosDentes() {
		return situacaoDosDentes;
	}

	public void setSituacaoDosDentes(String situacaoDosDentes) {
		this.situacaoDosDentes = situacaoDosDentes;
	}

	public String toString() {
		return "Nome Dono: " + getNomeDono() + "\n\nIdade Dono: " + getIdadeDono() + "\n\nNome: " + getNome()
				+ "\n\nEspecie: " + getEspecie() + "\n\nRaca: " + getRaca() + "\n\nGenero: " + getGenero()
				+ "\n\nIdade: " + getIdadePet() + "\n\nPorte: " + getAltura() + "\n\nSituacao dos dentes: "
				+ getSituacaoDosDentes() + "\n";
	}
}