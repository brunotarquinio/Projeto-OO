package program;

import models.*;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro cachorro = new Cachorro();
		Coelho coelho = new Coelho();
		Vacina vacina = new Vacina();
		Gato gato = new Gato();
		Vacina vacina1[] = new Vacina[] {null}; 
		
		System.out.println(cachorro);
		System.out.println(gato);
		System.out.println(coelho);
		System.out.println(vacina);
	
		cachorro.setNomeDono("Bruno");
		cachorro.setIdadeDono(20);	
		cachorro.setNome("Zezin");
		cachorro.setEspecie("Canina");
		cachorro.setIdadePet(25);
		cachorro.setRaca("Pinscher");
		cachorro.setGenero("Masculino");
		cachorro.setAltura("Alto");
		cachorro.setSituacaoFucinho("ruim");
		
		gato.setNomeDono("Bruna Griphao");
		gato.setIdadeDono(20);	
		gato.setNome("Miazinha");
		gato.setEspecie("felina");
		gato.setIdadePet(8);
		gato.setRaca("gato-de-bengala");
		gato.setGenero("Feminino");
		gato.setAltura("Baixo");
		gato.setPelagem("curta");
		
		coelho.setNomeDono("Ronaldinho");
		coelho.setIdadeDono(20);	
		coelho.setNome("Coelhito");
		coelho.setEspecie("Roedor");
		coelho.setIdadePet(8);
		coelho.setRaca("coelhin-da-Pascóa");
		coelho.setGenero("Feminino");
		coelho.setAltura("Medio");
		coelho.setSituacaoDosDentes("otima");
		
		vacina.setTipoVacina("Astrazenica");
		vacina.setDataVacina("09/12/2022");
		vacina.setDataDose("13/12/2002");
		vacina.setDoses("3");
		vacina.setLocal("Nucleo bandeirante");
		vacina.setLote("3 lote");
		
		System.out.println(cachorro);
		System.out.println(gato);
		System.out.println(coelho);
		System.out.println(vacina);
	}
}