package academia;

import model.Aluno;
import enums.Planos;

public class Gerenciador {

    private static Aluno[] alunos;

    public static void inserir(Aluno a) {
        //adicionar tamanho
        adicionarTamanho();

        //inserir aluno
        alunos[alunos.length - 1] = a;

    }

    public static Aluno[] ler() {
        return alunos;
    }

    public static void atualizar(int id, String nome, long rg, long cpf, String p, boolean matriculado) {
        pegarAluno(id).setNome(nome);
        pegarAluno(id).setRg(rg);
        pegarAluno(id).setCpf(cpf);
        pegarAluno(id).setMatriculado(matriculado);
        switch (p) {
            case "BASICO":
                pegarAluno(id).setPlano(Planos.BASICO);
                break;
        
            case "PLUS":
                pegarAluno(id).setPlano(Planos.PLUS);
                break;

            case "MAX":
                pegarAluno(id).setPlano(Planos.MAX);
                break;
                
            default:
                break;
        }
    }

    public static void deletar(int id) {
        //PROCURAR ÍNDICE DO ALUNO
        int indice = pegarIndiceAluno(id);

        //DELETAR O ALUNO
        alunos[indice] = null;

        //ARRUMAR O ARRAY
        arrumarArray();

    }

    private static void adicionarTamanho() {
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

    public static Aluno pegarAluno(int id) {
        for (Aluno a : alunos) {
            if (a.getId() == id && a != null) {
                return a;
            }
        }
        return null;
    }

    private static int pegarIndiceAluno(int id) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getId() == id) {
                return i;
            }

        }

        return -1;
    }

    public static void arrumarArray() {
        // Verificar se o array é nulo
        if (alunos[0] == null) {
            return;
        }

        // Contar elementos não nulos
        int count = 0;
        for (Aluno a : alunos) {
            if (a != null) {
                count++;
            }
        }

        // Criar novo array com tamanho apropriado
        Aluno[] novoArray = new Aluno[count];
    
        // Copiar elementos não nulos para o novo array
        int j = 0;
        for (Aluno a : alunos) {
            if (a != null) {
                novoArray[j] = a;
                j++;
            }
        }

        // Atualizar a referência do array original
        alunos = novoArray;

    }

}
