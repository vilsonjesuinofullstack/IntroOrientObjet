package main;

import classes.Aluno;

public class AppMain {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Pedro", 28);

        System.out.println("Nome do Aluno: " + aluno1.nome);
        System.out.println("Idade do Aluno: " + aluno1.idade);
    }
}
