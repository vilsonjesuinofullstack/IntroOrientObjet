package main;

import classes.Aluno;
import classes.Disciplina;

import javax.swing.*;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        /*Entrada de Dados com JOptionPane*/

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno: ");
        String idade = JOptionPane.showInputDialog("Qual a idade do aluno: ");
        /*String disciplina1 = JOptionPane.showInputDialog("Qual a disciplina 1 do aluno: ");
        String nota1 = JOptionPane.showInputDialog("Qual a nota 1 do aluno: ");
        String disciplina2 = JOptionPane.showInputDialog("Qual a disciplina 2 do aluno: ");
        String nota2 = JOptionPane.showInputDialog("Qual a nota 2 do aluno: ");
        String disciplina3 = JOptionPane.showInputDialog("Qual a disciplina 3 do aluno: ");
        String nota3 = JOptionPane.showInputDialog("Qual a nota 3 do aluno: ");
        String disciplina4 = JOptionPane.showInputDialog("Qual a disciplina 4 do aluno: ");
        String nota4 = JOptionPane.showInputDialog("Qual a nota 4 do aluno: ");*/

        /*new aluno é uma instancia, ou criação de um objeto*/
        /*aluno1 é uma referencia para o objeto aluno*/
        Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));


        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Logica");
        disciplina1.setNota(85);

        aluno1.getDisciplinas().add(disciplina1);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Java");
        disciplina2.setNota(95);

        aluno1.getDisciplinas().add(disciplina2);

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("CSS");
        disciplina3.setNota(95);

        aluno1.getDisciplinas().add(disciplina3);

        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina("HTML");
        disciplina4.setNota(95);

        aluno1.getDisciplinas().add(disciplina4);


        System.out.println(aluno1);
        System.out.println("Calculo Média Nota: " + aluno1.getMediaNota());
        System.out.println("Resultado da Aprovação: " + aluno1.getAprovado());
    }
}
