package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import controler.*;

import view.TelaCadastro.*;
/**
 * Classe TelaInicial representa a primeira tela a ser vista pelo Usuario ao iniciar o programa.
 * Essa tela tera as opcoes de castrar um pet ou buscar um pet.
 * @author bruno e luis
 * @since 2023
 * @version 1.3
 */

public class TelaInicial implements ActionListener{
	private static JFrame tela;
	private static JButton btnCadastrarPet, btnBuscarPet;
	private static JLabel jlabTitulo;
	JTextField TextoBuscarPet;
	private ControleDados dados;

	/**
	 * Definicao das propriedades globais da JFrame da tela inicial.
	 */
	
	TelaInicial() {
		dados = new ControleDados();
		
		tela = new JFrame("Tela Inicial!"); 
		tela.setSize(660, 800);
		tela.setLayout(null); 
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		tela.setVisible(true);
		
		titulo();
		cadastrarPet();
		buscarPet();	
	}
	
	TelaInicial(ControleDados dados) {
		this.dados = dados;
		
		tela = new JFrame("Tela Inicial!"); 
		tela.setSize(660, 800);
		tela.setLayout(null); 
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		tela.setVisible(true);
		
		titulo();
		cadastrarPet();
		buscarPet();
	}
	
	/**
	 * Definicao de JLabel Titulo para a tela inicial.
	 */
	
	    public void titulo() {
		jlabTitulo = new JLabel("TELA INICIAL");
		jlabTitulo.setBounds(565, 250, 200, 30);
		
		tela.add(jlabTitulo);
	    }
		/**
		 * Implementacao do botao de cadastrar pet na tela inicial.
		 * Ao ser clicado, o Usuario sera levado para a tela de cadastro.
		 * @see view.TelaCadastro
		 */
	
	    public void cadastrarPet() {
			btnCadastrarPet = new JButton("Cadastrar Pet");
			btnCadastrarPet.setBounds(500, 350, 200, 30);
			
			btnCadastrarPet.addActionListener(this);
			btnCadastrarPet.setActionCommand("Cadastrar Pet");
			
			tela.add(btnCadastrarPet);
		}
		
	    
	    /**
		 * Implementacao da funao Buscar Pet, exibe um JTextField e um botao para realizar a busca dos
		 * pets.
		 */
	    
	    public void buscarPet() {
	    	JLabel jlabBuscarPet = new JLabel("PESQUISE UM PET");
	    	jlabBuscarPet.setBounds(545, 510, 130, 30);
	    	
	    	TextoBuscarPet = new JTextField();
	    	TextoBuscarPet.setBounds(500, 560, 200, 30);
	    	
	    	btnBuscarPet = new JButton("Buscar Pet");
			btnBuscarPet.setBounds(500, 620, 200, 30);
			 
			btnBuscarPet.addActionListener(this); 
			btnBuscarPet.setActionCommand("Buscar Pet");
			
			tela.add(btnBuscarPet);		
			tela.add(TextoBuscarPet);
			tela.add(jlabBuscarPet);
	    }
	    
	
	public static void main(String[] a) { 
		new TelaInicial();		
	}
	/**
	 * Evento de acao, aciona apos um clique no botao "Cadastrar Pet".
	 * Responsavel por redirecionar o usuario para a tela de cadastro de pet.
	 * @see cadastrarPet
	 */
	
	public void actionPerformed(ActionEvent ae) {
		if ("Cadastrar Pet" == ae.getActionCommand()) {
            new TelaCadastro(dados);
            tela.dispose();
        /**
         * else if caso o usuario opte por buscar ao inves de cadastrar um pet.
         * Responsavel por coletar o texto inserido no campo de busca, comparar com as
         * variaveis armazenadas previamente, e retornar um resultado ao Usuario. 
         */
		
		}else if ("Buscar Pet" == ae.getActionCommand()){
        	 String NomePet = TextoBuscarPet.getText();
        	 System.out.println(NomePet);
        
            int indexAnimal = dados.buscarAnimal(NomePet);
            if(indexAnimal == -1) {
            	JOptionPane.showMessageDialog(null, "Pet não encontrado!");
            }else {
            new TelaListaAnimais(dados, indexAnimal);
            tela.dispose();  
            }
        }
      }
  }  