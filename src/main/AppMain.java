package main;

import classes.Aluno;

import javax.swing.*;

public class AppMain {

    public static void main(String[] args) {

        /*Entrada de Dados com JOptionPane*/

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno: ");
        String idade = JOptionPane.showInputDialog("Qual a idade do aluno: ");
        String disciplina1 = JOptionPane.showInputDialog("Qual a disciplina 1 do aluno: ");
        String nota1 = JOptionPane.showInputDialog("Qual a nota 1 do aluno: ");
        String disciplina2 = JOptionPane.showInputDialog("Qual a disciplina 2 do aluno: ");
        String nota2 = JOptionPane.showInputDialog("Qual a nota 2 do aluno: ");
        String disciplina3 = JOptionPane.showInputDialog("Qual a disciplina 3 do aluno: ");
        String nota3 = JOptionPane.showInputDialog("Qual a nota 3 do aluno: ");
        String disciplina4 = JOptionPane.showInputDialog("Qual a disciplina 4 do aluno: ");
        String nota4 = JOptionPane.showInputDialog("Qual a nota 4 do aluno: ");

        /*new aluno é uma instancia, ou criação de um objeto*/
        /*aluno1 é uma referencia para o objeto aluno*/
        Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));
        aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
        aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
        aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
        aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));


        aluno1.getDisciplina().setDisciplina1(disciplina1);
        aluno1.getDisciplina().setDisciplina2(disciplina2);
        aluno1.getDisciplina().setDisciplina3(disciplina3);
        aluno1.getDisciplina().setDisciplina4(disciplina4);


        System.out.println(aluno1);
        System.out.println("Calculo Média Nota: " + aluno1.getMediaNota());
        System.out.println("Resultado da Aprovação: " + aluno1.getAprovado());
    }
}
