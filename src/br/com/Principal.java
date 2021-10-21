package br.com;

import br.com.variaveis.Primitivos;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Hello World");
        String nome = "Nicholas";
        System.out.println("Hello " + nome);

        // instanciação da classe Primitivo onde contém os tipos de variáveis e seus valores
        Primitivos primitivo = new Primitivos();

        System.out.println(primitivo.inteiro);
    }


}
