package br.com.edu.trabalhofinal.forms;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaListagem extends JFrame {

	private JButton btnNovoUsuario;
	private JTextField txtPesquisa;
	private JTable tblUsuarios;
	private DefaultTableModel modeloTabela;

	public TelaListagem() {

		super("Listagem de Usuários");

		// Criação dos componentes
		JLabel lblTitulo = new JLabel("Listagem de Usuários");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));

		btnNovoUsuario = new JButton("Novo Usuário");
		btnNovoUsuario.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				abrirFormularioCadastroUsuario();
			}
		});

		JLabel lblPesquisa = new JLabel("Pesquisar:");
		txtPesquisa = new JTextField(20);
		txtPesquisa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				atualizarTabela();
			}
		});

		modeloTabela = new DefaultTableModel();
		modeloTabela.addColumn("Nome");
		modeloTabela.addColumn("CPF");
		modeloTabela.addColumn("E-mail");

		tblUsuarios = new JTable(modeloTabela);

		JScrollPane scrollPane = new JScrollPane(tblUsuarios);

		// Adição dos componentes ao painel
		JPanel painel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.anchor = GridBagConstraints.CENTER;
		painel.add(lblTitulo, gbc);

		gbc.gridy = 1;
		painel.add(btnNovoUsuario, gbc);

		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		painel.add(lblPesquisa, gbc);

		gbc.gridx = 1;
		painel.add(txtPesquisa, gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		painel.add(scrollPane, gbc);

		// Configurações da janela
		setContentPane(painel);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		atualizarTabela();
	}

	private void abrirFormularioCadastroUsuario() {
		FormUsuario formulario = new FormUsuario();
		formulario.setVisible(true);
		atualizarTabela();
	}

	private void atualizarTabela() {
		modeloTabela.setRowCount(0); // limpa a tabela

		// Simula os dados dos usuários
		String[][] dados = { { "Fulano de Tal", "111.111.111-11", "fulano@example.com" },
				{ "Ciclano de Tal", "222.222.222-22", "ciclano@example.com" },
				{ "Beltrano de Tal", "333.333.333-33", "beltrano@example.com" } };

		for (String[] linha : dados) {
			String nome = linha[0];
			String cpf = linha[1];
			String email = linha[2];

			if (txtPesquisa.getText().isEmpty() || nome.toLowerCase().contains(txtPesquisa.getText().toLowerCase())) {

			}

		}
	}
}
