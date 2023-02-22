package br.com.edu.trabalhofinal.forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaInicial extends JFrame {
    
	private static final long serialVersionUID = 1L;
	private JButton btnCadastro;
    
    public TelaInicial() {
        
        super("Tela Inicial");
        
        // Criação dos componentes
        JLabel lblTitulo = new JLabel("Bem-vindo à minha aplicação!");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        
        JLabel lblDescricao = new JLabel("Esta é uma aplicação de exemplo usando Swing.");
        
        btnCadastro = new JButton("Cadastro de Usuário");
        btnCadastro.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroUsuario();
            }
        });
        
        // Adição dos componentes ao painel
        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.CENTER;
        painel.add(lblTitulo, gbc);
        
        gbc.gridy = 1;
        painel.add(lblDescricao, gbc);
        
        gbc.gridy = 2;
        painel.add(btnCadastro, gbc);
        
        // Configurações da janela
        setContentPane(painel);
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void abrirCadastroUsuario() {
        FormUsuario formulario = new FormUsuario();
    }
    
    public static void main(String[] args) {
        //TelaInicial telaInicial = new TelaInicial();
        
        TelaListagem t = new TelaListagem();
    }
}
