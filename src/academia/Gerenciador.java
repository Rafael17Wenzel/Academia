package academia;

import model.Aluno;

public class Gerenciador {

    private static Aluno[] alunos;

    public static void inserir(Aluno a) {
        //adicionar tamanho
        adicionarTamanho();
        //inserir aluno
        alunos[alunos.length - 1] = a;
        //incrementar quantidade de alunos criados
        Aluno.quantidadeDeAlunosCriados++;
        //adicionar id para o aluno
        a.setId(Aluno.quantidadeDeAlunosCriados);
        System.out.println(alunos[0]);
        System.out.println(alunos[1]);
        
       

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
