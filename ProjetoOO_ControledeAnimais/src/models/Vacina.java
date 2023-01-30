package models;

/**
 * Classe Vacina
 * Declaracao dos atributos da classe Vacina
 * @author bruno e luis
 * @since 2023
 * @version 1.3
 */

public class Vacina { 
	private String tipoVacina;
	private String dataVacina;
	private String dataDose;
	private String local;
	private String lote;
	private String doses;

	/**
	 * Construtor que recebe os atributos.
	 * @param tipoVacina
	 * @param dataVacina
	 * @param dataDose
	 * @param local
	 * @param lote
	 * @param doses
	 */
	
	public Vacina(String tipoVacina, String dataVacina, String dataDose, String local, String lote, String doses) {
		this.tipoVacina = tipoVacina;
		this.dataVacina = dataVacina;
		this.dataDose = dataDose;
		this.local = local;
		this.lote = lote;
		this.doses = doses;
	}

	public Vacina() {

	}

	/**
	 * Gets e sets dos atributos da classe Vacina.
	 * @return String
	 */
	
	public String getTipoVacina() {
		return tipoVacina;
	}

	public void setTipoVacina(String tipoVacina) {
		this.tipoVacina = tipoVacina;
	}

	public String getDataVacina() {
		return dataVacina;
	}

	public void setDataVacina(String dataVacina) {
		this.dataVacina = dataVacina;
	}

	public String getDataDose() {
		return dataDose;
	}

	public void setDataDose(String dataDose) {
		this.dataDose = dataDose;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getDoses() {
		return doses;
	}

	public void setDoses(String doses) {
		this.doses = doses;
	}

	@Override

	public String toString() { // toString para imprimir os dados da vacina
		return "Tipo da vacina: " + tipoVacina + "\n\ndata de fabricacao da vacina: " + dataVacina
				+ "\n\ndata da dose: " + dataDose + "\n\nlocal: " + local + "\n\nlote da vacina: " + lote
				+ "\n\nnumero de doses: " + doses + "\n";
	}
}