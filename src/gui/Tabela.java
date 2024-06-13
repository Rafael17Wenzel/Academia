package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTable;

public class Tabela extends JFrame {
    
    
    public Tabela() {
        setTitle("Cadastro de Aluno");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        
        // Criando o modelo
        TabelaModel tabelaModel = new TabelaModel();
        
        // Criando a tabela
        JTable tabela = new JTable(tabelaModel);
        
        add(tabela);
        
        setVisible(true);
        
    }
    
}
