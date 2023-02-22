package br.com.edu.trabalhofinal.forms;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormUsuario extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel lblNome, lblCPF, lblEmail;
	
	private JTextField txtNome, txtCPF, txtEmail;
	
	private JButton btnSalvar;

	public FormUsuario() {

		super("Cadastro de Usuário");

		// Criação dos componentes
		lblNome = new JLabel("Nome:");
		txtNome = new JTextField(20);

		lblCPF = new JLabel("CPF:");
		txtCPF = new JTextField(14);

		lblEmail = new JLabel("Email:");
		txtEmail = new JTextField(30);

		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				salvarDados();
			}
		});

		// Adição dos componentes ao painel
		JPanel painel = new JPanel(new GridLayout(4, 2));
		painel.add(lblNome);
		painel.add(txtNome);
		painel.add(lblCPF);
		painel.add(txtCPF);
		painel.add(lblEmail);
		painel.add(txtEmail);
		painel.add(btnSalvar);

		// Configurações da janela
		setContentPane(painel);
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void salvarDados() {

		// Recupera os valores dos campos
		String nome = txtNome.getText();
		String cpf = txtCPF.getText();
		String email = txtEmail.getText();

		// Faz o cadastro do usuário aqui
		// Exemplo:
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Email: " + email);

		// Limpa os campos
		txtNome.setText("");
		txtCPF.setText("");
		txtEmail.setText("");
	}

}
