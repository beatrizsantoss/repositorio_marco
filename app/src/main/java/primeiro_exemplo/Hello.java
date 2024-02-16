package primeiro_exemplo;

import primeiro_exemplo.modelos.Pessoa;

public class Hello { 
    public static void main(String[] args) {
        int cont = 10;
        String nome = "Marco";
        System.out.println("Olá Mundo!!!");

        System.out.println(cont + " : " + nome);
        
        Pessoa p1 = new Pessoa(); 

        p1.nome = "Beatriz";
        p1.idade = 17 ;

        System.out.println(p1.nome + ":" + p1.idade); 
    } 
}