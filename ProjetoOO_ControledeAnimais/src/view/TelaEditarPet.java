package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controler.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * Classe TelaEditarPet representa a tela mostrada ao usuario ao clicar no botao "Editar Pet".
 * Similar a tela de cadastro, essa tela permite ao Usuario editar os dados do pet.
 * @author bruno e luis
 * @since 2023
 * @version 1.3
 */

public class TelaEditarPet implements ActionListener{
	private static JFrame tela;
	private static JRadioButton canina, felina, roedor;
	private ControleDados dados;
	private int indexAnimal;
	String nomePetAntigo;
	
	JTextField TextoIdade;
	JTextField TextoIdadeAnimal;
	JTextField TextoRaca;
	JTextField TextoNome;
	JTextField TextoNomePet;
	
	JComboBox listaPorte;
	JComboBox listaGenero;
	
	String novaEspecie;
	 String novaCaracteristicaAnimal;
	
	JLabel jlabTamanhoPelagem, jlabSituacaoDentes, jlabSituacaoFocinho;
	
	JComboBox<String>listaPelagem; 
	JComboBox<String>listaSituacaoDente;
	JComboBox<String>listaSituacaoFocinho;
	
	String generos[] = {"Macho", "Fêmea", "Indefinido"};
	String porte[] = {"Alto", "Médio", "Baixo"};
	
	String pelagem[] = {"Alta", "Média", "Curta"};
	String situacaoDente[] = {"Ótima", "Média", "Ruim"};
	String situacaoFocinho[] = {"Ótimo", "Médio", "Ruim"};
	
	/**
	 * Definicao das propriedades globais da JFrame da tela de editar pet.
	 * @param dados
	 * @param index
	 */
	
	TelaEditarPet(ControleDados dados, int index){
		this.dados = dados;
		indexAnimal = index; 
		 nomePetAntigo = dados.getAnimais().get(index).getNome();
		 
		//dados.removerAnimal(indexAnimal);
		
		tela = new JFrame("Tela de editar Pet!"); 
		tela.setSize(660, 800);
		tela.setLayout(null); 
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		tela.setVisible(true); 
		
		titulo();
		construirCadastro();
	}
	/**
	 * Definicao de JLabel Titulo para a tela de editar pet.
	 */
	
	public void titulo() {
		JLabel jlabTitulo = new JLabel("EDITE SEU PET");
		jlabTitulo.setBounds(565, 185, 400, 30);
		
		tela.add(jlabTitulo); 
	}
	
	 public void construirCadastro() {
			nome();
			idade();
			nomePet();
			especie();
			raca();
			altura();
			idadeAnimal();
			genero();
			editarAnimal();	
			pelagem();
			situacaoDentes();
			situacaoFocinho();
	    }
	  /**
	   * Implementacao do JLabel e JTextField do campo Nome de Usuario na tela de edicao.
	   */
	 
	 public void nome() {
			TextoNome = new JTextField();
			JLabel jlabNome = new JLabel("Digite seu nome: ");
			
			TextoNome.setBounds(560, 250, 200, 30);
			jlabNome.setBounds(460, 250, 100, 30);
			
			tela.add(TextoNome);
			tela.add(jlabNome);
		}
	 /**
	  * Implementacao do JLabel e JTextField do campo Idade de Usuario na tela de edicao.
	  */
		
	 public void idade() {
		    TextoIdade = new JTextField();
			JLabel jlabIdade = new JLabel("Digite sua idade: ");
			
			TextoIdade.setBounds(560, 300, 50, 30);
		    jlabIdade.setBounds(460, 300, 100, 30);
		    
		    tela.add(TextoIdade);
		    tela.add(jlabIdade);
		}
	    /**
		 * Implementacao do JLabel e JTextField do campo Nome do Pet na tela de edicao.
		 */
		
	 public void nomePet() {
		    TextoNomePet = new JTextField();
			JLabel jlabNomePet = new JLabel("Nome do seu Pet: ");
			
			TextoNomePet.setBounds(560, 400, 200, 30);
			jlabNomePet.setBounds(460, 400, 110, 30);
			
			tela.add(TextoNomePet);
			tela.add(jlabNomePet);
		}
	    /**
		 * Implementacao dos 3 botoes para selecionar qual a especie do
		 * pet: canina, felina ou roedor.
		 */	
		
	 public void especie() {
			JLabel jlabEspecie = new JLabel("Selecione a espécie: ");
			canina = new JRadioButton("Canina");
			felina = new JRadioButton("Felina");
			roedor = new JRadioButton("Roedor");
			
			canina.setBounds(580, 600, 65, 30);
			felina.setBounds(650, 600, 60, 30);
			roedor.setBounds(720, 600, 70, 30);
			jlabEspecie.setBounds(460, 600, 150, 30);
			
			canina.addActionListener(this);
			felina.addActionListener(this);
			roedor.addActionListener(this);
			
			tela.add(jlabEspecie);
			tela.add(canina);
			tela.add(felina);
			tela.add(roedor);
			
			ButtonGroup opcoes = new ButtonGroup();
			opcoes.add(canina);
			opcoes.add(felina);
			opcoes.add(roedor);
		}
	    /**
		 * Implementacao do JLabel e JTextField do campo Raca do Pet na tela de edicao.
		 */
		
	 public void raca() {
		    TextoRaca = new JTextField();
			JLabel jlabRaca = new JLabel("Raca: ");
			
			TextoRaca.setBounds(560, 500, 200, 30);
			jlabRaca.setBounds(460, 500, 100, 30);
		
			tela.add(jlabRaca);
			tela.add(TextoRaca);
		}
	    /**
		 * Implementacao da JComboBox responsavel pela selecao do porte do
		 * pet: Alto, Medio ou Baixo.
		 */	
		
	 public void altura() {
			JLabel  jlabAltura = new JLabel("Porte do Pet: ");
			listaPorte = new JComboBox<>(porte);
			
			listaPorte.setBounds(560,450, 200, 30);
			jlabAltura.setBounds(460, 450, 150, 30);
			
			tela.add(jlabAltura);
			tela.add(listaPorte);
		}
	    /**
		 * Implementacao do JLabel e JTextField do campo Idade do Pet na tela de edicao.
		 */	
		
	 public void idadeAnimal() {
			TextoIdadeAnimal = new JTextField();
			JLabel jlabIdadeAnimal = new JLabel("Idade do seu pet: ");
			
			TextoIdadeAnimal.setBounds(560, 550, 200, 30);
			jlabIdadeAnimal.setBounds(460, 550, 100, 30);
			
			tela.add(jlabIdadeAnimal);
			tela.add(TextoIdadeAnimal);	
		}
	    /**
		 * Implementacao da JComboBox responsavel pela selecao do genero do
		 * pet: Macho, Femea ou Indefinido.
		 */
		
	 public void genero() {
			JLabel jlabGenero = new JLabel("Gênero do Pet: ");
			listaGenero = new JComboBox<>(generos); 
			
			listaGenero.setBounds(560, 350, 200, 30);
			jlabGenero.setBounds(460, 350, 150, 30);
			
			tela.add(jlabGenero); 	
			tela.add(listaGenero);  	
		}
	    /**
		 * Implementacao do JButton responsavel por concluir a edicao dos dados do pet,
		 * salvando os informacoes adicionadas pelo Usuario.
		 */	
		
	 public void editarAnimal() {
			JButton editarAnimal = new JButton("Editar Pet");
			editarAnimal.setBounds(520, 750, 200, 40);
		
			editarAnimal.setActionCommand("EditarPet");
	        editarAnimal.addActionListener(this);
			
			tela.add(editarAnimal);
	 	}
	    /**
		 * Implementacao da JComboBox responsavel pela selecao do tamanho da pelagem do pet:
		 * Alta, Media ou Curta. Caso o Usuario selecione a opcao Felina no campo de selecao de especies.
		 */
	 
		public void pelagem() {
	        jlabTamanhoPelagem = new JLabel("Tamanho da pelagem: ");
	        jlabTamanhoPelagem.setBounds(460, 650, 150, 30);
	        jlabTamanhoPelagem.setVisible(false);
	        tela.add(jlabTamanhoPelagem);
	        
	        listaPelagem = new JComboBox<>(pelagem);	
			listaPelagem.setBounds(590, 650, 170, 30);
			listaPelagem.setVisible(false);
			tela.add(listaPelagem);
		}
		/**
		 * Implementacao da JComboBox responsavel pela selecao da situacao dos dentes do pet:
		 * Otima, Media ou Ruim. Caso o Usuario selecione a opcao Roedor no campo de selecao de especies.
		 */
		
		public void situacaoDentes() {
			jlabSituacaoDentes = new JLabel("Situação dos dentes: ");
		    jlabSituacaoDentes.setBounds(460, 650, 150, 30);
		    jlabSituacaoDentes.setVisible(false);
		    tela.add(jlabSituacaoDentes);
		        
	        listaSituacaoDente = new JComboBox<>(situacaoDente);	
	        listaSituacaoDente.setBounds(590, 650, 170, 30);
            listaSituacaoDente.setVisible(false);
			tela.add(listaSituacaoDente); 
		}
		/**
		 * Implementacao da JComboBox responsavel pela selecao da situacao do focinho do pet:
		 * Otimo, Medio ou Ruim. Caso o Usuario selecione a opcao Canina no campo de selecao de especies.
		 */
		
		public void situacaoFocinho() {
			jlabSituacaoFocinho = new JLabel("Situação do Focinho: ");
			jlabSituacaoFocinho.setBounds(460, 650, 150, 30);
			jlabSituacaoFocinho.setVisible(false);
		    tela.add(jlabSituacaoFocinho);
		        
	        listaSituacaoFocinho = new JComboBox<>(situacaoFocinho);	
	        listaSituacaoFocinho.setBounds(590, 650, 170, 30);
	        listaSituacaoFocinho.setVisible(false);
			tela.add(listaSituacaoFocinho); 
		}
		/**
		 * Evento de acao, aciona apos um clique no botao "Editar Pet".
		 * Responsavel por editar e armazenar os dados cadastrados pelo Usuario e exibi los na tela seguinte.
		 * @see editarAnimal
		 */
		
		public void actionPerformed(ActionEvent ae) {
			
			if ("EditarPet" == ae.getActionCommand()) {
				  
				/**
				  * Coleta dos dados fornecidos pelo Usuario e armazenando em variaveis
				  * do tipo Strings e inteiros.
				  */ 
				  
				  String nomeDonoNovo = TextoNome.getText();
		          int idadeDonoNovo = Integer.parseInt(TextoIdade.getText());
				  String nomePetNovo = TextoNomePet.getText();
				  String novoGenero = (String) listaGenero.getSelectedItem(); 
				  String novaRaca = TextoRaca.getText();
			      int novaIdadePet = Integer.parseInt(TextoIdadeAnimal.getText());
				  String novoPorte = (String) listaPorte.getSelectedItem(); 
				  
				  int index = dados.buscarAnimal(nomePetAntigo);
				  
				  dados.getAnimais().get(indexAnimal).setNome(nomePetNovo);
				  dados.getAnimais().get(indexAnimal).setNomeDono(nomeDonoNovo);
				  dados.getAnimais().get(indexAnimal).setIdadeDono(idadeDonoNovo);
				  dados.getAnimais().get(indexAnimal).setGenero(novoGenero);
				  dados.getAnimais().get(indexAnimal).setEspecie(novaEspecie);
				  dados.getAnimais().get(indexAnimal).setRaca(novaRaca);
				  dados.getAnimais().get(indexAnimal).setIdadePet(novaIdadePet);
				  dados.getAnimais().get(indexAnimal).setAltura(novoPorte);
				  
					new TelaListaAnimais(dados, index);  
					tela.dispose();
				}
		
			/**
			 * Definindo a visibilidade de variaveis em cada caso de selecao de especie.
			 */
			
			if(felina.isSelected() == true && canina.isSelected() == false && roedor.isSelected() == false) {
			jlabTamanhoPelagem.setVisible(true);
			listaPelagem.setVisible(true);
			
			jlabSituacaoDentes.setVisible(false);
	        listaSituacaoDente.setVisible(false);
	        jlabSituacaoFocinho.setVisible(false);
	        listaSituacaoFocinho.setVisible(false);
	        
	        novaCaracteristicaAnimal = (String) listaPelagem.getSelectedItem();
	        novaEspecie = "felina";
		}
		if(roedor.isSelected() == true && canina.isSelected() == false && felina.isSelected() == false) {
			jlabSituacaoDentes.setVisible(true);
	        listaSituacaoDente.setVisible(true);
		
	        jlabTamanhoPelagem.setVisible(false);
			listaPelagem.setVisible(false);
			jlabSituacaoFocinho.setVisible(false);
			listaSituacaoFocinho.setVisible(false);
			
			novaCaracteristicaAnimal = (String) listaSituacaoDente.getSelectedItem();
			novaEspecie= "roedor";
		}
		if(canina.isSelected() == true && roedor.isSelected() == false && felina.isSelected() == false) {
			
			jlabSituacaoFocinho.setVisible(true);
			listaSituacaoFocinho.setVisible(true);
		
	        jlabTamanhoPelagem.setVisible(false);
			listaPelagem.setVisible(false);
			jlabSituacaoDentes.setVisible(false);
	        listaSituacaoDente.setVisible(false);
	        
	        novaCaracteristicaAnimal = (String) listaSituacaoFocinho.getSelectedItem();
	        novaEspecie = "canina";
		}
    }
}