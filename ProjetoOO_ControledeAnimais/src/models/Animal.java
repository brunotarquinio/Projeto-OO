package models;

import java.util.ArrayList;

/**
 * Classe Animal.
 * Declaracao dos atributos da classe Animal.
 * @author bruno e luis
 * @since 2023
 * @version 1.3
 */

public abstract class Animal { 
	private String nomeDono;
	private int idadeDono;
	private String nome;
	private String especie;
	private String raca;
	private String genero;
	private int idade;
	private String altura;
	private ArrayList<Vacina> vacinas;

	/**
	 * Construtor Animal. 
	 * @param nomeDono
	 * @param idadeDono
	 * @param nome
	 * @param especie
	 * @param raca
	 * @param genero
	 * @param idade
	 * @param peso
	 * @param altura
	 */

	public Animal(String nomeDono, int idadeDono, String nome, String especie, String raca, String genero, 
			int idade, String altura, ArrayList<Vacina> vacinas) {
		this.nomeDono = nomeDono;
		this.idadeDono = idadeDono;
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
		this.genero = genero;
		this.idade = idade;
		this.altura = altura;
		this.vacinas = vacinas;
	}

	public Animal() {

	}

	/**
	 * Gets e Sets dos atributos da classe Animal.
	 */
      

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public int getIdadeDono() {
		return idadeDono;
	}

	public void setIdadeDono(int idadeDono) {
		this.idadeDono = idadeDono;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdadePet() {
		return idade;
	}

	public void setIdadePet(int idade) {
		this.idade = idade;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public ArrayList<Vacina> getVacinas() {
		return vacinas;
	}

	public void setVacinas(ArrayList<Vacina> vacinas) {
		this.vacinas = vacinas;
	}

	/*
	 * public String toString() { // toString para imprimir os dados do animal
	 * return "ANIMAL\n" + "O animal " + nome + " é um(a) " + especie +
	 * " de gênero " + genero + ", da raça "+ raca + " com porte de " + altura +
	 * " de altura e" + " com " + idade + " anos de idade."; }
	 */

}