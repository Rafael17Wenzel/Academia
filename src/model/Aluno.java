package model;

public class Aluno {

    public static int quantidadeDeAlunosCriados = 0;

    private int id;
    private String nome;
    private long rg;
    private long cpf;
    private String plano;
    private boolean matriculado;

    public Aluno() {

    }

    public Aluno(String nome, long rg, long cpf, String plano, boolean matriculado) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.plano = plano;
        this.matriculado = matriculado;

        // incrementar quantidadeDeAlunosCriados
        quantidadeDeAlunosCriados++;
        this.id = quantidadeDeAlunosCriados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    @Override
    public String toString() {
        return id + nome + rg + cpf + plano + matriculado;
    }

}
