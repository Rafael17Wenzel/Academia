package model;

public class Aluno {

    private int id;
    private String nome;
    private int idade;
    private long cpf;
    private String plano;
    private boolean matriculado;
    
    public Aluno(){
        
    }
    public Aluno(String nome,int idade,long cpf,String plano, boolean matriculado){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.plano = plano;
        this.matriculado = matriculado;
        
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
    public String toString(){
        return id + nome + idade + cpf + plano + matriculado;
    }

}
