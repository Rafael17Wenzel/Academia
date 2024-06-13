package academia;

import model.Aluno;
import enums.Planos;

public class Gerenciador {

    public static Aluno[] alunos;

    public static void inserir(Aluno a) {
        //adicionar tamanho
        adicionarTamanho();

        //inserir aluno
        alunos[alunos.length - 1] = a;

    }

    public static Aluno[] ler() {
        return alunos;
    }

    public static void atualizar(int id, String campo, String args) {
        switch (campo) {
            case "nome":
                pegarAluno(id).setNome(args);
                break;

            case "rg":
                pegarAluno(id).setRg(Long.parseLong(args));
                break;

            case "cpf":
                pegarAluno(id).setCpf(Long.parseLong(args));
                break;

            case "plano":
                int p = Integer.parseInt(args);
                if(p == 1) {
                    pegarAluno(id).setPlano(Planos.BASICO);
                } else if(p == 2) {
                    pegarAluno(id).setPlano(Planos.PLUS);
                } else if(p == 3) {
                    pegarAluno(id).setPlano(Planos.MAX);
                }
                
                break;

            case "matriculado":
                pegarAluno(id).setMatriculado(Boolean.getBoolean(args));
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
            if (a.getId() == id) {
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
