package br.com.edu.trabalhofinal.forms;
import javax.swing.*;
import java.awt.*;

public class TelaInicial extends JFrame {

    public TelaInicial() {
        // Define o título da janela
        setTitle("Tela Inicial");

        // Define o tamanho da janela
        setSize(400, 300);

        // Centraliza a janela no meio da tela
        setLocationRelativeTo(null);

        // Define que ao fechar a janela, o programa será encerrado
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Cria um painel para colocar os botões
        JPanel painelBotoes = new JPanel(new GridLayout(2, 1, 10, 10));

        // Cria os botões
        JButton btnCadastroUsuario = new JButton("Cadastro de Usuário");
        JButton btnCadastroSmartphone = new JButton("Cadastro de Smartphone");

        // Define o tamanho dos botões
        btnCadastroUsuario.setPreferredSize(new Dimension(200, 80));
        btnCadastroSmartphone.setPreferredSize(new Dimension(200, 80));

        // Adiciona os botões ao painel
        painelBotoes.add(btnCadastroUsuario);
        painelBotoes.add(btnCadastroSmartphone);

        // Adiciona o painel à janela
        getContentPane().add(painelBotoes, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Cria a janela e a torna visível
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
    }
}
