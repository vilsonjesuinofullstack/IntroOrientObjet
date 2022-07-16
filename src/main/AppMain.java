package main;

import classes.Aluno;

public class AppMain {

    public static void main(String[] args) {

        /*new aluno é uma instancia, ou criação de um objeto*/
        /*aluno1 é uma referencia para o objeto aluno*/
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Junior");
        aluno1.setIdade(30);

        System.out.println("Nome do Aluno: " + aluno1.getNome());
        System.out.println("Idade do Aluno: " + aluno1.getIdade());
    }
}
