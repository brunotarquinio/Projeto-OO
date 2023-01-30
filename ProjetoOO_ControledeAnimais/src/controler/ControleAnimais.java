package controler;

import java.util.ArrayList;

import models.*;

/**
 * Classe ControleAnimais e responsavel por gerenciar os dados da classe Animal.
 * @author bruno e luis
 * @since 2023
 * @version 1.3
 */

public class ControleAnimais {
	private ArrayList<Animal> animais;
	private int qtdAnimais;
	
	
	public ControleAnimais(ControleDados dados){
		this.animais = dados.getAnimais();
		this.qtdAnimais = dados.getQtdAnimais();
	}
	
	public ArrayList<Animal> getAnimais() {
        return animais;
    }
	
	 public void setAnimais(ArrayList<Animal> animais) {
	        this.animais = animais;
	    }
	 
	 public int getQtdAnimais() {
			return qtdAnimais;
		}
		
	public void setQtdAnimais(int qtdAnimais) {
			this.qtdAnimais = qtdAnimais;
		}
	
	public String[] getNomeAnimais() {
        String[] nomesAnimais = new String[qtdAnimais];
        for (int i = 0; i < qtdAnimais; i++) {
            nomesAnimais[i] = animais.get(i).getNome();
        }
        return nomesAnimais;
    } 
	
	public String getNomeAnimal(int i) {
	        if(animais.get(i).getNome() == null)
	            return "Animal não encontrado";
	        else
	            return animais.get(i).getNome();
	    }
	
		public String[] getVacinasAnimal(int i) {

			int qtdVacinasAnimal = animais.get(i).getVacinas().size();
			String[] vacinas = new String[qtdVacinasAnimal];

			for (int j = 0; j < qtdVacinasAnimal; j++) {
				vacinas[j] = animais.get(i).getVacinas().get(j).getTipoVacina();
			}
			return vacinas;
		}

		public String[] getVacinas() {
			String[] vacinas = new String[animais.size()];
			for (int i = 0; i <= animais.size(); i++) {
				if (animais.get(i).getVacinas() == null) {
					return vacinas;
				} else {
					vacinas[i] = animais.get(i).getVacinas().get(i).getTipoVacina();
				}
			}
			return vacinas;
		}
	
	public String nomeDono(int i) {
		return animais.get(i).getNomeDono();
	}
	
	public int getIdadeDono(int i) {
		return animais.get(i).getIdadeDono();
	}
	
	public String getNomePet(int i) {		
		return animais.get(i).getNome();
	}
	
	public String getEspecie(int i) {		
		return animais.get(i).getEspecie();
	}	
	
	public String getRaca(int i) {		
		return animais.get(i).getRaca();
	}	
	
	public String getGenero(int i) {		
		return animais.get(i).getGenero();
	}	
	
	public int getIdadePet(int i) {
		return animais.get(i).getIdadePet();
	}
	
	public String getAltura(int i) {
		return animais.get(i).getAltura();
	}
}