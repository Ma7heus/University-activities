package br.com.edu.trabalhofinal;

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	public class CadastroCelular extends JFrame implements ActionListener {

		private static final long serialVersionUID = 1L;
		// Campos do formulário
	    private JLabel numeroLabel, usuarioLabel, modeloLabel;
	    private JTextField numeroField, usuarioField, modeloField;

	    // Botões de ação
	    private JButton salvarButton, editarButton;

	    public CadastroCelular() {
	        // Configurações da janela
	        setTitle("Cadastro de Celular");
	        setSize(400, 200);
	        setLayout(new GridLayout(4, 2));

	        // Cria os campos do formulário
	        numeroLabel = new JLabel("Número:");
	        usuarioLabel = new JLabel("Usuário:");
	        modeloLabel = new JLabel("Modelo:");
	        numeroField = new JTextField();
	        usuarioField = new JTextField();
	        modeloField = new JTextField();

	        // Cria os botões de ação
	        salvarButton = new JButton("Salvar");
	        editarButton = new JButton("Editar");
	        salvarButton.addActionListener(this);
	        editarButton.addActionListener(this);

	        // Adiciona os componentes na janela
	        add(numeroLabel);
	        add(numeroField);
	        add(usuarioLabel);
	        add(usuarioField);
	        add(modeloLabel);
	        add(modeloField);
	        add(salvarButton);
	        add(editarButton);

	        // Exibe a janela
	        setVisible(true);
	    }

	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == salvarButton) {
	            salvarCelular();
	        } else if (e.getSource() == editarButton) {
	            editarCelular();
	        }
	    }

	    private void salvarCelular() {
	        // Obtem os valores dos campos do formulário
	        String numero = numeroField.getText();
	        String usuario = usuarioField.getText();
	        String modelo = modeloField.getText();

	        // Salva o celular no banco de dados ou em um arquivo, por exemplo
	        // TODO: implementar a lógica de salvamento

	        // Limpa os campos do formulário
	        numeroField.setText("");
	        usuarioField.setText("");
	        modeloField.setText("");
	    }

	    private void editarCelular() {
	        // TODO: implementar a lógica de edição de celular
	    }

	    public static void main(String[] args) {
	        new CadastroCelular();
	    }
	

	
	

}
