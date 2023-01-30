package models;

import java.util.*;

/**
 * Classe Dados, classe da models que representa os dados dos objetos.
 * @author bruno
 * @since 2023
 * @version 1.3
 */


public class Dados {
	private ArrayList<Animal> animais = new ArrayList<Animal>();
	private int qtdAnimais = 0;
	private ArrayList<Vacina> vacinas = new ArrayList<Vacina>();
	private int qtdVacinas = 0;
	
	public void EncherDados() {
		for(int i = 0; i < 5; i++) {
			
			Vacina vacina = new Vacina("Vacina" + i, "12/10/2022" + i, "14/10/2023" + i, "local" + i, "n lote" + i, "Doses" + i);
			vacinas.add(vacina);
		}
		
		for (int i = 0; i < 5; i++) {
			Cachorro cachorro = new Cachorro("Dono" + i, i, "Cachorro" + i, "canina" + i, "raca" + i, "genero" + i, i,
					"altura" + i, "situacao Focinho" + i, vacinas);
			Coelho coelho = new Coelho("Dono" + i, i, "Coelho" + i, "roedor" + i, "raca" + i, "genero" + i, i,
					"altura" + i, "situacao Dentes" + i, vacinas);
			Gato gato = new Gato("Dono" + i, i, "Gato" + i, "felina" + i, "raca" + i, "genero" + i, i, "altura" + i,
					"Pelagem" + i, vacinas);
			
			animais.add(cachorro);
			animais.add(coelho);
			animais.add(gato);
		}
	}
	
	public ArrayList<Animal> getAnimais() {
		return animais;
	}
	
	public int getQtdAnimais() {
        qtdAnimais = this.animais.size();
        return qtdAnimais;
    }
	
	public void setQtdAnimais(int qtdAnimais) {
        this.qtdAnimais = qtdAnimais;
    }
	
	public ArrayList<Vacina> getVacinas() {
		return vacinas;
	} 	
	
	public int getQtdVacinas() {
        qtdVacinas = this.vacinas.size();
        return qtdVacinas;
    }
	
	public void setQtdVacinas(int qtdVacinas) {
        this.qtdVacinas = qtdVacinas;
    }
	
	public void adicionarAnimal(Cachorro cachorro, Coelho coelho, Gato gato) {
		this.animais.add(cachorro);
		this.animais.add(coelho);
		this.animais.add(gato);
	}
	
	public void adicionarVacina(Vacina vacina) {
		this.vacinas.add(vacina);
	}
}