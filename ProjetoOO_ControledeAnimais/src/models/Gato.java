package models;

import java.util.ArrayList;

/**
 * Classe Gato
 * @author bruno e luis
 * @since 2023
 * @version 1.3
 */

public class Gato extends Animal {
	private String pelagem;

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
	 * @param pelagem
	 */
	
	public Gato(String nomeDono, int idadeDono, String nome, String especie, String genero, String raca, 
			int idade,String altura, String pelagem, ArrayList<Vacina> vacinas) {
		super(nomeDono, idadeDono, nome, especie, raca, genero, idade, altura, vacinas);
		this.pelagem = pelagem;
	}

	public Gato() {

	}

	/**
	 * Gets e Sets da classe Gato.
	 * @return String
	 */
	
	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public String toString() {
		return "Nome Dono: " + getNomeDono() + "\n\nIdade Dono: " + getIdadeDono() + "\n\nNome: " + getNome()
				+ "\n\nEspecie: " + getEspecie() + "\n\nRaca: " + getRaca() + "\n\nGenero: " + getGenero()
				+ "\n\nIdade: " + getIdadePet() + "\n\nPorte: " + getAltura() + "\n\nPelagem: " + getPelagem() + "\n";
	}
}
