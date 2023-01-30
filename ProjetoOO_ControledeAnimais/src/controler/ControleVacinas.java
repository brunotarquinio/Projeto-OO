package controler;

import java.util.ArrayList;

import models.Animal;
import models.Vacina;

/**
 * Classe ControleVacinas e responsavel por gerenciar os dados da classe Vacina.
 * @author bruno e luis
 * @since 2023
 * @version 1.3
 */

public class ControleVacinas {
	private ArrayList<Vacina> vacinas;
	private int qtdVacinas;

	public ArrayList<Vacina> getVacinas() {
        return vacinas;
    }
	
	public void setVacinas(ArrayList<Vacina> vacinas) {
        this.vacinas = vacinas;
    }
	
	public ControleVacinas(ControleDados dados){
		this.vacinas = dados.getVacinas();
		this.qtdVacinas = dados.getQtdVacinas();
	}
	
	public String[] getNomeTipoVacinas() {
        String[] nomesVacinas = new String[qtdVacinas];
        for (int i = 0; i < qtdVacinas; i++) {
            nomesVacinas[i] = vacinas.get(i).getTipoVacina();
            }
        return nomesVacinas;
    } 
	
	public String getTipoVacina(int i) {
		 return vacinas.get(i).getTipoVacina();
	 }
	
	public String getDataVacina(int i) {
		return vacinas.get(i).getDataVacina();
	}
	
	public String getDataDose(int i) {
		return vacinas.get(i).getDataDose();
	}

	public String getLocal(int i) {
		return vacinas.get(i).getLocal();
	}
	
	public String getLote(int i) {
		return vacinas.get(i).getLote();
	}
	
	public String getDoses(int i) {
		return vacinas.get(i).getDoses();
	}
}