package br.com.edu.trabalhofinal.forms;
import javax.swing.*;
import java.awt.*;

public class TelaInicial extends JFrame {

    public TelaInicial() {
        // Define o t�tulo da janela
        setTitle("Tela Inicial");

        // Define o tamanho da janela
        setSize(400, 300);

        // Centraliza a janela no meio da tela
        setLocationRelativeTo(null);

        // Define que ao fechar a janela, o programa ser� encerrado
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Cria um painel para colocar os bot�es
        JPanel painelBotoes = new JPanel(new GridLayout(2, 1, 10, 10));

        // Cria os bot�es
        JButton btnCadastroUsuario = new JButton("Cadastro de Usu�rio");
        JButton btnCadastroSmartphone = new JButton("Cadastro de Smartphone");

        // Define o tamanho dos bot�es
        btnCadastroUsuario.setPreferredSize(new Dimension(200, 80));
        btnCadastroSmartphone.setPreferredSize(new Dimension(200, 80));

        // Adiciona os bot�es ao painel
        painelBotoes.add(btnCadastroUsuario);
        painelBotoes.add(btnCadastroSmartphone);

        // Adiciona o painel � janela
        getContentPane().add(painelBotoes, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Cria a janela e a torna vis�vel
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
    }
}
