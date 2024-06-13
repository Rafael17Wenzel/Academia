package application;

import academia.Gerenciador;
import gui.Principal;
import model.Aluno;

public class Academia {

    public static void main(String[] args) {
        
       Gerenciador.inserir(new Aluno("Rafael", 21312, 123, enums.Planos.BASICO, true));
       Gerenciador.inserir(new Aluno("Guilherme", 453453, 546, enums.Planos.BASICO, true));
       Gerenciador.inserir(new Aluno("Patrick", 21312, 7898, enums.Planos.BASICO, true));

        
        Principal.main();
    }

}
