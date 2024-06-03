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
                pegarAluno(id).setPlano(args);
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

    private static Aluno pegarAluno(int id) {
        for (Aluno a : alunos) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    private static int pegarIndiceAluno(int id) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].getId() == id) {
                return i;

            }

        }

        return -1;

    }

    public static void arrumarArray() {
        //verificar se array é nulo

        if (alunos[0] == null) {
            return;

        }
        //salvar array original 
        Aluno[] antigoArray = alunos;
        // contar nulos 
        int nulos = 0;
        for (Aluno a : alunos) {
            if (a == null) {
                nulos++;
            }

        }
        alunos = new Aluno[antigoArray.length - nulos];
        int j = 0;

        for (int i = 0; i < antigoArray.length; i++) {
            if (alunos[j] != null) {
                alunos[j] = antigoArray[i];

            } else {
                i++;
            }

            j++;
        }

    }

}
