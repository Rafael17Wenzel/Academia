package academia;

import model.Aluno;

public class Gerenciador {

    public static Aluno[] alunos;

    public static void inserir(Aluno a) {
        //adicionar tamanho
        adicionarTamanho();
        //inserir aluno
        alunos[alunos.length - 1] = a;
        
    }

    public static void deletar() {

    }

    public static void atualizar() {

    }

    public static void adicionarTamanho() {
        if (alunos == null) {

            alunos = new Aluno[1];

        } else {
            Aluno[] velhaLista = alunos;
            alunos = new Aluno[alunos.length + 1];
            for (int i = 0; i < velhaLista.length; i++) {
                alunos[i] = velhaLista[i];

            }
        }

    }

}
