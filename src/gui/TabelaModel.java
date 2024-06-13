package gui;

import academia.Gerenciador;
import javax.swing.JLabel;
import javax.swing.table.AbstractTableModel;
import model.Aluno;

public class TabelaModel extends AbstractTableModel {
    private final String[] columnNames = {"ID", "Nome", "RG", "CPF", "Plano", "Matriculado"};
    private Aluno[] alunos;

    public TabelaModel() {
        this.alunos = Gerenciador.ler();
    }

    @Override
    public int getRowCount() {
        // Se o array de alunos for nulo ou vazio, retorna 0
        if (alunos == null || alunos.length == 0) {
            return 0;
        }
        return alunos.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        // Verifica se o array de alunos é vazio ou nulo
        if (alunos == null || alunos.length == 0) {
            return null;
        }
        Aluno aluno = alunos[row];
        if(aluno == null) {
            return null;
        }
        switch (col) {
            case 0:
                return aluno.getId();
            case 1:
                return aluno.getNome();
            case 2:
                return aluno.getRg();
            case 3:
                return aluno.getCpf();
            case 4:
                return aluno.getPlano();
            case 5:
                return aluno.isMatriculado();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    // Se você quiser permitir a edição de células, implemente os métodos abaixo:
    @Override
    public boolean isCellEditable(int row, int col) {
        // Defina quais células podem ser editadas (se necessário)
        return false; // Por exemplo, retorne true para permitir a edição
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        // Atualize os dados conforme necessário (se necessário)
        // Por exemplo, atualize o array de alunos com os novos valores
        fireTableCellUpdated(row, col);
    }
}
