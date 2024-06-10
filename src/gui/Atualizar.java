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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Aluno;

public class Atualizar extends JFrame {
    
    public Atualizar() {
        setTitle("Cadastro de Aluno");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        JPanel labelPainel = new JPanel();
        JLabel label = new JLabel("Modifique o Aluno pelo id:");
        labelPainel.add(label);
        
        
        JPanel painelDeModificacao = new JPanel();
        JComboBox<Integer> ids = new JComboBox<>();
        int[] id_array = new int[Gerenciador.ler().length];
        for(int i = 0; i < id_array.length; i++) {
            id_array[0] = Gerenciador.ler()[i].getId();
        }
        for (int id : id_array) {
            ids.addItem(id);
        }
        
        
        add(labelPainel);
        add(painelDeModificacao);
        
        
        
        setVisible(true);
        
    }
}
