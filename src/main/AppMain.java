package main;

import classes.Aluno;

import javax.swing.*;

public class AppMain {

    public static void main(String[] args) {

        /*Entrada de Dados com JOptionPane*/

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno: ");
        String idade = JOptionPane.showInputDialog("Qual a idade do aluno: ");
        String nota1 = JOptionPane.showInputDialog("Qual a nota 1 do aluno: ");
        String nota2 = JOptionPane.showInputDialog("Qual a nota 2 do aluno: ");
        String nota3 = JOptionPane.showInputDialog("Qual a nota 3 do aluno: ");
        String nota4 = JOptionPane.showInputDialog("Qual a nota 4 do aluno: ");

        /*new aluno é uma instancia, ou criação de um objeto*/
        /*aluno1 é uma referencia para o objeto aluno*/
        Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));
        aluno1.setNota1(Double.parseDouble(nota1));
        aluno1.setNota2(Double.parseDouble(nota2));
        aluno1.setNota3(Double.parseDouble(nota3));
        aluno1.setNota4(Double.parseDouble(nota4));

        System.out.println("Nome do Aluno: " + aluno1.getNome());
        System.out.println("Idade do Aluno: " + aluno1.getIdade());
        System.out.println("Calculo Média Nota: " + aluno1.getMediaNota());
        System.out.println("Resultado da Aprovação: " + aluno1.getAprovado());
    }
}
