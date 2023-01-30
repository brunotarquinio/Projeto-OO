package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionListener;

import controler.*;

/**
 * Classe TelaListaAnimais representa a tela que e mostrada ao Usuario apos a finalizacao de cadastro.
 * Nessa tela serao exibidos os pets e vacinas cadastrados.
 * @author bruno e luis
 * @since 2023
 * @version 1.3
 */


public class TelaListaAnimais implements ActionListener{
	private static JFrame tela;
	private static JPanel painelPerfilPet, painelPerfilVacina;
	private ControleAnimais ca;
	private ControleVacinas cv;
	private ControleDados dados;
	private int indexAnimal;
	private int indexVacina;
	private String listaAnimais;
	private JList<String> listaVacinas;
	private String[] vacinas;
	private JTextArea area;
	
	/**
	 * Definicao das propriedades globais da JFrame da tela lista de animais e
	 * implementacao do acesso aos dados dos animais e das vacinas.
	 * @param dados
	 * @param index
	 */
	
	public TelaListaAnimais(ControleDados dados, int index) {
		this.dados = dados;
		ca = new ControleAnimais(dados);
		cv = new ControleVacinas(dados);
		
		indexAnimal = index;
		indexVacina = index;
		
		tela = new JFrame("Perfil do Pet!"); 
		tela.setSize(660, 800);;
		tela.setLayout(null); 
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		painelPerfilPet();
		painelPerfilVacina();
		tituloPet();
		tituloVacina();
		btnAdicionarVacina();
		btnEditarPerfilPet();
		btnDeletarPet();
		btnDeletarVacina();
		btnEditarVacina();
		tela.setVisible(true);
	}
	/**
	 * Definicao do espaco onde serao exibidas as informacoes dos pets.
	 */
	
	public void painelPerfilPet() {
		painelPerfilPet = new JPanel();
		Border blackline = BorderFactory.createLineBorder(Color.black);
		painelPerfilPet.setBounds(185, 180, 400, 600);
		
		painelPerfilPet.setBorder(blackline);
		painelPerfilPet.setLayout(null);
		tela.add(painelPerfilPet);
		
		/**
		 * Exibicao das informacoes cadastradas do pet e 
		 * definicao de opcoes de estilo.
		 */
		
		listaAnimais = new String(ca.getAnimais().get(indexAnimal).toString());
		area = new JTextArea(listaAnimais);
		area.setBackground(new Color(0, 0, 0, 0));
		area.setOpaque(false);
		area.setFont(new Font("Times New Roman", Font.BOLD, 15));
        area.setLineWrap(true);
        area.setEditable(false);
	    area.setBounds(0, 0, 295, 330);			
		painelPerfilPet.add(area);
	}
	/**
	 * Definicao do espaco onde serao exibidas as informacoes das vacinas.
	 */
	
	public void painelPerfilVacina() {
		painelPerfilVacina = new JPanel();
		Border blackline = BorderFactory.createLineBorder(Color.black);
		painelPerfilVacina.setBounds(655, 180, 400, 600);
		
		painelPerfilVacina.setBorder(blackline);
		painelPerfilVacina.setLayout(null);
		tela.add(painelPerfilVacina);
		
		vacinas = dados.getNomeVacinas();

		listaVacinas = new JList<String>(vacinas);

		listaVacinas.setBounds(0, 0, 295, 330);
		listaVacinas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaVacinas.setBackground(new Color(0, 0, 0, 0));
		listaVacinas.setOpaque(false);
		listaVacinas.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		painelPerfilVacina.add(listaVacinas);
		
		tela.add(painelPerfilVacina);
	}
	/**
     * Adicionando o nome do pet cadastrado ao titulo do painel.
     */
	
	public void tituloPet() {
		JLabel jlabTitulo = new JLabel("PET :  " + ca.getNomePet(indexAnimal));
	    jlabTitulo.setBounds(355, 130, 400, 30);
		
		tela.add(jlabTitulo);
	}
	 /**
     * Adicionando um titulo ao painel de vacinas.
     */
	
	public void tituloVacina() {
		JLabel jlabTituloVacina = new JLabel("CARTÃO VACINA");
		jlabTituloVacina.setBounds(805, 130, 400, 30);
		
		tela.add(jlabTituloVacina);
	}
	/**
	 * Implementacao do JButton responsavel por adicionar uma vacina a lista,
	 * salvando os dados adicionados pelo Usuario.
	 */
	
	public void btnAdicionarVacina() {
		JButton btnAddVacina = new JButton("Adicionar Vacina");
		
		btnAddVacina.setActionCommand("AdicionarVacina");
		btnAddVacina.addActionListener(this);
		
		btnAddVacina.setBounds(665, 810, 130, 30);
		tela.add(btnAddVacina);
	}
	/**
	 * Implementacao do JButton responsavel por editar os dados de um pet cadastrado,
	 * salvando os dados editados pelo Usuario.
	 */
	
	public void btnEditarPerfilPet() {
		JButton btnEditarPet = new JButton("Editar Pet");
		
		btnEditarPet.setActionCommand("EditarPet");
		btnEditarPet.addActionListener(this);
		
		btnEditarPet.setBounds(270, 810, 90, 30);
		tela.add(btnEditarPet);
	}
	/**
	 * Implementacao do JButton responsavel por editar os dados de uma vacina cadastrada,
	 * salvando os dados editados pelo Usuario.
	 */
	
	public void btnEditarVacina() {
		JButton btnEditarVacina = new JButton("Editar Vacina");
		
		btnEditarVacina.setActionCommand("EditarVacina");
		btnEditarVacina.addActionListener(this);
		
		btnEditarVacina.setBounds(935, 810, 120, 30);
		tela.add(btnEditarVacina);
	}
	/**
	 * Implementacao do JButton responsavel por deletar os dados de um pet cadastrado.
	 */
	
	public void btnDeletarPet() {
		JButton deletarPet = new JButton("Deletar Pet");
		deletarPet.setBounds(380, 810, 100, 30);
		
		deletarPet.setActionCommand("DeletarPet");
		deletarPet.addActionListener(this);
		
		tela.add(deletarPet);
	}
	/**
	 * Implementacao do JButton responsavel por deletar os dados de uma vacina cadastrada.
	 */
	
	public void btnDeletarVacina() {
		JButton deletarVacina = new JButton("Deletar Vacina");
		deletarVacina.setBounds(805, 810, 120, 30);
		
		deletarVacina.setActionCommand("DeletarVacina");
		deletarVacina.addActionListener(this);
		
		tela.add(deletarVacina);
	}
	/**
	 * Eventos de acao, acionados apos haver um clique em qualquer um dos
	 * botoes declarados acima.
	 */
	
	public void actionPerformed(ActionEvent ae) {
		if ("AdicionarVacina" == ae.getActionCommand()) {		
			 new TelaCadastroVacina(dados, indexAnimal);
	         tela.dispose();
		}else if ("EditarPet" == ae.getActionCommand()) {
			 new TelaEditarPet(dados, indexAnimal);
	         tela.dispose();
		}else if("EditarVacina" == ae.getActionCommand()) {
			new TelaEditarVacina(dados, indexVacina);
			tela.dispose();
		}else if("DeletarPet" == ae.getActionCommand()) {
			boolean delete = dados.removerAnimal(indexAnimal);
		 
			/**
			 * Exibe mensagem apos a realizacao de um dos eventos declarados acima.
			 */
			if(delete){
			 JOptionPane.showMessageDialog(null, "Pet removido com sucesso!");
			 new TelaInicial(dados);
			 tela.dispose();
		 
		}else if("DeletarVacina" == ae.getActionCommand()) {
			 boolean deleteVacina = dados.removerVacina(indexVacina);
			 
			 if(deleteVacina){
			  JOptionPane.showMessageDialog(null, "Vacina removida com sucesso!");
			  new TelaListaAnimais(dados, indexAnimal);
			  tela.dispose();
			 }	 
		 }
		}
	}
}