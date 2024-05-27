package application;

import academia.Gerenciador;
import model.Aluno;

public class Academia {
    public static void main(String[] args) {
        Gerenciador.inserir(new Aluno("Guilherme",14,4546,"ffff",true));
        Gerenciador.inserir(new Aluno("Gui",14,4546,"ffff",true));
        
        
    }
    
}
