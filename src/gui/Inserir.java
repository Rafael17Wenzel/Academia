package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import academia.Gerenciador;
import model.Aluno;

public class Inserir extends JFrame {
    private JTextField nomeField;
    private JTextField rgField;
    private JTextField cpfField;
    private JComboBox<String> planoComboBox;
    private JCheckBox matriculadoCheckBox;
    private JButton cadastrarButton;

    public Inserir() {
        setTitle("Cadastro de Aluno");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Painel para os campos do formulário
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Campos do formulário
        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();
        JLabel rgLabel = new JLabel("RG:");
        rgField = new JTextField();
        JLabel cpfLabel = new JLabel("CPF:");
        cpfField = new JTextField();
        JLabel planoLabel = new JLabel("Plano:");
        planoComboBox = new JComboBox<>(new String[]{"Plano A", "Plano B", "Plano C"});
        JLabel matriculadoLabel = new JLabel("Matriculado:");
        matriculadoCheckBox = new JCheckBox();
        formPanel.add(nomeLabel);
        formPanel.add(nomeField);
        formPanel.add(rgLabel);
        formPanel.add(rgField);
        formPanel.add(cpfLabel);
        formPanel.add(cpfField);
        formPanel.add(planoLabel);
        formPanel.add(planoComboBox);
        formPanel.add(matriculadoLabel);
        formPanel.add(matriculadoCheckBox);

        // Botão de cadastro
        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(e -> cadastrarAluno());
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(cadastrarButton);

        // Adicionando componentes ao JFrame
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        setVisible(true);
    }

    private void cadastrarAluno() {
        // Aqui você pode implementar a lógica para cadastrar o aluno
        String nome = nomeField.getText();
        long rg = Long.parseLong(rgField.getText());
        long cpf = Long.parseLong(cpfField.getText());
        String plano = (String) planoComboBox.getSelectedItem();
        boolean matriculado = matriculadoCheckBox.isSelected();

        Gerenciador.inserir(new Aluno(nome, rg, cpf, plano, matriculado));
        
        setVisible(false);
    }
}
