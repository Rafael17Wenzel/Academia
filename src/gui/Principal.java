package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Principal extends JFrame {

    public Principal() {
        // Definindo o título da janela
        setTitle("Academia Wenzel");

        // Definindo o tamanho da janela
        setSize(500, 300);

        // Definindo o layout (layout padrão é BorderLayout)
        setLayout(new FlowLayout());

        // Centralizando a janela na tela
        setLocationRelativeTo(null);

        // Criando um rótulo
        JLabel label = new JLabel("Bem vindo ao sistema de academia Wenzel!");

        // criando painel para botôes 
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        // Criando botões
        JButton btnInserir = new JButton("Inserir");
        JButton btnAtualizar = new JButton("Atualizar");
        JButton btnDeletar = new JButton("Deletar");

        // Adicionando um ouvinte de evento ao botão "Inserir"
        btnInserir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // abrir janela inserir
                // TODO
            }
        });

        // Adicionando um ouvinte de evento ao botão "Atualizar"
        btnAtualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // abrir janela Atualizar
                // TODO
            }
        });

        // Adicionando um ouvinte de evento ao botão "Deletar"
        btnAtualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // abrir janela Deletar
                // TODO
            }
        });

        // adicionando botões no painel de botões
        buttonPanel.add(btnInserir);
        buttonPanel.add(btnAtualizar);
        buttonPanel.add(btnDeletar);

        // Adicionando os itens na janela
        add(label);
        add(buttonPanel);

        // Tornando a janela visível
        setVisible(true);

        // Configurando a ação padrão para fechar a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
