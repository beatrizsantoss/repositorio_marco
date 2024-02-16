package primeiro_exemplo;

import primeiro_exemplo.modelos.Pessoa;

public class Hello { 
    public static void main(String[] args) {
        int cont = 16022024;
        String nome = "Etec";
        System.out.println("Bom Dia!!!");

        System.out.println(cont + " : " + nome);
        
        Pessoa p1 = new Pessoa(); 

        p1.nome = "Beatriz";
        p1.idade = 17 ;

        System.out.println(p1.nome + ":" + p1.idade); 

        Pessoa p2 = new Pessoa(); 
        p2.nome = "Jose Felipe";
        p2.idade = 21 ;

        System.out.println(p2.nome + ":" + p2.idade); 
        System.out.println(p1.nome + ":"); 

    } 
}